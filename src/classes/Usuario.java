package classes;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Usuario {

	private String user;
	private String senha;
		
	//construtores
	public Usuario(String user, String senha) {
		if (user.equals(senha)) {
	        throw new IllegalArgumentException("Usuário e senha Iguais, isso não é permitido");
	    }
		setUser(user);
		try {
			setSenha(senha);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
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
	public void setSenha(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest criptrografia = MessageDigest.getInstance("SHA-1");
		byte[] cript = criptrografia.digest(senha.getBytes("UTF-8"));
		
		StringBuffer sb = new StringBuffer();
        for (int i = 0; i < cript.length; i++) {
          sb.append(Integer.toString((cript[i] & 0xff) + 0x100, 16).substring(1));
        }
        
        String senhaCript = sb.toString();
		this.senha = senhaCript;
	}


	//to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n----------");
		builder.append("\nUsuário: ");
		builder.append(user);
		builder.append(", Senha: ");
		builder.append(senha);
		return builder.toString();
	}
	
	
}
