package pe.edu.upeu.parcial01.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.parcial01.dao.OrdenDao;
import pe.edu.upeu.parcial01.entity.Orden;
import pe.edu.upeu.parcial01.repository.OrdenRepository;

@Component
public class OdenDaoImpl implements OrdenDao{
	@Autowired
    private OrdenRepository ordenRepository;

    @Override
    public Orden create(Orden o) {
        return ordenRepository.save(o);
    }

    @Override
    public Orden update(Orden o) {
        return ordenRepository.save(o);
    }

    @Override
    public void delete(Long id) {
        ordenRepository.deleteById(id);
    }

    @Override
    public Orden read(Long id) {
        return ordenRepository.findById(id).orElse(null);
    }

    @Override
    public List<Orden> readAll() {
        return ordenRepository.findAll();
    }
}
