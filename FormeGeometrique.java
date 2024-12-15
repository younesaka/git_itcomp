package dz.etm.m16.act1.model;

/**
 * Classe de base pour représenter les formes géometriques.<br/>
 * Chaque forme géometrique va avoir :
 * <li>une origine (un point)</li>
 * <li>un nom (une chaîne)</li>
 * <br/>
 * @author Said AKHROUF (akhrouf@gmail.com)
 *
 */
public abstract class FormeGeometrique implements Comparable<FormeGeometrique> {
	
	/**
	 * Variable globale représentant l'épaisseur des formes géometriques
	 */
	public static int EPAISSEUR;

	private Point origine;
	private String nom;
	
	/**
	 * Récupérer l'origine de la forme géometrique
	 * @return origine de la forme géometrique
	 */
	public Point getOrigine() {
		return origine;
	}
	
	/**
	 * Affecter un autre point comme origine de la forme
	 * @param origine nouvelle origine
	 */
	public void setOrigine(Point origine) {
		this.origine = origine;
	}
	
	/**
	 * Récupérer le nom de la forme géometrique
	 * @return nom de la forme géometrique
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Modifier le nom de la forme géometrique
	 * @param nom nouveau nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Récupérer la superficie de la forme géométrique
	 * @return superficie de la forme
	 */
	public abstract double superficie();

	/**
	 * Comparer la forme géometrique avec une autre selon leurs superficies
	 * @param obj Objet de référence
	 * @return true si les deux formes ont la même superficie ; false sinon
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj != null && obj instanceof FormeGeometrique) {
			FormeGeometrique other = (FormeGeometrique)obj;
			return this.superficie() == other.superficie();
		}
		return false;
	}
	
	/**
	 * Comparer la forme géometrique avec une autre selon leurs superficies
	 * @param other Point de référence
	 * @return 
	 * 		<li>valeur positive si la forme actuelle est plus grand
	 * 		<li>valeur négative si la forme actuelle est plus petit
	 * 		<li>0 si les deux formes sont égales
	 */
	@Override
	public int compareTo(FormeGeometrique other) {		
//		if (this.superficie() > other.superficie())
//			return 1;
//		else if (this.superficie() > other.superficie())
//			return -1;
//		else return 0;
		
//		return (this.superficie() > other.superficie())? 1 :
//			(this.superficie() > other.superficie()) ? -1 : 0;
		
		//return (int) ((this.superficie() - other.superficie())*100000);
		
		return new Double(superficie()).compareTo(other.superficie());
		
		
	}
	
	/**
	 * Fonction permettant de double l'épaisseur des formes géometriques
	 */
	public static void doubler() {
		EPAISSEUR *= 2;
	}
}
