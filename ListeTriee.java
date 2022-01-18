public class ListeTriee {


    // Attribut de liste sous-jacente
    private Liste liste;

    public ListeTriee(Liste listevide) {
        if(listevide.finliste(listevide.tete())==true ){
        this.liste = listevide;
      }else{
            Liste r=new ListeContigue(100);
            this.liste=r;
            int i=listevide.tete();
            while(listevide.finliste(i)==false){
              this.adjlisT(listevide.val(i));
              i=listevide.suc(i);
            }
          }
        }

    /**
     * ajoute un element au bon endroit dans la liste triee
     *
     * @param chaine element a inserer
     */

    public void adjlisT(String chaine) {
        int i = this.liste.tete();
        int prec = this.liste.tete();
        boolean trouve ;
        trouve = false;
        while (!this.liste.finliste(i) && !trouve ) {
            if (chaine.compareTo(this.liste.val(i)) > 0) {
                prec = i;
                i = this.liste.suc(i);
            } else {
                trouve = true;


            }
        }
        if (i==prec) {
            this.liste.adjtlis(chaine);
        }else{
            this.liste.adjlis(prec,chaine);

        }
    }






    /**
     * permet de supprimer un element d'une liste. Supprime le premier element dont la valeur est egale a "chaine" ; ne fait rien si "chaine" n'appartient pas a la liste.
     *
     * @param chaine l'element a supprimer
     */
    public void suplisT(String chaine) {
        int i = this.liste.tete();
        boolean trouve = false;
        while (this.liste.finliste(i) == false && trouve == false) {
            if (this.liste.val(i).compareTo(chaine) != 0) {
                i = this.liste.suc(i);
            } else {
                trouve = true;
            }
        }
        if (trouve == true) {
            this.liste.suplis(i);

        }

    }
    public long chronoch(){
        ListeChainee h = new ListeChainee(1000);
        ListeTriee f = new ListeTriee(h);
        long date_debut = System . nanoTime () ;
        for (char i='a';i<='j';i++){
          String p=  Character.toString(i);
            f.adjlisT(p);
        }
        long date_fin = System . nanoTime () ;
        long duree = date_fin - date_debut ;
        return duree;
    }
    public long chronoco(){
        ListeContigue h = new ListeContigue(1000);
        ListeTriee f = new ListeTriee(h);
        long date_debut = System . nanoTime () ;
        for (char i='a';i<='j';i++){
          String p= Character.toString(i);
            f.adjlisT(p);
        }
        long date_fin = System . nanoTime () ;
        long duree = date_fin - date_debut ;
        return duree;
    }

    public long chronochfin(){
        ListeChainee h = new ListeChainee(1000);
        ListeTriee f = new ListeTriee(h);
        long date_debut = System . nanoTime () ;
        for (char i='z';i<='q';i--){
            String p=  Character.toString(i);
            f.adjlisT(p);
        }
        long date_fin = System . nanoTime () ;
        long duree = date_fin - date_debut ;
        return duree;
    }
    public long chronocofin(){
        ListeContigue h = new ListeContigue(1000);
        ListeTriee f = new ListeTriee(h);
        long date_debut = System . nanoTime () ;
        for (char i='z';i<='q';i--){
            String p=  Character.toString(i);
            f.adjlisT(p);
        }
        long date_fin = System . nanoTime () ;
        long duree = date_fin - date_debut ;
        return duree;
    }

    /**
     * Retourne vrai si au moins un element de la liste a une valeur egale a "chaine", et retourne faux sinon.
     *
     * @param chaine l'element que l'on recherche
     */
    public boolean memlisT(String chaine) {
        int i = this.liste.tete();
        boolean trouve = false;
        if (this.liste.finliste(i) == false) {
            while (chaine.compareTo(this.liste.val(i)) > 0 && this.liste.finliste(i) == false) {
                i = this.liste.suc(i);
            }
            if (chaine.compareTo(this.liste.val(i)) == 0 && this.liste.finliste(i) == false) {
                trouve = true;
            }
        }
        return (trouve);
    }

    public String toString() {
        // TODO (utiliser les fonctions deja ecrites dans les listes !)
        String s = "";
        int i = this.liste.tete();
        while (liste.finliste(i) != true) {
            s += this.liste.val(i) + ",";
            i = this.liste.suc(i);
        }
        return s;
    }
}
