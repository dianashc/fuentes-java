package com.tipocambio.project.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tipocambio.project.model.Moneda;

@Repository
public interface IMoneda extends CrudRepository<Moneda, Integer>{

}
