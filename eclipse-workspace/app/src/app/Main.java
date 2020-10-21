package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

import pessoas.Pessoa;

import despesas.Despesa;
import despesas.Categoria;
import despesas.Subcategoria;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int operacao;
        operacao = 0;
        
        while (operacao != 5) {

            System.out.println("\nDigite o número da operação desejada\n");

            System.out.println("1 - Cadastrar uma pessoa");
            System.out.println("2 - Cadastrar uma despesa");
            System.out.println("3 - Calcular valor a ser pago igualitariamente");
            System.out.println("4 - Calcular valor a ser pago proporcionalmente");
            System.out.println("5 - Sair");


            operacao = in.nextInt();

            if (operacao == 1) {
                cadastrarPessoa();

            } else if (operacao == 2) {
                cadastrarDespesa();

            } else if (operacao == 3) {
                calcularIgualitariamente();

            } else if (operacao == 4) {
                contarAlunos();
            }

        }
 
    } 

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


		public static double somarDespesas() {

        Double soma;
        soma = 0.0;

        try {
            FileReader fr = new FileReader("despesas_10_20.txt");
            BufferedReader br = new BufferedReader(fr);

            String linha = br.readLine();
            String despesas[] = new String[4];

            while (linha != null) {
                despesas = linha.split(";");
                soma += Double.parseDouble(despesas[3]);
                linha = br.readLine();
                
                if (linha == null) {
                    break;
                }
            }

            br.close();
            fr.close();

        } catch(IOException err) {
            System.out.println("Erro na leitura " + err.getMessage());
        }

        return soma; 
    }

		public static int contarAlunos() {

        int qntAlunos = 0;

        try {
            FileReader fr = new FileReader("alunos.txt");
            BufferedReader br = new BufferedReader(fr);

            String linha = br.readLine();

            while (linha != null) {
                qntAlunos += 1;
                linha = br.readLine();
                
                if (linha == null) {
                    break;
                }   
            }

            br.close();
            fr.close();

        } catch(IOException err) {
            System.out.println("Erro na leitura " + err.getMessage());
        }

        return qntAlunos;
    }



}

	
	

	



