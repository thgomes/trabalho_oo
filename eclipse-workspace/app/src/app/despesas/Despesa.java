package app.despesas;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Despesa {
    private String descricao;
    private Categoria categoria;
    private Double valor;

    public Despesa(String descricao, Categoria categoria, Double valor) {
        this.setDescricao(descricao);
        this.setCategoria(categoria);
        this.setValor(valor);
    }
	public String getDescricao() {
		return this.descricao;
    }
    public Categoria getCategoria() {
        return this.categoria;
    }
    public Double getValor() {
        return this.valor;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void salvar() {
        try {
            FileWriter fw = new FileWriter("./despesas_10_20.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(this.descricao + ";" + this.categoria.getDescricao() + ";" + this.categoria.getSubcategoria().getDescricao() + ";" + this.valor);
            pw.close();
            fw.close();

            System.out.println("\nDespesa cadastrada");

        } catch(IOException err) {
            System.out.println("\nErro de cadastro" + err);
        }
        
    }
}
