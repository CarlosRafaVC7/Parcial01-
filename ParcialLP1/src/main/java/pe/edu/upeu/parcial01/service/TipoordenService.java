package pe.edu.upeu.parcial01.service;

import java.util.List;

import pe.edu.upeu.parcial01.entity.Tipoorden;

public interface TipoordenService {
	 Tipoorden create(Tipoorden t);
	    Tipoorden update(Tipoorden t);
	    void delete(Long id);
	    Tipoorden read(Long id);
	    List<Tipoorden> readAll();
}
