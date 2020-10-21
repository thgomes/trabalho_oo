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



}

	
	

	



