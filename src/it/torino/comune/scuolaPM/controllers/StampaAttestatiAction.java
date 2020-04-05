package it.torino.comune.scuolaPM.controllers;

import java.util.*;

import javax.inject.*;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.*;
 
import org.openxava.actions.*;
import org.openxava.model.*;
import org.openxava.tab.*;

import it.torino.comune.scuolaPM.model.*;
import org.openxava.util.*;
import org.openxava.validators.*;

public class StampaAttestatiAction extends JasperReportBaseAction {
	
    private Persona persona;
	
    public Map getParameters() throws Exception  {
        
        Map parameters = new HashMap();
        parameters.put("nome", getView().getValue("nome"));
        parameters.put("cognome", getView().getValue("cognome"));
        parameters.put("qualifica", getView().getValue("qualifica.sigla"));
        
        
        return parameters;
    }
    @Override
    protected JRDataSource getDataSource() throws Exception { 
    	
		JRDataSource at = new JRBeanCollectionDataSource(getPersona().getTitoliStudio());
    	//JRDataSource at = new JRBeanCollectionDataSource(getPersona().getPartecipazioniSessioniCorsi());
    	
    	return at;
        
    }
    @Override
    protected String getJRXML() {                                                  // 5
        return "D:/OpenXava/openxava-6.1.1/workspace/ScuolaPM/Attestati.jrxml"; // To read from classpath
        // return "/home/javi/Products.jrxml"; // To read from file system
    } 
    private Persona getPersona() throws Exception {
		if (persona == null) {
			String id = getView().getValueString("oid");
			persona = Persona.findByOid(id);
		}
		return persona;
    }
}
