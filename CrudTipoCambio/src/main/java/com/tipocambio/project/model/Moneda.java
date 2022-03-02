package com.tipocambio.project.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moneda")
public class Moneda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_moneda;
	private String descripcion;
	private double valor_compra;
	private double valor_venta;
	
	public Moneda() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Moneda(int id_moneda, String descripcion, double valor_compra, double valor_venta) {
		super();
		this.id_moneda = id_moneda;
		this.descripcion = descripcion;
		this.valor_compra = valor_compra;
		this.valor_venta = valor_venta;
	}

	public int getId_moneda() {
		return id_moneda;
	}
	public void setId_moneda(int id_moneda) {
		this.id_moneda = id_moneda;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getValor_compra() {
		return valor_compra;
	}
	public void setValor_compra(double valor_compra) {
		this.valor_compra = valor_compra;
	}
	public double getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(double valor_venta) {
		this.valor_venta = valor_venta;
	}
}
