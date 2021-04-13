package classes;

public class Usuario {

	private String user;
	private String senha;
		
	//construtores
	public Usuario(String user, String senha) {
		setUser(user);
		setSenha(senha);
	}
	
	public Usuario() {
	}

	//get e set
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}


	//to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("----------");
		builder.append("\nUsuário: ");
		builder.append(user);
		builder.append(", Senha: ");
		builder.append(senha);
		return builder.toString();
	}
	
	
}
