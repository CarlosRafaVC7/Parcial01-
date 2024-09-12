package pe.edu.upeu.parcial01.service;

import java.util.List;

import pe.edu.upeu.parcial01.entity.Formapago;

public interface FormapagoService {
	Formapago create(Formapago f);
    Formapago update(Formapago f);
    void delete(Long id);
    Formapago read(Long id);
    List<Formapago> readAll();
}
