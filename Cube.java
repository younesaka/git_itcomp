package dz.etm.m16.act1.model;

/**
 * Représenter un cube
 * @author Said AKHROUF (akhrouf@gmail.com)
 *
 */
public final class Cube extends Carre {

	/**
	 * Créer un cube sans origine, ni de nom avec une longueur nulle
	 */
	public Cube() {
	}
	
	/**
	 * Créer un cube avec les informations données en argument
	 * @param origine l'origine du cube
	 * @param nom le nom du cube
	 * @param longueur la longueur du cube
	 */
	public Cube(Point origine, String nom, int longueur) {
		setOrigine(origine);
		setNom(nom);
		setLongueur(longueur);
	}	

	/**
	 * Récupérer la superficie du cube
	 * @return superficie du cube (longueur*longueur*6)
	 */
	@Override
	public double superficie() {
		return super.superficie() * 6;
		// appeler la règle définie dans carré
	}

	/**
	 * Récupérer le volume du cube
	 * @return volume du cube
	 */
	public final double volume() {
		return Math.pow(longueur, 3);
	}

	/**
	 * Récupérer la chaîne représentant le cube
	 * @return chaîne représentant le cube
	 */
	@Override
	public String toString() {
		return String.format("Cube [longueur=%s, origine=%s, nom=%s]", longueur, getOrigine(), getNom());
	}
		
}
