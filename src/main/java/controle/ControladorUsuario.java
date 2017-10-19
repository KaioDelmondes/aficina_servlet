package controle;

import dados.RepositorioListaUsuario;
import entidade.user;

public class ControladorUsuario {
	
	RepositorioListaUsuario usuarios;
	
	public void inserir(String email, int senha){
		user u = new user(senha, email);
		this.usuarios.inserir(u);
	}
	
	public void listar(){
		this.usuarios.listar();
	}
	
	public user pesquisar(String email) {
		return usuarios.pesquisar(email);
	}

	public ControladorUsuario() {
		super();
		inserir("Admin", 123);
	}
}
