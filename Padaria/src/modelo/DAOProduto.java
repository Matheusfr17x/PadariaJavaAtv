package modelo;

import java.util.List;

public class DAOProduto {
 
    public List<Produto> getLista(){
        return Dados.listaProduto;
    }
    
     public boolean salvar(Produto obj){
        if(obj.getCodProduto()==null){
            Integer codigo = Dados.listaProduto.size() + 1;
            obj.setCodProduto(codigo);
            Dados.listaProduto.add(obj);
        }
        return true;
    }
    
    public boolean remover(Produto obj){
        Dados.listaProduto.remove(obj);
        return true;
    }
    
}
