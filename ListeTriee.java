public class ListeTriee{

	// Attribut de liste sous-jacente
	private Liste liste;

	public ListeTriee(Liste listevide){
		// Affectation de la liste vide a l'attribut prive
		liste = listevide;
	}

	/**
	 * ajoute un element au bon endroit dans la liste triee
	 * @param chaine element a inserer
	 */
	public void adjlisT(String chaine){
		int i=this.liste.tete();
		int i2=this.liste.tete();
		if(this.liste.finliste(this.liste.tete())==true){
			this.liste.adjtlis(chaine);
		}else{
			while(chaine.compareTo(this.liste.)>0 && this.liste.finliste(i)==false){
				i2=i;
				i=this.liste.suc(i);
						}
				if (chaine.compareTo(this.liste.tab[i])<=0 && this.liste.finliste(i)==false){
					this.liste.adjlis(i2,chaine);
				}else{
					this.liste.adjlis(i1);
				}
	}
	}

	/**
	 * permet de supprimer un element d'une liste. Supprime le premier element dont la valeur est egale a "chaine" ; ne fait rien si "chaine" n'appartient pas a la liste.
	 * @param chaine l'element a supprimer
	 */
	public void suplisT(String chaine){
		throw (new Error("not implemented"));
	}

	/**
	 * Retourne vrai si au moins un element de la liste a une valeur egale a "chaine", et retourne faux sinon.
	 * @param chaine l'element que l'on recherche
	 */
	public boolean memlisT(String chaine){
		throw (new Error("not implemented"));
	}

	public String toString(){
		// TODO (utiliser les fonctions deja ecrites dans les listes !)
		throw (new Error("not implemented"));
	}
}
