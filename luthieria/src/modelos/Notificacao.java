package modelos;

public class Notificacao {
	
	private String mensagem;
	
	public Notificacao(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String gerarMensagem(OrdemServico ordem) {
		return String.format("O instrumento %s, em nome do cliente %s, está $s, para %s e tem previsão de ser entregue dia %s, segundo a ordem de serviço de número %d, %s.",
				ordem.getInstrumento().getNome(),
				ordem.getCliente().getNome(),
				ordem.getTipoServico(),
				ordem.getDescricaoServico(),
				ordem.getDataEntrega().toString(),
				ordem.getId(),
				ordem.getPecas().isEmpty() ? "não necessitou de material/peças" : "está sendo utilizado novo conjunto de peças da marca XYZ");
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
