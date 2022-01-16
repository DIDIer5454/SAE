public class ListeTriee{

	// Attribut de liste sous-jacente
	private Liste liste;

	public ListeTriee(Liste listevide){
		// Affectation de la liste vide a l'attribut prive
		// la liste triee est une liste contigue triee.
		// donc pour la construire on va recopier par ordre croissant les elements de la liste passé en paramètre
		// par contre une implementation ne parait pas necessaire vue que Listetriee a comme attribut une liste.
		// de plus les fonctions enoncées ne font pas partie de l'interface Liste.
		liste = new ListeContigue(0);

		//on trie la liste
		if(this.liste.finliste(this.liste.tete())==false){
			int i1=this.liste.tete();
			int i2=this.liste.tete();
			String y;
			while(this.liste.finliste(i1)==false){
				i2=i1;
				i1=this.liste.suc(i1);
			if(this.liste.val(i1).compareTo(this.liste.val(i2))<=0) {
				y=this.liste.val(i1);
			}
		}
	}
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
			while(chaine.compareTo(this.liste.val(i))>0 && this.liste.finliste(i)==false){
				i2=i;
				i=this.liste.suc(i);
						}
				if (chaine.compareTo(this.liste.val(i))<=0 && this.liste.finliste(i)==false){
					this.liste.adjlis(i2,chaine);
				}else{
					this.liste.adjlis(i,chaine);
				}
	}
	}

	/**
	 * permet de supprimer un element d'une liste. Supprime le premier element dont la valeur est egale a "chaine" ; ne fait rien si "chaine" n'appartient pas a la liste.
	 * @param chaine l'element a supprimer
	 */
	public void suplisT(String chaine){
		int i=this.liste.tete();
		if(this.liste.finliste(i)==false){
		while(chaine.compareTo(this.liste.val(i))!=0 && this.liste.finliste(i)==false){
			i=this.liste.suc(i);
		}
		if(chaine.compareTo(this.liste.val(i))==0){
			this.liste.suplis(i);
		}}
	}

	/**
	 * Retourne vrai si au moins un element de la liste a une valeur egale a "chaine", et retourne faux sinon.
	 * @param chaine l'element que l'on recherche
	 */
	public boolean memlisT(String chaine){
		int i=this.liste.tete();
		boolean trouve=false;
		if(this.liste.finliste(i)==false){
		while(chaine.compareTo(this.liste.val(i))>0 && this.liste.finliste(i)==false){
			i=this.liste.suc(i);
		}
		if (chaine.compareTo(this.liste.val(i))==0 && this.liste.finliste(i)==false){
			trouve=true;
		}
	}
		return(trouve);
}

	public String toString(){
		// TODO (utiliser les fonctions deja ecrites dans les listes !)
		throw (new Error("not implemented"));
	}
}
