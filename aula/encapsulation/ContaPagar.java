public class ContaPagar {

    private String descricao;
    private double valor;
    private String dataVencimento;

    private boolean pago;
    private Fornecedor fornecedor;

    public void pagar() {

	if (pago) {
	   throw new IllegalArgumentException("La facture etait deja payee !");
	}
	this.pago = true;

    }

    public void cancelarPagamento() {

	if (!pago) {
	   throw new IllegalArgumentException("La facture n'etait pas payee !");
	}

	this.pago = false;
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

    public boolean isPago() {
	return pago;

    }

    public Fornecedor getFornecedor() {
	return fornecedor;

    }

    public void setDescricao(String descricao) {
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