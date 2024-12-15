package dz.etm.m16.act1.model;

/**
 * Représenter un rectangle
 * @author Said AKHROUF (akhrouf@gmail.com)
 *
 */
public class Rectangle extends Carre {
	
	private int largeur;

	/**
	 * Créer un rectangle sans origine, ni de nom 
	 * avec une longueur et une larguer nulles
	 */
	public Rectangle() {
	}
	
	/**
	 * Créer un rectangle avec les informations données en argument
	 * @param origine l'origine du rectangle
	 * @param nom le nom du rectangle
	 * @param longueur la longueur du rectangle
	 */
	public Rectangle(Point origine, String nom, int longueur, int largeur) {
		super(origine, nom, longueur);
		setLargeur(largeur);
	}

	/**
	 * Récupérer la largeur du rectangle
	 * @return largeur du rectangle
	 */
	public int getLargeur() {
		return largeur;
	}

	/**
	 * Modifier la largeur du rectangle
	 * @param largeur nouvelle largeur
	 */
	public void setLargeur(int largeur) {
		this.largeur = Math.abs(largeur);
	}
	
	/**
	 * Récupérer la superficie du rectangle
	 * @return superficie du rectangle (longueur*largeur)
	 */
	@Override
	public double superficie() {
		return longueur * largeur;
	}

	/**
	 * Récupérer la chaîne représentant le rectangle
	 * @return chaîne représentant le rectangle
	 */
	@Override
	public String toString() {
		return String.format("Rectangle [largeur=%s, longueur=%s, origine=%s, nom=%s]", largeur,
				getLongueur(), getOrigine(), getNom());
	}
	
}