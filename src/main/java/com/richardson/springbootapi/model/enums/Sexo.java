package com.richardson.springbootapi.model.enums;

public enum Sexo {
	MASCULINO("M", "Masculino"), FEMININO("F", "Feminino");

	private String sigla, descricao;

	private Sexo(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public static String toDescricao(String sigla) {

		if (sigla == null) {
			return null;
		}

		for (Sexo x : Sexo.values()) {
			if (sigla.equals(x.getSigla())) {
				return x.getDescricao();
			}
		}

		throw new IllegalArgumentException("Valor inválido para o campo sexo");
	}

	public static String toSigla(String descricao) {

		if (descricao == null) {
			return null;
		}

		for (Sexo x : Sexo.values()) {
			if (descricao.equals(x.getDescricao())) {
				return x.getSigla();
			}
		}

		throw new IllegalArgumentException("Valor inválido para o campo sexo");
	}

}
