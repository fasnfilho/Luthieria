package repositorios;

import modelos.OrdemServico;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class RepositorioOrdensFile implements IRepositorioOrdens{

	private static final String ARQUIVO = "ordens.txt";

	@Override
	public void adicionarOrdem(OrdemServico ordem) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO, true))) {
			writer.write(ordem.toString());
			writer.newLine();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void removerOrdem(int id) {
		List<OrdemServico> ordens = listarOrdens();
		ordens.removeIf(o -> o.getId() == id);
		salvarOrdens(ordens);
		
	}

	@Override
	public OrdemServico buscarOrdem(int id) {
		return listarOrdens().stream().filter(o -> o.getId() == id).findFirst().orElse(null);
	}

	@Override
	public void atualizarOrdem(OrdemServico ordem) {
		List<OrdemServico> ordens = listarOrdens();
		for(int i = 0; i < ordens.size(); i++) {
			if(ordens.get(i).getId() == ordem.getId()) {
				ordens.set(i, ordem);
				break;
			}
		}
		
		salvarOrdens(ordens);
		
	}

	@Override
	public List<OrdemServico> listarOrdens() {
		List<OrdemServico> ordens = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))){
			String linha;
			while((linha = reader.readLine()) != null) {
				String[] partes = linha.split(";");
				int numero = Integer.parseInt(partes[0]);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return ordens;
	}
	
	 private void salvarOrdens(List<OrdemServico> ordens) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO))) {
	            for (OrdemServico ordem : ordens) {
	                writer.write(ordem.toString());
	                writer.newLine();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
	
}
