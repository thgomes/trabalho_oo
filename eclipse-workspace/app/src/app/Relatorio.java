package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Relatorio {

	private static double somarDespesas() {
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
    
    private static int contarAlunos() {
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
