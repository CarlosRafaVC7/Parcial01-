package pe.edu.upeu.parcial01.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.parcial01.dao.FormapagoDao;
import pe.edu.upeu.parcial01.entity.Formapago;
import pe.edu.upeu.parcial01.service.FormapagoService;

@Service
public class FormapagoServiceImpl implements FormapagoService {

    @Autowired
    private FormapagoDao formapagoDao;

    @Override
    public Formapago create(Formapago f) {
        return formapagoDao.create(f);
    }

    @Override
    public Formapago update(Formapago f) {
        return formapagoDao.update(f);
    }

    @Override
    public void delete(Long id) {
        formapagoDao.delete(id);
    }

    @Override
    public Formapago read(Long id) {
        return formapagoDao.read(id);
    }

    @Override
    public List<Formapago> readAll() {
        return formapagoDao.readAll();
    }
}
