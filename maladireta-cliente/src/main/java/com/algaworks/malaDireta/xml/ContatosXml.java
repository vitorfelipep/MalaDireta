package com.algaworks.malaDireta.xml;

import java.net.URL;
import java.util.List;

import com.algaworks.contato.Contato;
import com.algaworks.contato.Contatos;
import com.thoughtworks.xstream.XStream;

public class ContatosXml implements Contatos{
	
	private String nomeArquivo;
	
	public ContatosXml(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contato> todos() { //Sobre escrevo a classe contatos da contatos interface da maladireta-lib
		XStream xstream = new XStream();
		xstream.alias("contatos", List.class);
		xstream.alias("contato", Contato.class);
		
		URL arquivo = this.getClass().getResource("/"+ nomeArquivo);
		
		return (List<Contato>) xstream.fromXML(arquivo);
	}
}
