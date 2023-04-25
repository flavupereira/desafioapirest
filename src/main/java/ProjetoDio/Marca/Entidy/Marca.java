package ProjetoDio.Marca.Entidy;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table (name = "tb_marca")
public class Marca {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
	Integer id;
    @Column (name = "marca")
	String Marca;
    
    @OneToMany(mappedBy = "marca",fetch = FetchType.LAZY )
    @JsonIgnore
    private List<Produto> produto= new ArrayList<>();
     
   
   

	public Marca(Integer id, String marca, List<Produto> produto) {
		super();
		this.id = id;
		Marca = marca;
		this.produto = produto;
	}
	
	public Marca() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Produto> getProduto() {
		return produto;
	}
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	@Override
	public String toString() {
		return "Marca [id=" + id + ", Marca=" + Marca 
				+ ", produto=" + produto + "]";
	}
    
    
    
}

