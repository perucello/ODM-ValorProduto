package com.educaciencia.odm;

public class ResponseProduto {

	private double valorProduto;
	private String status;

	public ResponseProduto() {
		super();
	}

	public ResponseProduto(double valorProduto, String status) {
		super();
		this.valorProduto = valorProduto;
		this.status = status;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
