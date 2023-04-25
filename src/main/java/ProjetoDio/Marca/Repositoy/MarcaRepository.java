package ProjetoDio.Marca.Repositoy;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProjetoDio.Marca.Entidy.Marca;


@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer>{

	

	

}
