package modelos;

public class Instrumentos {
	
	private String nome;
	private String modelo;
	private String marca;
	private EstadoInstrumento estado;
	
	public Instrumentos(String nome, String modelo, String marca, EstadoInstrumento estado) {
		this.nome = nome;
		this.modelo = modelo;
		this.marca = marca;
		this.estado = estado;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public EstadoInstrumento getEstado() {
		return estado;
	}
	
	public void setEstado(EstadoInstrumento estado) {
		this.estado = estado;
	}
	

}
