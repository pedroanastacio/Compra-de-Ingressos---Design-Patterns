
package compraingressos;

public class TorcedorComum implements Torcedor{
     @Override
    public void comprarIngresso() {
        System.out.println("Exibir o anúncio do do Socio torcedor e suas vantagens");
        new TorcedorSocio().comprarIngresso();
    }
}
