package application;

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
	public void retirer1(double m) {
		if(solde >m) {
			System.out.println("l'opération réussie('-')");
			double v = solde - m;
			System.out.println("votre nouveau solde : " + v);
		} else {
			System.out.println("L'opération a échoué !!!");
			System.out.println("Vous n'avez pas ce montant");
		}
		}
	
}
