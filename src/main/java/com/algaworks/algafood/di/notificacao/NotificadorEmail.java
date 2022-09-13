package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.di.modelo.Cliente;


@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {
 
	@Autowired
	private NotificadorProperties properties;
	
	@Override
	public void notificar( Cliente cliente, String mensagem) {
		
		System.out.println("HOST: " + properties.getHostServidor());
		System.out.println("PORTA: " + properties.getPortaServidor());
		
		System.out.printf("Notificando %s atraves do e-mail %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
