package info;

public class info {
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

	public void afficherInfosSolde() {

		System.out.println(nom + " à " + "(" + adresse + ")"
				+ " - infos solde " + solde + "dh");
	}

	public void calculerInterer(double tauxInteret) {
		double res = solde * tauxInteret;
		System.out.println("intérêts=" + res);
	}
}

