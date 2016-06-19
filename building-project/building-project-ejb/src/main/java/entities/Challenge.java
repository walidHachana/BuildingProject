package entities;

	import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



	@Entity

	public class Challenge implements Serializable {

		private static final long serialVersionUID = 1L;
		
	private int idChallenge;
	private String designation; 
	private int year ; 
    private String categorie;
    
	
    
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



	
	public String getCategorie() {
		return categorie;
	}




	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Challenge(int idChallenge, String designation, int year,
			String categorie) {
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

	@Override
	public String toString() {
		return "Challenge [designation=" + designation + ", year=" + year + ", categorie=" + categorie + "]";
	}







	



	}

	
	
	
	