package com.tipocambio.project.interfaceService;

import java.util.List;
import java.util.Optional;

import com.tipocambio.project.model.Moneda;

public interface IMonedaService {
	public List<Moneda>listarMonedas();
	public Optional<Moneda> obtenerMonedaPorId(int id);
	public int guardarOActualizarMoneda(Moneda moneda);
	public void eliminarMoneda(int id);
}
