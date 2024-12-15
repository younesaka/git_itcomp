package dz.etm.m16.act1.model;

/**
 * Représenter un carré
 * @author Said AKHROUF (akhrouf@gmail.com)
 *
 */
public class Carre extends FormeGeometrique {

	protected int longueur;
		
	/**
	 * Créer un carré sans origine, ni de nom avec une longueur nulle
	 */
	public Carre() {
	}
	
	/**
	 * Créer un carré avec les informations données en argument
	 * @param origine l'origine du carré
	 * @param nom le nom du carré
	 * @param longueur la longueur du carré
	 */
	public Carre(Point origine, String nom, int longueur) {
		setOrigine(origine);
		setNom(nom);
		setLongueur(longueur);
	}

	/** 
	 * Récupérer la longueur du carré
	 * @return longueur du carré
	 */
	public int getLongueur() {
		return longueur;
	}

	/** 
	 * Modifier la longueur du carré
	 * @param longueur nouvelle longueur
	 */
	public void setLongueur(int longueur) {
		this.longueur = Math.abs(longueur);
	}

	/**
	 * Récupérer la superficie du carré à savoir la longueur puissance 2
	 * @return superficie du carré (longueur*longueur)
	 */
	@Override
	public double superficie() {
		return longueur * longueur;
	}

	/**
	 * Récupérer la chaîne représentant le carré
	 * @return chaîne représentant le carré
	 */
	@Override
	public String toString() {
		return String.format("Carre [longueur=%s, origine=%s, nom=%s]", longueur, getOrigine(), getNom());
	}
	
}