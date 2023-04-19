package com.Bolinhas.Prancheta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table
public class Carro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String placa;
	@Column
	private String data;
	@Column
	private String hora;
	@Column
	private Double preco;
	@Column 
	private String pago;
	@Column 
	private String tcarro;
	
	public Carro(int id, String placa, String data, String hora, Double preco, String pago, String carro) {
		super();
		this.id = id;
		this.placa = placa;
		this.data = data;
		this.hora = hora;
		this.preco = preco;
		this.pago = pago;
		this.tcarro = carro;
	}
	
	public Carro() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getPago() {
		return pago;
	}
	public void setPago(String pago) {
		this.pago = pago;
	}
	public String getTcarro() {
		return tcarro;
	}
	public void setTcarro(String carro) {
		this.tcarro = carro;
	}
	
	
}
