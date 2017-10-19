package servicos;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controle.ControladorUsuario;
import entidade.user;

public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	//ControladorUsuario controle_usuario = new ControladorUsuario();
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
		HttpSession session = req.getSession();
		String end_red;
		
		if(session.getAttribute("email") != null) {
			end_red = "principal.jsp";
		}
		else
		{
			end_red = "formulario-login.jsp";
		}
		
		resp.sendRedirect(end_red);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		String end_red;
	
		/*
		 *user usuario = controle_usuario.pesquisar(email);
		 *O uso dos controladores de usuários causou um erro que não consegui identificar, por isso 
		 *mando a versão fazendo a verificação apenas para admin 
		 */
		
		
		if(email.equals("admin") && senha.equals("123")){
			req.setAttribute("email", email);
			req.setAttribute("nome", senha);
			HttpSession sessao = req.getSession();
			sessao.setAttribute("email", email);
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
