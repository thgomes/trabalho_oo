package app;

import javax.swing.JOptionPane;

import despesas.Categoria;
import despesas.Subcategoria;

public class Republica {
	


	public static void main(String[] args) {
		Categoria telecomunicacoes= new Categoria();
		telecomunicacoes.setDescricao("telecomunicação");
		
		Categoria agua = new Categoria();
		agua.setDescricao("água");
		
		Categoria luz= new Categoria();
		luz.setDescricao("luz");
		
		Categoria residencia= new Categoria();
		residencia.setDescricao("residencia");
		
		Subcategoria internet= new Subcategoria();
		internet.setDescricao("internet");
		
		Subcategoria telefone= new Subcategoria();
		telefone.setDescricao("telefone");
		
		Subcategoria tv= new Subcategoria();
		tv.setDescricao("tv por assinatura");
		
		Subcategoria aluguel= new Subcategoria();
		aluguel.setDescricao("aluguel");
		
		
		
		String strI = JOptionPane.showInputDialog("digite aqui o número de pessoas da casa:");
		int npessoas = Integer.parseInt(strI);
	
		
		Pessoa pessoas[]= new Pessoa[npessoas];
		
		
		for(int i=0; i<npessoas;i++) {
			int j=i+1;
			pessoas[i]=new Pessoa(null,null,0);
			String strI1 = JOptionPane.showInputDialog("digite aqui o nome da pessoas da casa:"+j);
			pessoas[i].setNome(strI1);
			String strI2 = JOptionPane.showInputDialog("digite aqui o email da pessoas da casa:"+j);
			pessoas[i].setEmail(strI2);
			String strI3 = JOptionPane.showInputDialog("digite aqui o rendimento da pessoas da casa:"+j);
			float rendimentos=Float.parseFloat(strI3);
			pessoas[i].setRendimento(rendimentos);
			pessoas[i]=new Pessoa(strI1,strI2,rendimentos);
			
		
		}for(int i=0; i<npessoas;i++) {
			JOptionPane.showMessageDialog(null,pessoas[i].getNome()+" "+pessoas[i].getEmail()+" "+pessoas[i].getRendimento());
			
		}
			
	
		}
		
		
		
	
	}
	
	
	

	
	

	



