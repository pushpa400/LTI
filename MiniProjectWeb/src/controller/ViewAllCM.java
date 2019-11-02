package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CM;
import service.CMDao;

/**
 * Servlet implementation class ViewAllCM
 */
public class ViewAllCM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAllCM() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<CM> plist = new CMDao().getAllCM();
		request.setAttribute("plist",plist);
		RequestDispatcher rd = request.getRequestDispatcher("ViewCM.jsp");
		rd.forward(request,response);
	}

}
