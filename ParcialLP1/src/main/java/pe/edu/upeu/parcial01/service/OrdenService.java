package pe.edu.upeu.parcial01.service;

import java.util.List;

import pe.edu.upeu.parcial01.entity.Orden;

public interface OrdenService {
	Orden create(Orden o);
    Orden update(Orden o);
    void delete(Long id);
    Orden read(Long id);
    List<Orden> readAll();
}
