/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.abstracao;

import GUI.PanelSucesso;
import bridge.implementacao.DestinoImp;

/**
 *
 * @author silvap
 */
public class PanelDestinoSucesso extends PanelDestino{

    public PanelDestinoSucesso(DestinoImp d){
        super.destino = d;
    }
    
    @Override
    public void setDestino(DestinoImp d) {
        super.destino = d;
    }

    @Override
    public void showResumoServico() {
       String resumo = destino.getServico();
       PanelSucesso ps = new PanelSucesso(resumo);
       this.removeAll();
       this.add(ps);
       this.validate();
       this.repaint();
    }

    @Override
    public void showDestino() {
        this.removeAll();
        this.add(destino.getPanel());
        this.validate();
        this.repaint();
    }
    
}
