package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;



public class Main {

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
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
                cadastro.cadastrarPessoa();

            } else if (operacao == 2) {
                cadastro.cadastrarPessoa();

            } else if (operacao == 3) {
                calcularIgualitariamente();

            } else if (operacao == 4) {
                contarAlunos();
            }

        }
 
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

    public static void calcularIgualitariamente(){
        double valorTotal, valorPagamento;
        int qntAlunos;

        valorTotal = somarDespesas();
        qntAlunos = contarAlunos();

        valorPagamento = valorTotal / qntAlunos;

        System.out.println("\nO valor a ser pago por cada aluno: " + valorPagamento);
    }

    public static void calcularProporcional(){
        // A ser implementado
    }
		
}
	



