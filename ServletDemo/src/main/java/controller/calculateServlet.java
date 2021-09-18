package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CalculationLogic;

/**
 * Servlet implementation class calculate
 */
@WebServlet("/calculate")
public class calculateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String operator = request.getParameter("button");
		
		CalculationLogic logic = new CalculationLogic(Integer.parseInt(num1), Integer.parseInt(num2), operator);
		
		request.setAttribute("finishedCalculation", logic);

		
		getServletContext().getRequestDispatcher("/finishedCalculation.jsp").forward(request, response);
		
	}
	
}
