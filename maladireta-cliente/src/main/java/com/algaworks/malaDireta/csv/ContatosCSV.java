package com.algaworks.malaDireta.csv;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

import com.algaworks.contato.Contato;
import com.algaworks.contato.Contatos;

public class ContatosCSV implements Contatos{
	
	private String nomeArquivo;
	
	public ContatosCSV(String nomeArquivo) {
		super();
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	public List<Contato> todos() {
		
		List<Contato> contatos = new ArrayList<>();
		CSVReader csvReader = null;
		
		try{
			URI uri = this.getClass().getResource("/" + nomeArquivo).toURI();
			File arqivoCsv = new File(uri);
			FileReader filereader = new FileReader(arqivoCsv);
			csvReader = new CSVReader(filereader);
			String[] nextLine;
			
			while((nextLine = csvReader.readNext()) != null){
				contatos.add(new Contato(nextLine[0].trim(), nextLine[1].trim()));
			}
		}catch(Exception e) {
			throw new RuntimeException("Erro ao ler arquivo CSV", e);
		}finally{
			try{
				csvReader.close();
				
			}catch(IOException ioe){}
		}
		
		return contatos;
	}
}
