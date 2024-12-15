package dz.etm.m16.act1.model;

/**
 * Représenter un cercle
 * @author Said AKHROUF (akhrouf@gmail.com)
 *
 */
public class Cercle extends FormeGeometrique{

	private int diametre;
	
	/**
	 * Créer un cercle sans origine, ni de nom avec un diamètre nul
	 */
	public Cercle() {
	}
	
	/**
	 * Créer un cercle avec les informations données en argument
	 * @param origine l'origine du cercle
	 * @param nom le nom du cercle
	 * @param diametre le diamètre du cercle
	 */
	public Cercle(Point origine, String nom, int diametre) {
		setOrigine(origine);
		setNom(nom);
		setDiametre(diametre);
	}
	
	/**
	 * Récupérer le diamètre du cercle
	 * @return diamètre du cercle
	 */
	public int getDiametre() {
		return diametre;
	}

	/**
	 * Modifier le diamètre du cercle
	 * @param diametre nouveau diamètre
	 */
	public void setDiametre(int diametre) {
		this.diametre = Math.abs(diametre);
	}
	
	/**
	 * Récupérer la superficie du cercle
	 * @return superficie du cercle (pi * r²)
	 */
	@Override
	public double superficie() {
		return Math.PI * Math.pow(diametre / 2, 2);
	}

	/**
	 * Récupérer la chaîne représentant le cercle
	 * @return chaîne représentant le cercle
	 */
	@Override
	public String toString() {
		return String.format("Cercle [diametre=%s, origine=%s, nom=%s]", diametre, getOrigine(), getNom());
	}
	
}