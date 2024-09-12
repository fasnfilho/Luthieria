package repositorios;

import modelos.OrdemServico;
import java.util.List;

public interface IRepositorioOrdens {
	
	void adicionarOrdem(OrdemServico ordem);
	void removerOrdem(int id);
	OrdemServico buscarOrdem(int id);
	void atualizarOrdem(OrdemServico ordem);
	List<OrdemServico> listarOrdens();
}
