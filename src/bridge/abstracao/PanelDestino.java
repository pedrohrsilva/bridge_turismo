package bridge.abstracao;


import bridge.implementacao.DestinoImp;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author silvap
 */
public abstract class PanelDestino extends JPanel{
    protected DestinoImp destino;
    
    public abstract void showDestino();
    public abstract void setDestino(DestinoImp d);
    public abstract void showResumoServico();
    
    
    
}
