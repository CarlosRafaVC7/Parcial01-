package pe.edu.upeu.parcial01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.parcial01.entity.Orden;

@Repository
public interface OrdenRepository extends JpaRepository<Orden, Long> {

}
