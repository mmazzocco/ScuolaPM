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
 
	public class PersonaReportAction extends JasperReportBaseAction {
		
		@Inject
		private Tab tab;

		protected Tab getTab() {
			  return tab;
			}
		
	    public Map getParameters() throws Exception  {
	        
	        Map parameters = new HashMap();
	        parameters.put("nome", getView().getValue("nome"));
	        parameters.put("cognome", getView().getValue("cognome"));
	        return parameters;
	    }
	    @Override
	    protected JRDataSource getDataSource() throws Exception { 
	    	
	    	Map[] selectedKeys =  getTab().getSelectedKeys();
	        if (selectedKeys.length == 0  ) {
	            selectedKeys =  getTab().getAllKeys();
	        }
	        Collection<Persona> entities = new ArrayList<Persona>(); 
	        for (Map keysValue: selectedKeys) { 
	            entities.add((Persona) MapFacade.findEntity("Persona", keysValue)); 
	            } 
	    	
	    	return new JRBeanCollectionDataSource(entities);
	        
	    }
	    @Override
	    protected String getJRXML() {                                                  // 5
	        return "D:/OpenXava/openxava-6.1.1/workspace/ScuolaPM/Elenco2.jrxml"; // To read from classpath
	        // return "/home/javi/Products.jrxml"; // To read from file system
	    } 
	
}
