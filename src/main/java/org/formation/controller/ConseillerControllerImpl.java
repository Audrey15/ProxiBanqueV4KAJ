package org.formation.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.formation.model.Client;
import org.formation.model.Conseiller;
import org.formation.service.IServiceConseiller;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.ApplicationScope;

@Controller
@ManagedBean
@ApplicationScope
public class ConseillerControllerImpl implements IConseillerController {

	@Resource
	IServiceConseiller serviceConseiller;

	private List<Conseiller> listeConseillers = new ArrayList<>();

	private Conseiller conseiller;

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	@Override
	public String createConseiller(Conseiller conseiller) throws Exception {
		serviceConseiller.createConseiller(conseiller);
		return "listeConseillers";
	}

	@Override
	public String updateConseiller(Conseiller conseiller) throws Exception {
		serviceConseiller.updateConseiller(conseiller);
		return "listeConseillers";
	}

	@Override
	public String deleteConseillerById(Long idCons) throws Exception {
		serviceConseiller.deleteConseillerById(idCons);
		return "listeConseillers";
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

	@Override
	public String loadConseillerForDirecteur(Long idCons) throws Exception {
		loadConseiller(idCons);
		return "listeConseillers";
	}

	public String loadConseillerForInfo(Long idCons) throws Exception {
		loadConseiller(idCons);
		return "infoconseiller";
	}
}
