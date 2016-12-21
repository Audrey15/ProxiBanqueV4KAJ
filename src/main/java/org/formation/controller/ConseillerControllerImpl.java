package org.formation.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.formation.model.Conseiller;
import org.formation.service.IServiceConseiller;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.SessionScope;

@Controller
@ManagedBean
@SessionScope
public class ConseillerControllerImpl implements IConseillerController {

	@Resource
	IServiceConseiller serviceConseiller;

	private List<Conseiller> listeConseillers = new ArrayList<>();

	private Conseiller conseiller;

	private String login;
	private String motDePasse;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public List<Conseiller> getListeConseillers() {
		return listeConseillers;
	}

	public void setListeConseillers(List<Conseiller> listeConseillers) {
		this.listeConseillers = listeConseillers;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public String deconnection() throws Exception {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		externalContext.invalidateSession();
		externalContext.setResponseStatus(401);
		facesContext.responseComplete();
		return "/index?faces-redirect=true";
	}

	@Override
	public String createConseiller(Conseiller conseiller) throws Exception {
		serviceConseiller.createConseiller(conseiller);
		return "/views/conseiller/listeconseillers";
	}

	@Override
	public String updateConseiller(Conseiller conseiller) throws Exception {
		serviceConseiller.updateConseiller(conseiller);
		return "/views/conseiller/listeconseillers";
	}

	@Override
	public String deleteConseillerById(Long idCons) throws Exception {
		serviceConseiller.deleteConseillerById(idCons);
		return "/views/conseiller/listeconseillers";
	}

	@Override
	public List<Conseiller> findAllConseillers() throws Exception {
		listeConseillers = serviceConseiller.findAllConseiller();
		return listeConseillers;
	}

	@Override
	public void loadConseiller(Long idCons) throws Exception {
		Conseiller conseiller = serviceConseiller.findConseillerById(idCons);
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		Map<String, Object> sessionMap = externalContext.getSessionMap();
		sessionMap.put("cons", conseiller);
	}

	public String loadConseillerForInfo(Long idCons) throws Exception {
		loadConseiller(idCons);
		return "/views/conseiller/infoconseiller";
	}

	public String loadConseillerForUpdate(Long idCons) throws Exception {
		loadConseiller(idCons);
		return "/views/conseiller/modifierconseiller";
	}
}
