package app;

import javax.swing.JOptionPane;

public class Pessoa {
protected float rendimento ;
protected  String email;
protected  String  nome;
public static int qtdpessoas; 
public Pessoa(String nome,String email, float rendimento ) {
	
	this.setEmail(email);
	this.setNome(nome);
	this.setRendimento(rendimento);
}
public float getRendimento() {
	return rendimento;
}
public void setRendimento(float rendimento) {
	this.rendimento = rendimento;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}






	 
	
	 
}
