/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compraingressos;

/**
 *
 * @author PedroH
 */
public abstract class Ingresso {
    private Ingresso proximo;
    
    public void setProximo(Ingresso proximo) {
        this.proximo = proximo;
    }
    
    public abstract Boolean liberaIngresso();
    
    public Boolean liberaEmCadeia(){
        if (liberaIngresso()==true){
            return true; 
        }else if (proximo!= null){
            return proximo.liberaEmCadeia();
        }else{
            return false;
        }
    }
}
