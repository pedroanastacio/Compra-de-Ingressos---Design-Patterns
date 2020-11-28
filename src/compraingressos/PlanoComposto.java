
package compraingressos;


public class PlanoComposto implements Plano {
    Plano plano1;
    Plano plano2;
    Plano plano3;
    Double preco;
    
    public PlanoComposto(Plano plano1, Plano plano2, Plano plano3, Double preco) {
        this.plano1 = plano1;
        this.plano2 = plano2;
        this.plano3 = plano3;
        this.preco = preco;
    } 
    
    @Override
    public String getDescricao() {
        return "Pacote comprado:" + " " +plano1.getDescricao() + " " + "," + plano2.getDescricao()
                + " " + "," + plano3.getDescricao();
    }

    @Override
    public Double getPreco() {
        return this.preco;               
    }
}
