package ProjetoDio.Marca.Model;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProjetoDio.Marca.Entidy.Produto;
import ProjetoDio.Marca.Service.ProdutoService;

@RestController
@RequestMapping
public class ProdutoController {

	@Autowired 
	ProdutoService produtoService;

    @PostMapping("/produto")
	public void CriaProduto(@RequestBody Produto produto) {
		produtoService.inserir(produto);
	}

	@GetMapping("/produto")
	public List<Produto> buscaProduto() {
		List lista = (List) produtoService.buscarTodos();
		 return lista;
	}

//	@GetMapping("/{id}")
//	public void buscaProdutoId(@PathVariable Integer id) {
//		produtoService.buscarPorId(id);
//	}

	@PutMapping("/produto/{id}")
	public void AtualizaProduto(@RequestBody Produto produto) {
		produtoService.atualizar(produto);
	}

	@DeleteMapping("/produto/{id}")
	public void DeletaProduto(@PathVariable Integer id) {
		produtoService.deletar(id);
	}

}
