package com.br.clientes.dto;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

public class Cliente {

	@Id
	private String id;
	private String nome;
	private String cpf;
	private Integer idade;
	private String sexo;
	private BigDecimal divida;

	private Cliente(Builder builder) {
		this.id = builder.id;
		this.nome = builder.nome;
		this.cpf = builder.cpf;
		this.idade = builder.idade;
		this.sexo = builder.sexo;
		this.divida = builder.divida;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public BigDecimal getDivida() {
		return divida;
	}

	public void setDivida(BigDecimal divida) {
		this.divida = divida;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private String id;
		private String nome;
		private String cpf;
		private Integer idade;
		private String sexo;
		private BigDecimal divida;

		private Builder() {
		}

		public Builder withId(String id) {
			this.id = id;
			return this;
		}

		public Builder withNome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder withCpf(String cpf) {
			this.cpf = cpf;
			return this;
		}

		public Builder withIdade(Integer idade) {
			this.idade = idade;
			return this;
		}

		public Builder withSexo(String sexo) {
			this.sexo = sexo;
			return this;
		}

		public Builder withDivida(BigDecimal divida) {
			this.divida = divida;
			return this;
		}

		public Cliente build() {
			return new Cliente(this);
		}
	}

}
