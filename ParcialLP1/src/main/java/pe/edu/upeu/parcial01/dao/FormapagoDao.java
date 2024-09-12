package pe.edu.upeu.parcial01.dao;

import java.util.List;

import pe.edu.upeu.parcial01.entity.Formapago;

public interface FormapagoDao {
	Formapago create(Formapago f);
    Formapago update(Formapago f);
    void delete(Long id);
    Formapago read(Long id);
    List<Formapago> readAll();
}
