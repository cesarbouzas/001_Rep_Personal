package es.cesar;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DistanciaRepository extends JpaRepository<Distancia, Long> {


}