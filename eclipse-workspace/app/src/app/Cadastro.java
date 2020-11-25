package app;

import java.util.Scanner;

import pessoas.Pessoa;

import despesas.Despesa;
import despesas.Categoria;
import despesas.Subcategoria;

public class Cadastro {
    public static void cadastrarPessoa() {
        Scanner in = new Scanner(System.in);
        String nome, email;
        double rendimento;

        System.out.println("\nNome: ");
        nome = in.nextLine();

        System.out.println("\nEmail: ");
        email = in.nextLine();

        System.out.println("\nRendimento: ");
        rendimento = in.nextDouble();
        
        Pessoa novaPessoa = new Pessoa(nome, email, rendimento);
        
        novaPessoa.salvar();
    }

	public static void cadastrarDespesa() {
        Scanner in = new Scanner(System.in);
        String descricaoDespesa, descricaoCategoria, descricaoSubcategoria;
        double valor;

        System.out.println("\nDescrição: ");
        descricaoDespesa = in.nextLine();

        System.out.println("\nCategoria: ");
        descricaoCategoria = in.nextLine();

        System.out.println("\nSubcategoria: ");
        descricaoSubcategoria = in.nextLine();

        System.out.println("\nValor: ");
        valor = in.nextDouble();

        Subcategoria novaSubcategoria = new Subcategoria(descricaoSubcategoria);
        Categoria novaCategoria = new Categoria(descricaoCategoria, novaSubcategoria);
        Despesa novaDespesa = new Despesa(descricaoDespesa, novaCategoria, valor);
        
        novaDespesa.salvar();
    }
    
}
