package pe.edu.upeu.parcial01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.parcial01.entity.Almacen;

@Repository
public interface AlmacenRepository extends JpaRepository<Almacen, Long> {

}
