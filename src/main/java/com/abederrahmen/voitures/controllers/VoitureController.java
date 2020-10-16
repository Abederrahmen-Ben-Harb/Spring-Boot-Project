package com.abederrahmen.voitures.controllers;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.abederrahmen.voitures.entities.Voiture;
import com.abederrahmen.voitures.service.VoitureService;

@Controller
public class VoitureController {
	
	@Autowired
	VoitureService voituretService;
	@RequestMapping("/showCreate")
	public String showCreate()
	{
	return "addVoiture";
	}
	@RequestMapping("/saveVoiture")
	public String saveVoiture(@ModelAttribute("voiture") Voiture voiture,
	@RequestParam("date") String date,
	ModelMap modelMap) throws ParseException
	{
	//conversion de la date
	SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	Date dateArrive = dateformat.parse(String.valueOf(date)); voiture.setDateArrive(dateArrive);
	Date dateSortie = dateformat.parse(String.valueOf(date)); voiture.setDateSortie(dateSortie);
	Voiture saveVoiture = voituretService.saveVoiture(voiture);
	String msg ="voiture enregistré avec Id "+saveVoiture.getIdVoiture();
	modelMap.addAttribute("msg", msg);
	return "addVoiture";
	}
	
	
	
	@RequestMapping("/ListeVoitures")
	public String listeVoitures(ModelMap modelMap)
	{
	List<Voiture> v = VoitureService.getAllVoitures();
	modelMap.addAttribute("voitures", v);
	return "listeVoitures";
	}
	
	
	
	@RequestMapping("/supprimerVoiture")
	public String supprimerVoiture(@RequestParam("id") Long id,
	ModelMap modelMap)
	{
	VoitureService.deleteVoitureById(id);
	List<Voiture> v = VoitureService.getAllVoitures();
	modelMap.addAttribute("voiture", v);
	return "listeVoitures";
	}
	
	
	
	@RequestMapping("/modifierProduit")
	public String editerVoiture(@RequestParam("id") Long id,ModelMap modelMap)
	{
	Voiture v= VoitureService.getVoiture(id);
	modelMap.addAttribute("voiture", v);
	return "editerVoiture";
	}
	
	
	@RequestMapping("/updateVoiture")
	public String updateVoiture(@ModelAttribute("voiture") Voiture voiture,
	@RequestParam("date") String date,ModelMap modelMap) throws ParseException
	{
		//conversion de la date 
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateArrive = dateformat.parse(String.valueOf(date));
		voiture.setDateArrive(dateArrive);
		Date dateSortie = dateformat.parse(String.valueOf(date));
		voiture.setDateSortie(dateSortie);
		voitureService.updateVoiture(voiture);
		List<Voiture> v = voitureService.getAllVoitures();
		modelMap.addAttribute("voiture", v);
		return "listeVoitures";
		}
	
	
}
