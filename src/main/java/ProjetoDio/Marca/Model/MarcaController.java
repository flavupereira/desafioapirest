package ProjetoDio.Marca.Model;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import ProjetoDio.Marca.Entidy.Marca;
import ProjetoDio.Marca.Service.MarcaService;


@RestController
@RequestMapping
public class MarcaController {

	@Autowired
	MarcaService marcaService;

//	@GetMapping
//	public String welcome() {
//		return "Welcome to a Spring Boot REST API";
//	}

	@GetMapping("/marca")
	public List <Marca> buscarUsuarios() {
		 List lista = (List) marcaService.buscarTodos();
		 return lista;
	}

	@PostMapping("/marca")
	public void criarMarca(@RequestBody Marca marca) {
		marcaService.inserir(marca);
	}

//	@GetMapping("/{id}")
//	public void buscarUsuarioId(@PathVariable Integer id) {
//		marcaService.buscarPorId(id);
//	}

	@PutMapping("/marca")
	public void AtulizarMarca(@RequestBody Marca marca) {
		marcaService.atualizar(marca);
	}

	@DeleteMapping("/marca/{id}")
	public void deletarMarca(@PathVariable Integer id) {
		marcaService.deletar(id);
	}

}
