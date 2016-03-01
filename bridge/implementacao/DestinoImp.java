package bridge.implementacao;


import javax.swing.JPanel;

/**
 * Esta classe abstrata serve de Classe Base para cada Destino ser Exibido na Janela Principal
 * Extende JPanel pois seu conteúdo será exibido em um JPANEL
 * @author silvap
 */
public interface DestinoImp{
	
	/**
         * Este método desenha o panel
         */
	public JPanel getPanel();
        /**
         * Este método retorno uma String resumindo o Serviço Escolhido, com valor e opções selecionadas
         * @return String resumo do serviço com valor e opções selecionadas
         */
	public String getServico();
        /**
         * Este método retorna o nome do Destino
         * @return 
         */
	public String getNome();
	
}
