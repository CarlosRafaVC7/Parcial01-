package pe.edu.upeu.parcial01.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.parcial01.dao.TipoordenDao;
import pe.edu.upeu.parcial01.entity.Tipoorden;
import pe.edu.upeu.parcial01.repository.TipoordenRepository;

@Component
public class TipoordenDaoImpl implements TipoordenDao {
	@Autowired
    private TipoordenRepository tipoordenRepository;

    @Override
    public Tipoorden create(Tipoorden t) {
        return tipoordenRepository.save(t);
    }

    @Override
    public Tipoorden update(Tipoorden t) {
        return tipoordenRepository.save(t);
    }

    @Override
    public void delete(Long id) {
        tipoordenRepository.deleteById(id);
    }

    @Override
    public Tipoorden read(Long id) {
        return tipoordenRepository.findById(id).orElse(null);
    }

    @Override
    public List<Tipoorden> readAll() {
        return tipoordenRepository.findAll();
    }
}
