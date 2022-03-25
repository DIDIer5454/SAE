public class ListeTriee {


    // Attribut de liste sous-jacente
    private Liste liste;

    public ListeTriee(Liste listevide) {
        if (listevide.finliste(listevide.tete()) == true) {
            this.liste = listevide;
        } else {
            Liste r = new ListeContigue(100);
            this.liste = r;
            int i = listevide.tete();
            while (listevide.finliste(i) == false) {
                this.adjlisT(listevide.val(i));
                i = listevide.suc(i);
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

    private static final String [] ELEMENTS_DE_DEBUT = {"A", "AA", "AAA ",
            " AAAA ", " AAAAA ", " AAAAAA ", " AAAAAAA ", " AAAAAAAA ", " AAAAAAAAA ",
            " AAAAAAAAAA "};
    private static final String [] ELEMENTS_DE_FIN = {" RABIN ", " RIVEST ",
            " SHAMIR ", " SIFAKIS ", " TORVALDS ", " TURING ", " ULLMAN ", " VALIANT ",
            " WIRTH ", "YAO"};

    public long chronochbonus(){
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

    public long chronoch10() {
        ListeChainee h = new ListeChainee(1000);
        ListeTriee f = new ListeTriee(h);
        long date_debut = System.nanoTime();
        for (int i = 0; i < ELEMENTS_DE_DEBUT.length; i++) {
            f.adjlisT(ELEMENTS_DE_DEBUT[i]);
        }
        long date_fin = System.nanoTime();
        long duree = date_fin - date_debut;
        return duree;
    }

    public long chronocobonus(){
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

    public long chronoco10() {
        ListeContigue h = new ListeContigue(1000);
        ListeTriee f = new ListeTriee(h);
        long date_debut = System.nanoTime();
        for (int i = 0; i < ELEMENTS_DE_DEBUT.length; i++) {
            f.adjlisT(ELEMENTS_DE_DEBUT[i]);
        }
        long date_fin = System.nanoTime();
        long duree = date_fin - date_debut;
        return duree;
    }

    public long chronochfinbonus(){
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

    public long chronochfin10(){
        ListeChainee h = new ListeChainee(1000);
        ListeTriee f = new ListeTriee(h);
        long date_debut = System.nanoTime();
        for (int i = 0; i < ELEMENTS_DE_FIN.length; i++) {
            f.adjlisT(ELEMENTS_DE_FIN[i]);
        }
        long date_fin = System.nanoTime();
        long duree = date_fin - date_debut;
        return duree;
    }

    public long chronocofinbonus(){
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
    public long chronocofin10(){
        ListeContigue h = new ListeContigue(1000);
        ListeTriee f = new ListeTriee(h);
        long date_debut = System.nanoTime();
        //trie la liste donné
        for (int i = 0; i < ELEMENTS_DE_FIN.length; i++) {
            f.adjlisT(ELEMENTS_DE_FIN[i]);
        }
        long date_fin = System.nanoTime();
        long duree = date_fin - date_debut;
        return duree;
    }
    public long chronocosup() {
        ListeContigue h = new ListeContigue(1000);
        ListeTriee f = new ListeTriee(h);
        for (int i = 0; i < ELEMENTS_DE_DEBUT.length; i++) {
            f.adjlisT(ELEMENTS_DE_DEBUT[i]);
        }
        long date_debut = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            f.suplisT(ELEMENTS_DE_DEBUT[i]);
        }
        long date_fin = System.nanoTime();
        long duree = date_fin - date_debut;
        return duree;
    }
    public long chronochsup() {
        ListeChainee h = new ListeChainee(1000);
        ListeTriee f = new ListeTriee(h);
        for (int i = 0; i < ELEMENTS_DE_DEBUT.length; i++) {
            f.adjlisT(ELEMENTS_DE_DEBUT[i]);
        }
        long date_debut = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            f.suplisT(ELEMENTS_DE_DEBUT[i]);

        }
        long date_fin = System.nanoTime();
        long duree = date_fin - date_debut;
        return duree;
    }
    public long chronocosupfin() {
        ListeChainee h = new ListeChainee(1000);
        ListeTriee f = new ListeTriee(h);
        for (int i = 0; i < ELEMENTS_DE_FIN.length; i++) {
            f.adjlisT(ELEMENTS_DE_FIN[i]);
        }
        long date_debut = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            f.suplisT(ELEMENTS_DE_FIN[i]);

        }
        long date_fin = System.nanoTime();
        long duree = date_fin - date_debut;
        return duree;
    }
    public long chronochsupfin() {
        ListeChainee h = new ListeChainee(1000);
        ListeTriee f = new ListeTriee(h);
        for (int i = 0; i < ELEMENTS_DE_FIN.length; i++) {
            f.adjlisT(ELEMENTS_DE_FIN[i]);
        }
        long date_debut = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            f.suplisT(ELEMENTS_DE_FIN[i]);
        }
        long date_fin = System.nanoTime();
        long duree = date_fin - date_debut;
        return duree;
    }
    public long chronochmemfin(String chaine) {
        ListeChainee h = new ListeChainee(1000);
        ListeTriee f = new ListeTriee(h);
        for (int i = 0; i < ELEMENTS_DE_FIN.length; i++) {
            f.adjlisT(ELEMENTS_DE_FIN[i]);
        }
        long date_debut = System.nanoTime();
        this.memlisT(chaine);
        long date_fin=System.nanoTime();
        long duree=date_fin-date_debut;
        return duree;
    }
    public long chronomemdebut(String chaine){
    ListeChainee h = new ListeChainee(1000);
    ListeTriee f = new ListeTriee(h);
    for (int i = 0; i < ELEMENTS_DE_DEBUT.length; i++) {
        f.adjlisT(ELEMENTS_DE_DEBUT[i]);
    }
    long date_debut = System.nanoTime();
    this.memlisT(chaine);
    long date_fin = System.nanoTime();
    long duree = date_fin - date_debut;
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
