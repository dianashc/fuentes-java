package com.tipocambio.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tipocambio.project.interfaceService.IMonedaService;
import com.tipocambio.project.interfaces.IMoneda;
import com.tipocambio.project.model.Moneda;

@Service
public class MonedaService implements IMonedaService{

	@Autowired
	private IMoneda data;
	
	@Override
	public List<Moneda> listarMonedas() {
		return (List<Moneda>)data.findAll();
	}

	@Override
	public Optional<Moneda> obtenerMonedaPorId(int id) {
		return data.findById(id);
	}

	@Override
	public int guardarOActualizarMoneda(Moneda moneda) {
		int res=0;
		Moneda objMoneda=data.save(moneda);
		if(!objMoneda.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void eliminarMoneda(int id) {
		data.deleteById(id);
	}

}
