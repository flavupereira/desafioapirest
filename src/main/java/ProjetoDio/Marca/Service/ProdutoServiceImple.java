package ProjetoDio.Marca.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProjetoDio.Marca.Entidy.Marca;
import ProjetoDio.Marca.Entidy.Produto;
import ProjetoDio.Marca.Repositoy.ProdutoRepository;

@Service
public class ProdutoServiceImple implements ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;
	
	@Override
	public Iterable<Produto> buscarTodos() {
		List<Produto> list = produtoRepository.findAll();
		return list;
	}

	@Override
	public Produto buscarPorId(Integer id) {
		Optional<Produto> produto = produtoRepository.findById(id);
		return produto.get();
	}

	@Override
	public void inserir(Produto produto) {
		produtoRepository.save(produto);
	}

	@Override
	public void atualizar(Produto produto) {
		produtoRepository.findAll().equals(produto);
	
			produtoRepository.save(produto);
		}
		
	

	@Override
	public void deletar(Integer id) {
		produtoRepository.deleteById(id);
		
	}

	
	

}
