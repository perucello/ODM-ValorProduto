package com.educaciencia.odm;

public class ExcecaoProduto {

	private double valorProduto;
	private String garantiaProduto;

	public ExcecaoProduto() {
		super();
	}

	public ExcecaoProduto(double valorProduto, String garantiaProduto) {
		super();
		this.valorProduto = valorProduto;
		this.garantiaProduto = garantiaProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public String getGarantiaProduto() {
		return garantiaProduto;
	}

	public void setGarantiaProduto(String garantiaProduto) {
		this.garantiaProduto = garantiaProduto;
	}

}
