package app.cadastros;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import app.pessoas.Pessoa;
import app.despesas.*;
import app.excecoes.*;

public class Cadastro {
	private String nome;
	private String email;
	private double rendimento;
	
	
	private String descricaoDespesa;
	private String descricaoSubcategoria;
	private String descricaoCategoria;
    private double valor;
 
    private ArrayList<Pessoa> pessoas= new ArrayList<Pessoa>();
    private ArrayList<Despesa> despesas= new ArrayList<Despesa>();
    private ArrayList<Categoria>categorias=new ArrayList<Categoria>();
    private ArrayList<Subcategoria>subcategorias=new ArrayList<Subcategoria>();
	
    public void cadastraPessoa() throws RendimentoInvalidoException, DadosPessoaisIncompletosException  {
		
		nome=  JOptionPane.showInputDialog("\nNome: ");
		// exce��o para nome nao informado
		if(nome.equals("")) {
			 throw new  DadosPessoaisIncompletosException("dados incompletos\n");
		}
		
		email= JOptionPane.showInputDialog("\nEmail: ");
		// exce��o para email nao informado
		if(email.equals("")) {
			 throw new  DadosPessoaisIncompletosException("dados incompletos\n");
		}
		 
		String rendimento1= JOptionPane.showInputDialog("\nRendimento: ");
		// exce��o para rendimento nao informado
		if(rendimento1.equals("")) {
			throw new  DadosPessoaisIncompletosException("dados incompletos\n");
		}		
		
		rendimento=Double.parseDouble(rendimento1);
			 
		 //para rendimento inv�lido negativo
        if(rendimento<0) {
        	throw new RendimentoInvalidoException("rendimento inv�lido\n");
        }
        
        Pessoa novaPessoa = new Pessoa(nome, email, rendimento);
        novaPessoa.setNome(nome);
        novaPessoa.setEmail(email);
        novaPessoa.setRendimento(rendimento);
        pessoas.add(novaPessoa);
       
        novaPessoa.salvar();
    }

	public  void cadastraDespesa() throws CategoriaNaoInformadaException, DescricaoNaoInformadaException, ValorNaoInformadoException {
       
		descricaoDespesa = JOptionPane.showInputDialog("\nDescri��o: ");
		
		// //exce��o para despesa sem descri��o
		if(descricaoDespesa.equals("")) {
			throw new DescricaoNaoInformadaException("Descri��o de despesa n�o informada");
		}
		       
        descricaoCategoria = JOptionPane.showInputDialog("\nCategoria: ");
        
      //exce��o para despesa sem categoria
      	if(descricaoCategoria.equals("")) {                	
			throw new CategoriaNaoInformadaException("Categoria n�o informada");
		}
      
        descricaoSubcategoria = JOptionPane.showInputDialog("\nSubcategoria: ");
        String valor1=JOptionPane.showInputDialog ("\nValor: ");
      //exce��o para despesa sem valor informado
        if(valor1.equals("")) {           	
       	throw new ValorNaoInformadoException("Valor n�o informado");}
             
        valor = Double.parseDouble(valor1);
         
                       
        Subcategoria novaSubcategoria = new Subcategoria(descricaoSubcategoria);
        novaSubcategoria.setDescricao(descricaoSubcategoria);
        subcategorias.add(novaSubcategoria);
        
        Categoria novaCategoria = new Categoria(descricaoCategoria,novaSubcategoria );
        novaCategoria.setDescricao(descricaoCategoria);
        novaCategoria.setSubcategoria(novaSubcategoria);
        categorias.add(novaCategoria);
        

        Despesa novaDespesa= new Despesa(descricaoDespesa,novaCategoria, valor);
        novaDespesa.setCategoria(novaCategoria);
        novaDespesa.setDescricao(descricaoDespesa);
        novaDespesa.setValor(valor);
        despesas.add(novaDespesa);
        
        novaDespesa.salvar();
    }
	
	public void imprimirCadastro() {
   	 for(int i=0;i<despesas.size();i++) {
   		
   		JOptionPane.showMessageDialog(null,"Voc� cadastrou uma despesa com a descri��o :"+despesas.get(i).getDescricao()+
   			" com a categoria: "+categorias.get(i).getDescricao()+" e subcategoria: "+subcategorias.get(i).getDescricao() +
   			" com o valor de "+despesas.get(i).getValor());
   	 	}
    }
	
	public void imprimirPessoa() {
		for(int i=0;i<pessoas.size();i++) {
			JOptionPane.showMessageDialog(null,"Voc� cadastrou o morador(a): "+pessoas.get(i).getNome()+" com o email: "+
			pessoas.get(i).getEmail()+" e rendimento de: "+ pessoas.get(i).getRendimento() );
		}
	}
}
