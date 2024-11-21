package villageGaulois;

import personnages.Gaulois;
import produit.IProduit;

public class Etal <P extends IProduit> {
	private Gaulois vendeur;
	private P[] produit;
	private int nbProduit=0;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;
	private int prix;

	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	public Gaulois getVendeur() {
		return vendeur;
	}

	public int getQuantite() {
		return quantite;
	}
	
	public void installerVendeur(Gaulois vendeur, P[] produit, int prix) {
		
	}
}
