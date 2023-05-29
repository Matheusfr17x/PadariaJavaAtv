package modelo;

import java.util.List;

public class DAOCliente {
    
    public List<Cliente> getLista(){ // DATA ACESS OBJECT
        return Dados.listaCliente;
    }
    
     public boolean salvar(Cliente obj){
        if(obj.getCodCliente() == null){
            Integer codigo = Dados.listaCliente.size() + 1;
            obj.setCodCliente(codigo);
            Dados.listaCliente.add(obj);
        }
        return true;
    }
    
    public boolean remover(Cliente obj){
        Dados.listaCliente.remove(obj);
        return true;
    }
}
