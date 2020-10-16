package com.abederrahmen.voitures.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abederrahmen.voitures.entities.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {

}
