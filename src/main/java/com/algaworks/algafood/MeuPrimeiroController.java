package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.algafood.di.service.AtivacaoClienteService;
import com.algaworks.di.modelo.Cliente;

@Controller
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;	
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		Cliente Felipe = new Cliente("Felipe", "felipe@xyz.com", "8166664444");
		ativacaoClienteService.ativar(Felipe);
		
		return "Hello!";
	}

}
