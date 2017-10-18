package servicos;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
     * @see HttpServlet#HttpServlet()
     */	
	public LoginServlet() {
		super();
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String end_red = "formulario-login.jsp";
		resp.sendRedirect(end_red);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		String end_red;
		
		if(email.equals("admin") && senha.equals("admin")) {
			req.setAttribute("email", email);
			req.setAttribute("nome", senha);
			end_red = "principal.jsp";
			req.getRequestDispatcher(end_red).forward(req, resp);
		}
		else
		{
			end_red = "formulario-login.jsp";
			resp.sendRedirect(end_red);
		}
	}
	
	
}
