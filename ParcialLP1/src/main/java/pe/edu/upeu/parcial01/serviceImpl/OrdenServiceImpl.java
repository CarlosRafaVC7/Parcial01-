package pe.edu.upeu.parcial01.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.parcial01.dao.OrdenDao;
import pe.edu.upeu.parcial01.entity.Orden;
import pe.edu.upeu.parcial01.service.OrdenService;

@Service
public class OrdenServiceImpl implements OrdenService {

    @Autowired
    private OrdenDao ordenDao;

    @Override
    public Orden create(Orden o) {
        return ordenDao.create(o);
    }

    @Override
    public Orden update(Orden o) {
        return ordenDao.update(o);
    }

    @Override
    public void delete(Long id) {
        ordenDao.delete(id);
    }

    @Override
    public Orden read(Long id) {
        return ordenDao.read(id);
    }

    @Override
    public List<Orden> readAll() {
        return ordenDao.readAll();
    }
}

