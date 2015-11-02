package com.algaworks.malaDireta.xml;

import com.algaworks.contato.Contatos;
import com.algaworks.malaDireta.MalaDireta;

public class MalaDiretaXml extends MalaDireta{

	private String nomeArquivo;
	
	public MalaDiretaXml(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	protected Contatos criarContatos() {
		return new ContatosXml(nomeArquivo);
	}
	
}
