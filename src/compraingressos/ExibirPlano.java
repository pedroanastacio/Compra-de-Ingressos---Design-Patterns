
package compraingressos;

import java.util.ArrayList;
import java.util.List;


public class ExibirPlano {
    List<Plano> itens = new ArrayList<>();
    public void addItem(Plano item){
        itens.add(item);
    }
    public void imprimePlano(){
        for(Plano p:itens){
            System.out.println(p.getDescricao()+" - "+p.getPreco());
        }
    }
}
