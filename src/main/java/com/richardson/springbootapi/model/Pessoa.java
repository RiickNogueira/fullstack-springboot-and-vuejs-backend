package com.richardson.springbootapi.model;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;

@MappedSuperclass
public abstract class Pessoa {

	@Size(min = 3, max = 150, message = "O tamanho deve ser entre 3 e 150 caracteres")
	@NotBlank(message = "O campo não pode ser vazio")
	private String nome;

	@CPF
	@NotBlank(message = "O campo não pode ser vazio")
	private String cpf;

	@Size(max = 1, message = "Informar apenas um caracter (M ou F)")
	private String sexo;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
