package com.abederrahmen.voitures;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.abederrahmen.voitures.entities.Voiture;
import com.abederrahmen.voitures.repos.VoitureRepository;

@SpringBootTest
class VoituresApplicationTests {
	@Autowired
	private VoitureRepository voitureRepository;
	@Test
	public void testCreateProduit() {
	Voiture v = new Voiture("KIA picanto",new Date(),new Date(),2200.500);
	voitureRepository.save(v);
	}
	
	
	@Test
	public void testFindVoiture()
	{ Voiture v = voitureRepository.findById(1L).get(); System.out.println(v);
	}
	
	
	
	@Test
	public void testUpdateVoiture()
	{ Voiture v = voitureRepository.findById(1L).get();
	v.setPrixParking(1000.0); voitureRepository.save(v);
	}
	
	
	@Test
	public void testDeleteVoiture(){
		voitureRepository.deleteById(1L);;
	}
	
	
	
	@Test
	public void testListerTousVoiture()
	{
	List<Voiture> voi = voitureRepository.findAll();
	for (Voiture v : voi)
	{
	System.out.println(v);
	}
	}
}
