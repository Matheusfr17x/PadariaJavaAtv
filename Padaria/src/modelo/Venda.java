package modelo;

import java.io.Serializable;
import java.util.Calendar;

public class Venda implements Serializable{
    
    private String formaPagamento;
    private Integer qntd;
    private Integer desconto;
    private Integer codVenda;
    private Calendar dataVenda;
    private Cliente cli;
    private Produto prod;
    private Fornecedor plan;
    
    public Venda() {
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Integer getQntd() {
        return qntd;
    }

    public void setQntd(Integer qntd) {
        this.qntd = qntd;
    }

    public Integer getDesconto() {
        return desconto;
    }

    public void setDesconto(Integer desconto) {
        this.desconto = desconto;
    }

    public Integer getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(Integer codVenda) {
        this.codVenda = codVenda;
    }
    
    public Calendar getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Calendar dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

    public Fornecedor getPlan() {
        return plan;
    }

    public void setPlan(Fornecedor plan) {
        this.plan = plan;
    }
    
    
    
}
