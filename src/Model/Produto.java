
package Model;


public class Produto {
    
    int id,
        quantidade;    
    String nome;
    
    public Produto(){
        
    }
    
    public Produto (String nome, int quantidade, int id){
        
        nome = this.nome;
        quantidade = this.quantidade;
        id = this.id;
        
    };
    
    public boolean validaProduto (int quantidade){
     if (quantidade <=0)   {         
        
        return false;
        
        }else{
            return true;
        }   
    }
    
//---------------------------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
//---------------------------------        
}
