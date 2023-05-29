package modelo;

import java.util.List;

public class DAOFornecedor {
    
    public List<Fornecedor> getLista(){
        return Dados.listaFornecedor;
    }
    
     public boolean salvar(Fornecedor obj){
        if(obj.getCodFornecedor()==null){
            Integer codigo = Dados.listaFornecedor.size() + 1;
            obj.setCodFornecedor(codigo);
            Dados.listaFornecedor.add(obj);
        }
        return true;
    }
    
    public boolean remover(Fornecedor obj){
        Dados.listaFornecedor.remove(obj);
        return true;
    }
    
}
