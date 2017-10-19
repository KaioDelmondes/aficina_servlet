package dados;

import java.util.ArrayList;

import entidade.user;

public class RepositorioListaUsuario{
	
	private ArrayList<user> users = new ArrayList<user>();
	
	public void inserir(user u){
		users.add(u);
	}
	
	public void listar(){
		for(user u: users){
			System.out.println("Email: " + u.getEmail());
		}
	}

	public user pesquisar(String email) {
		for(user u: users){
			if(u.getEmail().equals(email)){
				return u;
				}
		}
	return null;
	}
}
