package despesas;

public class Subcategoria {
    private String descricao;

    public Subcategoria(String descricao) {
        this.setDescricao(descricao);
    }

    public String getDescricao() {
		return descricao;
    }
    public void setDescricao(String descricao) {
		this.descricao = descricao;
    }    
}
