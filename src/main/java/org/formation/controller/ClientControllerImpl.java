package org.formation.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.formation.model.Client;
import org.formation.model.Conseiller;
import org.formation.service.IServiceClient;
import org.primefaces.event.SelectEvent;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.ApplicationScope;

@Controller
@ManagedBean
@ApplicationScope
public class ClientControllerImpl implements IClientController, Serializable {

	@Resource
	IServiceClient serviceClient;
	
	private List<Client> listeClients = new ArrayList<>();
	private List<Client> listeClientsByConseiller = new ArrayList<>();
	
	private Client client;
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String createClient(Client client) throws Exception {
		serviceClient.createClient(client);
		return "listeClients";
	}

	@Override
	public String updateClient(Client client) throws Exception {
		serviceClient.updateClient(client);
		return "listeClients";
	}

	@Override
	public String deleteClientById(Long idCli) throws Exception {
		serviceClient.deleteClientById(idCli);
		return "listeClients";
	}

	@Override
	public List<Client> findAllClients() throws Exception {
		listeClients = serviceClient.findAllClients();
		return listeClients;
	}
	
	@Override
	public List<Client> findAllClientsByConseiller(Conseiller conseiller) throws Exception {
		listeClientsByConseiller = serviceClient.findAllClientsByConseiller(conseiller);
		return listeClientsByConseiller;
	}

	@Override
	public String loadClientForUpdate(Long idCli) throws Exception{
		Client client = serviceClient.findClientById(idCli);
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		Map<String, Object> sessionMap = externalContext.getSessionMap();
		sessionMap.put("cl", client);
		return "modifierClient";
	}

	@Override
	public String loadClientForInfo(Long idCli) throws Exception{
		Client client = serviceClient.findClientById(idCli);
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		Map<String, Object> sessionMap = externalContext.getSessionMap();
		sessionMap.put("cl", client);
		return "infoClient";
	}

	@Override
	public String loadClientForComptes(Long idCli) throws Exception{
		Client client = serviceClient.findClientById(idCli);
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		Map<String, Object> sessionMap = externalContext.getSessionMap();
		sessionMap.put("cl", client);
		return "listeComptesClient";
	}

	@Override
	public String loadClientForAjoutCompte(Long idCli) throws Exception{
		Client client = serviceClient.findClientById(idCli);
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		Map<String, Object> sessionMap = externalContext.getSessionMap();
		sessionMap.put("cl", client);
		return "ajouterCompte";
	}
	
	public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Informations Client");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	

}