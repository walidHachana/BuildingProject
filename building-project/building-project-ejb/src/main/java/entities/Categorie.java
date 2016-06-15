package entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Categorie {
	
	private int idCategorie;


	private String nomCategorie; 
	private String description;

	


	private List<Challenge> challenges;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}





	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

	public Categorie(String nomCategorie, String description) {
		super();
		this.nomCategorie = nomCategorie;
		this.description = description;
		
		
	}

	public Categorie() {
		super();
	}

	@OneToMany(mappedBy = "categorie")
	public List<Challenge> getChallenges() {
		return challenges;
	}

	public void setChallenges(List<Challenge> Challenges) {
		this.challenges = Challenges;
	}





}
