package produit;

public class Poisson extends Produit {
	private String jour;

	public Poisson(String jour) {
		super("poisson", Unite.PIECE);
		this.jour = jour;
	}

	public void decrireProduit(IProduit produit) {
		StringBuilder chaine = new StringBuilder();
		chaine.append(produit.getNom());
		chaine.append(" peche ");
		chaine.append(jour);
		System.out.println(chaine);
	}

}
