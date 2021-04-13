package classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;




public class Funcionario extends Usuario {
	private String nome;
	private String email;
	private String dtNasc;
	
	private List<Integer> HTrabalhadas = new ArrayList<Integer>();
	private List<Float> HValor = new ArrayList<Float>();
	
	//construtores
	public Funcionario(String user, String senha, String nome, String email, String dtNasc) {
		super(user, senha);
		setNome(nome);
		setEmail(email);
		setDtNasc(dtNasc);
	}
	public Funcionario() {
		
	}
	
	
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	public String getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}

	
	//metodos
	public void CriarVetores() {
		Document doc = null;
        SAXBuilder builder = new SAXBuilder();
        try { 
            doc = builder.build("src/xmlVetores/vetor.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Element config = doc.getRootElement();
        List lista = config.getChildren("classes.Funcionario");

       
        for (Iterator iter = lista.iterator(); iter.hasNext();) {
            Element element = (Element) iter.next();
            HTrabalhadas.add(Integer.parseInt(element.getChildText("HTrabalhadas")));
            HValor.add(Float.parseFloat(element.getChildText("HValor")));
        }
	}
	
	
	//to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nNome: ");
		builder.append(nome);
		builder.append(", E-mail: ");
		builder.append(email);
		builder.append("\nData de Nascimento: ");
		builder.append(dtNasc);
		builder.append("\n----------");
		builder.append("\nVetor Horas Trabalhadas:\n");
		for (Integer integer : HTrabalhadas) {
			builder.append(" | ");
			builder.append(integer);
		}
		builder.append("\nVetor Valor Hora:\n");
		for (Float
			Float : HValor) {
			builder.append(" | ");
			builder.append(Float);
		}
		builder.append("\n----------");
		return builder.toString();
	}

	
	
	
}
