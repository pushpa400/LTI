package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CM;
import service.CMDao;

/**
 * Servlet implementation class RegisterCM
 */
public class RegisterCM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterCM() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cid = request.getParameter("cid");
		String cname = request.getParameter("cname");
		String qcategory = request.getParameter("qcategory");
		String scategory = request.getParameter("scategory");
		String edate = request.getParameter("edate");
		String party = request.getParameter("party");
		
		CM cm = new CM(cid, cname, qcategory, scategory, edate, party);
		boolean flag = new CMDao().registerProduct(cm);
		if(flag){
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
			request.setAttribute("msg","Entry is successfully added.");
			rd.forward(request, response);
		}
		else{
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
			request.setAttribute("msg","Sorry! Entry is not added.");
			rd.forward(request, response);
		}
	}

}
