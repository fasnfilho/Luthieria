package utils;

import modelos.OrdemServico;

public class NotificacaoUtils {
	
	public static String gerarNotificacao(OrdemServico ordem) {
        return ordem.gerarMensagemNotificacao();
    }

}
