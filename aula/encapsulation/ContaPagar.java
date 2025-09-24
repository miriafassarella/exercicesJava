public class ContaPagar {

    private String descricao;
    private double valor;
    private String dataVencimento;

    private boolean pago;
    private Fornecedor fornecedor;

    public void pagar() {
	this.pago = true;

    }

    public void cancelarPagamento() {
	
    }

    public String getDescricao() {
	return descricao;

    }
    public double getValor() {
	return valor;

    }

    public String getDataVencimento() {
	return dataVencimento;

    }

    public boolean getPago() {
	return pago;

    }

    public Fornecedor getFornecedor() {
	return fornecedor;

    }

    public void setDescricao(String Descricao) {
	this.descricao = descricao;

    }

    public void setValor(double valor) {

	this.valor = valor;
    }

    public void setDataVencimento(String dataVencimento) {
	this.dataVencimento = dataVencimento;

    }

    public void setPago(boolean pago) {
	this.pago = pago;

   }

    public void setFornecedor(Fornecedor fornecedor) {
	this.fornecedor = fornecedor;
    }





    
}