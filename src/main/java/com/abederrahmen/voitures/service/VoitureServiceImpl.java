package com.abederrahmen.voitures.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abederrahmen.voitures.entities.Voiture;
import com.abederrahmen.voitures.repos.VoitureRepository;


@Service
public class VoitureServiceImpl implements VoitureService{

	@Autowired
	VoitureRepository voitureRepository;
	
	@Override
	public Voiture saveVoiture(Voiture v) {
		return voitureRepository.save(v);
	}

	@Override
	public Voiture updateVoiture(Voiture v) {
		return voitureRepository.save(v);
	}

	@Override
	public void deleteVoiture(Voiture v) {
		voitureRepository.delete(v);
		
	}

	@Override
	public void deleteVoitureById(Long id) {
		voitureRepository.deleteById(id);
	}

	@Override
	public Voiture getVoiture(Long id) {
		return voitureRepository.findById(id).get();
	}

	@Override
	public List<Voiture> getAllVoitures() {
		return voitureRepository.findAll();
	}
	

}
