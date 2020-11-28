
package compraingressos;


public class PlanoSimples implements Plano{
    private String descricao;
    private Double preco;

    public PlanoSimples(String descricao,Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }
    
    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public Double getPreco() {
        return this.preco;
    }
}
