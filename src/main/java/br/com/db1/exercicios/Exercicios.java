package br.com.db1.exercicios;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

@ManagedBean
public class Exercicios {
	
	private Integer valor1;
	private Integer valor2;
	private Integer resposta;
	private String resposta2;
	private String palavra;
	private String estadosSul;
	
	public String getEstadosSul() {
		return estadosSul;
	}

	public void setEstadosSul(String estadosSul) {
		this.estadosSul = estadosSul;
	}

	public Integer exibirResposta(){
		return resposta;
	}
	
	public String exibirResposta2() {
		return resposta2;
	}

	public Integer getValor1() {
		return valor1;
	}

	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}

	public Integer getValor2() {
		return valor2;
	}

	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}

	public Integer getResposta() {
		return resposta;
	}

	public void setResposta(Integer resposta) {
		this.resposta = resposta;
	}
	
	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public void exibirSoma() {
		resposta = valor1 + valor2;
	}
	
	public void exibirSubtracao() {
		resposta = valor1 - valor2;
	}
	
	public void exibirDivisao() {
		resposta = valor1 / valor2;
	}
	
	public void exibirMultiplicacao() {
		resposta = valor1 * valor2;
	}
	
	public void letrasMinusculas() {
		resposta2 = palavra.toLowerCase();
	}
	
	public void letrasMaiusculas() {
		resposta2 = palavra.toUpperCase();
	}
	
	public List<SelectItem> estadosSul() {
	    List<SelectItem> estados = new ArrayList<SelectItem>();
	    estados.add(new SelectItem("PARANÁ"));
	    estados.add(new SelectItem("SANTA_CATARINA"));
	    estados.add(new SelectItem("RIO_GRANDE_DO_SUL"));
	    return estados;
	}
	
	
	
}
