
package Controler;

import Model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controler {
    
    int id, quantidade;
    String nome;
    boolean sucesso = false;
    
    public boolean validar (int quantidade){
      
        Produto prod = new Produto();
        
        return prod.validaProduto(quantidade);
    }
    
//------------------------------------------------------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
