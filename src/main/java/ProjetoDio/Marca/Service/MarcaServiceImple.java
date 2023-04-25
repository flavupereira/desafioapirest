package ProjetoDio.Marca.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProjetoDio.Marca.Entidy.Marca;
import ProjetoDio.Marca.Repositoy.MarcaRepository;

@Service
public class MarcaServiceImple implements MarcaService {
	
	@Autowired
	MarcaRepository marcaRepository;

	@Override
	public Iterable<Marca> buscarTodos() {
        List<Marca> list = marcaRepository.findAll();
		return list;
	}

	@Override
	public Marca buscarPorId(Integer id) {
		Optional<Marca> marca = marcaRepository.findById(id);
		return marca.get();
	}

	@Override
	public void inserir(Marca marca) {
		marcaRepository.save(marca);

	  
	}

	@Override
	public void atualizar(Marca marca) {
		marcaRepository.findAll().equals(marca);
		
			marcaRepository.save(marca);
		}

	

	@Override
	public void deletar(Integer id) {
		marcaRepository.deleteById(id);

	}

}
