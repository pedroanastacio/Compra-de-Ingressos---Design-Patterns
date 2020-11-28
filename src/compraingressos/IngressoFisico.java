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
 public class IngressoFisico extends Ingresso {
     @Override
    public Boolean liberaIngresso() {
        System.out.println("Liberado ingresso físico para compra");
        return true;
    }
}
