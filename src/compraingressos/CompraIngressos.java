
package compraingressos;


public class CompraIngressos {

    
    public static void main(String[] args) {
        Torcedor torcedor = new TorcedorComum();
        torcedor.comprarIngresso();
        
        Plano IngressoComum = new PlanoSimples("IngressoComum",10.0);
        Plano CartaoKids = new PlanoSimples("Cartão Kids",0.0);
        Plano IngressoPacote = new PlanoSimples("Pacote de Ingressos(temporada)",150.0);
        Plano Camarote = new PlanoSimples("Camarote",200.00);
        Plano CamisaOficial = new PlanoSimples("Camisa Oficial",200.00);
        
        Plano planoComum = new PlanoComposto(IngressoComum, CartaoKids, CamisaOficial, 180.00);
        Plano planoOuro = new PlanoComposto(CartaoKids, IngressoPacote, CamisaOficial, 300.00);
        Plano planoPremium = new PlanoComposto(IngressoPacote, Camarote, CamisaOficial, 400.00);
        
        ExibirPlano exibirPlano = new ExibirPlano();
        exibirPlano.addItem(IngressoComum);
        exibirPlano.addItem(planoComum);
        exibirPlano.imprimePlano();
    }
    
}
