package com.algaworks.malaDireta.csv;

import com.algaworks.contato.Contatos;
import com.algaworks.malaDireta.MalaDireta;

public class MalaDiretaCSV extends MalaDireta{
	
	private String nomeArquivo;
	
	public MalaDiretaCSV(String nomeArquivo) {
		super();
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	protected Contatos criarContatos() {
		return new ContatosCSV(nomeArquivo);
	}
	
	
}
