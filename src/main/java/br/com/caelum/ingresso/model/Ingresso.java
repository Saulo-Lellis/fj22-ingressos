package br.com.caelum.ingresso.model;

import java.math.BigDecimal;

import br.com.caelum.ingresso.model.descontos.Desconto;



public class Ingresso {
	private Sessao sessao;
	private Lugar lugar;
	private BigDecimal preco;
	
	public Ingresso(){
		
	}

	public Ingresso(Sessao sessao, Desconto tipoDeDesconto, Lugar lugar) {
		
		this.sessao = sessao;
		this.preco = tipoDeDesconto.aplicarDescontoSobre(sessao.getPreco());
		this.lugar = lugar;
	}
	
	
	//Getters e Setters		
	
	public Sessao getSessao() {
		return sessao;
	}

	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}

	public Lugar getLugar() {
		return lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}	
	
}
