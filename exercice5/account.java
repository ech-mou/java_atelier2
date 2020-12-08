package account;

public class account {
	private String nom;
	private String adresse;
	private double solde;
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public void afficherAccount() {
		System.out.println(nom + " a " + "(" + adresse + ")"
				+ " - infos solde " + solde + "dh");
	}
}
