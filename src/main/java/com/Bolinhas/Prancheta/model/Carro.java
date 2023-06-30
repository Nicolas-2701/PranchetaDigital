package com.Bolinhas.Prancheta.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table
public class Carro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column
	private String placa;
	@Column
	private LocalDate data2;
	private String data=String.valueOf(data2);
	@Column
	private String hora;
	@Column
	private String horaS;
	@Column
	private Double preco;
	@Column 
	private String pago;
	@Column 
	private String tcarro;
	@Column 
	private String obs;
	@Column
	private String contato;
	
	@PrePersist
    public void prePersist() {
        data2 = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        data= data2.format(formatter);
    }
	
	public Carro(Long id, String placa, String data, String hora, Double preco, String pago, String carro,String obs,String contato) {
		super();
		this.id = id;
		this.placa = placa;
		this.data = data;
		this.hora = hora;
		this.preco = preco;
		this.pago = pago;
		this.tcarro = carro;
		this.obs = obs;
		this.contato = contato;
	}
	
	public Carro() {
		// TODO Auto-generated constructor stub
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Long getId() {
		return id;
	}
	public LocalDate getData2() {
		return data2;
	}

	public void setData2(LocalDate data2) {
		this.data2 = data2;
	}

	public void setId(Long id) {
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

	public String getHoraS() {
		return horaS;
	}

	public void setHoraS(String horaS) {
		this.horaS = horaS;
	}
	
	
}
