package com.educaciencia.odm;

public class RequestProduto {

	private String nomeProduto;
	private String descricaoProduto;
	private String fabricanteProduto;

	public RequestProduto() {
		super();
	}

	public RequestProduto(String nomeProduto, String descricaoProduto,
			String fabricanteProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.descricaoProduto = descricaoProduto;
		this.fabricanteProduto = fabricanteProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public String getFabricanteProduto() {
		return fabricanteProduto;
	}

	public void setFabricanteProduto(String fabricanteProduto) {
		this.fabricanteProduto = fabricanteProduto;
	}

}
