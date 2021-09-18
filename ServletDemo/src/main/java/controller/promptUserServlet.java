package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class promptUserServlet
 */
@WebServlet("/promptUserServlet")
public class promptUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public promptUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String answer = request.getParameter("prompt");

		PrintWriter out = response.getWriter();
		
		
		try {
			if (answer.equals("Y") || answer.equals("y")) {
				
				getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			}
			else if (answer.equals("N") || answer.equals("n")) {
				out.println("Maybe next time! Have a great day!");
				out.println("<a href='prompt.jsp'>Main Page</a>");
			}
			else {
				out.println("The information you entered was invalid, try again");
				out.println("<a href='prompt.jsp'>Main Page</a>");
			}
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			out.println("The information you entered was invalid, try again");
			out.println("<a href='prompt.jsp'>Main Page</a>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			out.println("The information you entered was invalid, try again");
			out.println("<a href='prompt.jsp'>Main Page</a>");
		}
	}

}
