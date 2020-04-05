package it.torino.comune.scuolaPM.controllers;

import org.openxava.actions.*;

public class MiaJSPAction extends BaseAction implements INavigationAction {
	
	public void execute() throws Exception {
    }
 
    public String[] getNextControllers() {                                     // 2
        return new String [] { "Persona" } ;
    }
 
    public String getCustomView() {                                            // 3
        return "miaJsp.jsp";
    }

    public void setKeyProperty(String s) {
    	s="ciaooo!";
    }
}
