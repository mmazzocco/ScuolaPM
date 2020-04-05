package it.torino.comune.scuolaPM.controllers;

import org.openxava.actions.*;

public class PersonaProvaAction extends ViewBaseAction {
	
	public void execute() throws Exception {
		addMessage("Prova lettura dati da maschera: " + getView().getValue("qualifica.sigla")+" "+getView().getValue("nome")+" "+getView().getValue("cognome")+" ");
		//getView().clear();
	}

}
