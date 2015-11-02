package com.algaworks.malaDireta;

import java.util.List;

import com.algaworks.contato.Contato;
import com.algaworks.contato.Contatos;

public abstract class MalaDireta {
	
	protected abstract Contatos criarContatos();
	
	public boolean enviarEmail(String mensagem	){
		
		List<Contato> contatos = criarContatos().todos(); 
		
		System.out.println("Conectando ao servidor SMTP...");
		System.out.println("Mensagem a ser enviada: " + mensagem);
		System.out.println();
		
		
		
		for(Contato c: contatos){
			System.out.println("From: <vitorfelipep@gmail.com>");
			System.out.printf("To: [%s] <%s>\n", c.getNome(), c.getEmail());
			System.out.println(mensagem);
			System.out.println();
		}
		
		return true;
		
	}
}
