package app;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
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






