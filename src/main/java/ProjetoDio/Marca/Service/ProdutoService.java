package ProjetoDio.Marca.Service;

import java.util.List;

import ProjetoDio.Marca.Entidy.Produto;

public interface ProdutoService {
	
	Iterable<Produto> buscarTodos();
	Produto buscarPorId(Integer id);
	void inserir (Produto produto);
	void atualizar(Produto produto);
	void deletar (Integer id);

}
