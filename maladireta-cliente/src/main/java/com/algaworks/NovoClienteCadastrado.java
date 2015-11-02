package com.algaworks;

import javax.swing.JOptionPane;

import com.algaworks.malaDireta.MalaDireta;
import com.algaworks.malaDireta.xml.MalaDiretaXml;

public class NovoClienteCadastrado {

	public static void main(String[] args) {
		MalaDireta malaDiretaXml = new MalaDiretaXml("contatos.xml");
		
		String mensagem = JOptionPane.showInputDialog(null, "Infome a mensagem para o email!");

		//Acessa a classe-abstrata mala direta da maladireta lib o método enciar email
		boolean status = malaDiretaXml.enviarEmail(mensagem);
		
		JOptionPane.showConfirmDialog(null, "Emails enviados? " + status);
	}
}
