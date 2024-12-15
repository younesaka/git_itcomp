package dz.etm.m16.act1.model;

/**
 * Représenter un point dans un axe 2D
 * @author Said AKHROUF (akhrouf@gmail.com)
 *
 */
public class Point {

	private int x;
	private int y;
	
	/**
	 * Créer un nouveau point par défaut aux coordonnées (5,5)
	 */
	public Point() {
		// this avec constructeur : appeler un constructeur de la même classe
		this(5,5);
	}
	
	/**
	 * Créer un nouveau point aux coordonnées données en argument
	 * @param x l'abscisse du nouveau point
	 * @param y l'ordonnée du nouveau point
	 */
	public Point(int x, int y) {
		setX(x); 
		setY(y); // deplacer(x,y)
	}
	
	/**
	 * Récupérer l'abscisse du point
	 * @return abscisse du point
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Modifier l'abscisse du point
	 * @param x nouvelle abscisse
	 */
	public void setX(int x) {
		if (x >= 0)
			this.x = x; 
		 // this.x pour designer l'attribut car la méthode possède un argument du même nom
	}
	
	/**
	 * Récupérer l'ordonnée du point
	 * @return ordonnée du point
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Modifier l'ordonnée du point
	 * @param y nouvelle ordonnée
	 */
	public void setY(int y) {
		if (y >= 0)
			this.y = y;
	}
	
	/**
	 * Déplacer le point aux coordonnées données en arguments
	 * @param x nouvelle abscisse
	 * @param y nouvelle ordonnée
	 */
	public void deplacer(int x, int y) { 
		setX(x); 
		setY(y); 
	}
	
	/** 
	 * Déplacer le point vers un autre point	 * 
	 * @param other point de référence
	 */
	public void deplacer(Point other) { 
		this.deplacer(other.x, other.y); 
	}
	
	/**
	 * Glisser le point selon les écarts données
	 * @param a dX
	 * @param b dY
	 */
	public void translater(int a, int b) {
		if ((x+a)>=0 && (y+b)>=0 ) {
			setX(x + a); 
		    setY(y + b); 
		}
	}
	
	/**
	 * Afficher les coordonées du point dans la console 
	 */
	public void afficher() {
		System.out.println('[' + x + ',' + y + ']');
	}

	/**
	 * Comparer la superposition du point actuel avec un autre
	 * @param other point de référence
	 * @return <b>true</b> si les 2 points sont superposés ; <b>false</b> sinon
	 */
	//@Override
	public boolean equals(Point other) {
		return (x == other.x && y == other.y);
	}
	
	/**
	 * Récupérer la chaîne représentant le point
	 * @return chaîne représentant le point
	 */
	@Override
	public String toString() {
		return String.format("Point [x=%s, y=%s]", x, y);
	}
	
}