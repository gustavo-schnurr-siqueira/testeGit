
package listadecompras.View;

import javax.swing.JFrame;


public class ListaDeCompras {


    public static void main(String[] args) {
        
        guiLista list = new guiLista();
        list.setSize(800, 765);
        list.setVisible(true);
        list.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
