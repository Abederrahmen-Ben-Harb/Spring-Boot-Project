package com.abederrahmen.voitures.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voiture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoiture;
	private String marqueVoiture;
	private Date dateArrive;
	private Date dateSortie;
	private Double prixParking;
	
	
	
	
	
	public Voiture() {
		super();
	}
	
	
	
	public Voiture(String marqueVoiture, Date dateArrive, Date dateSortie, Double prixParking) {
		super();
		this.marqueVoiture = marqueVoiture;
		this.dateArrive = dateArrive;
		this.dateSortie = dateSortie;
		this.prixParking = prixParking;
	}



	public Long getIdVoiture() {
		return idVoiture;
	}
	public void setIdVoiture(Long idVoiture) {
		this.idVoiture = idVoiture;
	}
	public String getMarqueVoiture() {
		return marqueVoiture;
	}
	public void setMarqueVoiture(String marqueVoiture) {
		this.marqueVoiture = marqueVoiture;
	}
	public Date getDateArrive() {
		return dateArrive;
	}
	public void setDateArrive(Date dateArrive) {
		this.dateArrive = dateArrive;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	public Double getPrixParking() {
		return prixParking;
	}
	public void setPrixParking(Double prixParking) {
		this.prixParking = prixParking;
	}



	@Override
	public String toString() {
		return "Voiture [idVoiture=" + idVoiture + ", marqueVoiture=" + marqueVoiture + ", dateArrive=" + dateArrive
				+ ", dateSortie=" + dateSortie + ", prixParking=" + prixParking + "]";
	}
	
	
	

}
