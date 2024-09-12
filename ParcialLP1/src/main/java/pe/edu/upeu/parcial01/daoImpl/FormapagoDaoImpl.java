package pe.edu.upeu.parcial01.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.parcial01.dao.FormapagoDao;
import pe.edu.upeu.parcial01.entity.Formapago;
import pe.edu.upeu.parcial01.repository.FormapagoRepository;

@Component
public class FormapagoDaoImpl implements FormapagoDao {
	@Autowired
    private FormapagoRepository formapagoRepository;

    @Override
    public Formapago create(Formapago f) {
        return formapagoRepository.save(f);
    }

    @Override
    public Formapago update(Formapago f) {
        return formapagoRepository.save(f);
    }

    @Override
    public void delete(Long id) {
        formapagoRepository.deleteById(id);
    }

    @Override
    public Formapago read(Long id) {
        return formapagoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Formapago> readAll() {
        return formapagoRepository.findAll();
    }
}
