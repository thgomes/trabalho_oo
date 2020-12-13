package app.relatorios;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import app.pessoas.Pessoa;
import app.despesas.*;


public class LeituraDados {
    private ArrayList<Pessoa> pessoas= new ArrayList<Pessoa>();

    private ArrayList<Despesa> despesas= new ArrayList<Despesa>();

    public void setPessoas() {
        String nome;
        String email;
        Double rendimento;

        String linha;
        String dados[] = new String[3];

        try {
            FileReader fr = new FileReader("alunos.txt");
            BufferedReader br = new BufferedReader(fr);

            linha = br.readLine();
            
            while (linha != null) {
                dados = linha.split(";");
                
                nome = dados[0];
                email = dados[1];
                rendimento = Double.parseDouble(dados[2]);
                
                Pessoa novaPessoa = new Pessoa(nome, email, rendimento);
                
                pessoas.add(novaPessoa);
                
                linha = br.readLine();
            }

            br.close();
            fr.close();

        } catch(IOException err) {
            System.out.println("Erro na leitura " + err.getMessage());

        }
    }
    
}
