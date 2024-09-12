package pe.edu.upeu.parcial01.service;

import java.util.List;

import pe.edu.upeu.parcial01.entity.Almacen;

public interface AlmacenService {
	Almacen create(Almacen a);
    Almacen update(Almacen a);
    void delete(Long id);
    Almacen read(Long id);
    List<Almacen> readAll();
}
