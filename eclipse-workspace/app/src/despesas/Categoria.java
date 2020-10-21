package despesas;

public class Categoria {
	
    private String descricao;
    private Subcategoria subcategoria;

    public Categoria(String descricao, Subcategoria subcategoria) {
        this.setDescricao(descricao);
        this.setSubcategoria(subcategoria);
    }
	
	public String getDescricao() {
		return descricao;
    }
    public Subcategoria getSubcategoria() {
        return subcategoria;
    }
    public void setDescricao(String descricao) {
		this.descricao = descricao;
    }
    public void setSubcategoria(Subcategoria subcategoria) {
        this.subcategoria = subcategoria;
    }
}
