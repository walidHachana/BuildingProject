package entities;

	import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



	@Entity
	@Table(name = "Challenge")

	public class Challenge implements Serializable {

		private static final long serialVersionUID = 1L;
		
	private int idChallenge;
	private String designation; 
	private int year ; 
    private Categorie categorie;
    
	
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getIdChallenge() {
		return idChallenge;
	}

	public void setIdChallenge(int idChallenge) {
		this.idChallenge = idChallenge;
	}




	public String getDesignation() {
		return designation;
	}




	public void setDesignation(String designation) {
		this.designation = designation;
	}




	public int getYear() {
		return year;
	}




	public void setYear(int year) {
		this.year = year;
	}



	@ManyToOne(cascade = CascadeType.MERGE)
	public Categorie getCategorie() {
		return categorie;
	}




	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Challenge(int idChallenge, String designation, int year,
			Categorie categorie) {
		super();
		this.idChallenge = idChallenge;
		this.designation = designation;
		this.year = year;
		this.categorie = categorie;
	}

	public Challenge() {
		super();
		// TODO Auto-generated constructor stub
	}







	



	}

	
	
	
	