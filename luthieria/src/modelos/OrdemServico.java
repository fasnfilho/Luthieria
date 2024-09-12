package modelos;

import java.util.Date;
import java.util.List;

public class OrdemServico {
	
	private int id;
	private Cliente cliente;
	private Instrumentos instrumento;
	private Date dataEntrega;
	private List<String> pecas;
	private String tipoServico;
	private String descricaoServico;
	
	public OrdemServico(int id, Cliente cliente, Instrumentos instrumento, Date dataEntrega, List<String> pecas, String tipoServico, String descricaoServico) {
		this.id = id;
		this.cliente = cliente;
		this.instrumento = instrumento;
		this.dataEntrega = dataEntrega;
		this.pecas = pecas;
		this.tipoServico = tipoServico;
		this.descricaoServico = descricaoServico;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Instrumentos getInstrumento() {
		return instrumento;
	}
	
	public void setInstrumentos(Instrumentos instrumento) {
		this.instrumento = instrumento;
	}
	
	public Date getDataEntrega() {
		return dataEntrega;
	}
	
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
	public List<String> getPecas() {
		return pecas;
	}
	
	public void setPecas(List<String> pecas) {
		this.pecas = pecas;
	}
	
	public String getTipoServico() {
		return tipoServico;
	}
	
	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}
	
	public String getDescricaoServico() {
		return descricaoServico;
	}
	
	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}
	
	public String toString() {
        return "OS #" + id + ": " + tipoServico + " - " + instrumento + " para " + cliente;
    }
	
	 public String gerarMensagemNotificacao() {
	        String partesPecas = (pecas.isEmpty()) ? "não necessitou de material/peças" : "está sendo utilizado novo(s) " + String.join(", ", pecas);
	        return String.format("O Instrumento %s, em nome do cliente %s, está %s, %s e tem previsão de ser entregue dia %s, segundo a ordem de serviço número %d, %s.",
	                instrumento.getNome(), cliente.getNome(), instrumento.getEstado().toString().toLowerCase(), tipoServico, dataEntrega, id, partesPecas);
	    }
	
	
}
