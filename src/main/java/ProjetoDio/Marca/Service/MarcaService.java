package ProjetoDio.Marca.Service;

import ProjetoDio.Marca.Entidy.Marca;

public interface MarcaService {

	Iterable<Marca> buscarTodos();
	Marca buscarPorId(Integer id);
	void atualizar(Marca marca);
	void deletar(Integer id);
	void inserir(Marca marca);

}
