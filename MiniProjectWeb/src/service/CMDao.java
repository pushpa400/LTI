package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.CM;

public class CMDao {
	
	public List<CM> getAllCM(){
		List<CM> plist=new ArrayList<CM>();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			String sql="Select * from STATEGOVTS ";
			PreparedStatement smt=connection.prepareStatement(sql);
			ResultSet rs=smt.executeQuery();
			while(rs.next()){
				CM p=new CM(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
				plist.add(p);
			}
			
			connection.close();
		}catch(Exception s){System.out.println(s);}
		
		return plist;
		}

	
	public boolean registerProduct(CM cm){
		boolean result = false;
		Connection connection=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			PreparedStatement pst=connection.prepareStatement("Insert INTO STATEGOVTS  Values(?,?,?,?,?,?)");
			pst.setString(1 , cm.getCid());
			pst.setString(2, cm.getCname());
			pst.setString(3, cm.getQcategory());
			pst.setString(4,  cm.getScategory());
			pst.setString(5, cm.getEnddate());
			pst.setString(6, cm.getParty());
			int rs = pst.executeUpdate();
			if (rs>0) 
				result=true;
		} 
		catch (Exception s)
		{
			System.out.println(s);
		}
		finally{
			
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
