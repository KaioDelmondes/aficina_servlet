package entidade;

public class user {
	
	private int senha;
	private String email;
	
	
	
	public user(int senha, String email) {
		super();
		this.senha = senha;
		this.email = email;
	}



	public int getSenha() {
		return senha;
	}



	public void setSenha(int senha) {
		this.senha = senha;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
}
