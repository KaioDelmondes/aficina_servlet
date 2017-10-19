package servicos;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Principal extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Principal(){
		super();
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		HttpSession session = req.getSession();
		
		if (session.getAttribute("email") != null){
			req.setAttribute("usuario", session.getAttribute("usuario"));
			req.getRequestDispatcher("principal.jsp").forward(req, resp);
		}else {
			resp.sendRedirect("formulario-login");
		}
	}
	
}
