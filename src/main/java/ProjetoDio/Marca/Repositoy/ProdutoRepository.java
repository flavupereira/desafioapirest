package ProjetoDio.Marca.Repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProjetoDio.Marca.Entidy.Produto;



@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
