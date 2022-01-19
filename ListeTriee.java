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
        boolean trouve;
        trouve = false;
        while (!this.liste.finliste(i) && !trouve) {
            if (chaine.compareTo(this.liste.val(i)) > 0) {
                prec = i;
                i = this.liste.suc(i);
            } else {
                trouve = true;


            }
        }
        if (i == prec) {
            this.liste.adjtlis(chaine);
        } else {
            this.liste.adjlis(prec, chaine);

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

    //creation du tableau de chaine elements de debut
    private static final String[] ELEMENTS_DE_DEBUT = {"A", "AA", "AAA ",
            " AAAA ", " AAAAA ", " AAAAAA ", " AAAAAAA ", " AAAAAAAA ", " AAAAAAAAA ",
            " AAAAAAAAAA "};
    //creation du tableau de chaine elements de fin
    private static final String[] ELEMENTS_DE_FIN = {" RABIN ", " RIVEST ",
            " SHAMIR ", " SIFAKIS ", " TORVALDS ", " TURING ", " ULLMAN ", " VALIANT ",
            " WIRTH ", "YAO"};

    /**
     * methode bonus permettant de chronometrer l'ajout des 10 premieres lettre de l'alphabet en liste triee chainee
     *
     * @param arg nombre de fois qu on va le faire pour la moyenne
     * @return la moyenne de la duree
     */
    public long chronochbonus(int arg) {
        long dureemoy = 0;

        for (int j = 0; j < arg; j++) {

            ListeChainee h = new ListeChainee(1000);
            ListeTriee f = new ListeTriee(h);
            long date_debut = System.nanoTime();
            for (char i = 'a'; i <= 'j'; i++) {
                String p = Character.toString(i);
                f.adjlisT(p);
            }
            long date_fin = System.nanoTime();
            long duree = date_fin - date_debut;
            dureemoy += duree;
        }
        return (dureemoy / arg);
    }

    /**
     * methode permettant de chronometrer l'ajout des 10 premieres cdc de la liste debut en liste triee chainee
     *
     * @param arg nombre de fois qu on va le faire pour la moyenne
     * @return la moyenne de la duree
     */
    public long chronoch10(int arg) {
        long dureemoy = 0;

        for (int j = 0; j < arg; j++) {
            ListeChainee h = new ListeChainee(1000);
            ListeTriee f = new ListeTriee(h);
            long date_debut = System.nanoTime();
            for (int i = 0; i < ELEMENTS_DE_DEBUT.length; i++) {
                f.adjlisT(ELEMENTS_DE_DEBUT[i]);
            }
            long date_fin = System.nanoTime();
            long duree = date_fin - date_debut;
            dureemoy += duree;
        }
        return (dureemoy / arg);
    }

    /**
     * methode bonus permettant de chronometrer l'ajout des 10 premieres lettres de l'alphabet en liste triee contigue
     *
     * @param arg nombre de fois qu on va le faire pour la moyenne
     * @return la moyenne de la duree
     */

    public long chronocobonus(int arg) {
        long dureemoy = 0;

        for (int j = 0; j < arg; j++) {

            ListeContigue h = new ListeContigue(1000);
            ListeTriee f = new ListeTriee(h);
            long date_debut = System.nanoTime();
            for (char i = 'a'; i <= 'j'; i++) {
                String p = Character.toString(i);
                f.adjlisT(p);
            }
            long date_fin = System.nanoTime();
            long duree = date_fin - date_debut;
            dureemoy += duree;
        }
        return (dureemoy / arg);
    }

    /**
     * methode permettant de chronometrer l'ajout des 10 premieres cdc de liste debut en liste triee contigue
     *
     * @param arg nombre de fois qu on va le faire pour la moyenne
     * @return la moyenne de la duree
     */
    public long chronoco10(int arg) {
        long dureemoy = 0;

        for (int j = 0; j < arg; j++) {

            ListeContigue h = new ListeContigue(1000);
            ListeTriee f = new ListeTriee(h);
            long date_debut = System.nanoTime();
            for (int i = 0; i < ELEMENTS_DE_DEBUT.length; i++) {
                f.adjlisT(ELEMENTS_DE_DEBUT[i]);
            }
            long date_fin = System.nanoTime();
            long duree = date_fin - date_debut;
            dureemoy += duree;
        }
        return (dureemoy / arg);
    }

    /**
     * methode bonus  permettant de chronometrer l'ajout des 10 dernieres lettres de l'alphabet en liste triee contigue
     *
     * @param arg nombre de fois qu on va le faire pour la moyenne
     * @return la moyenne de la duree
     */
    public long chronochfinbonus(int arg) {
        long dureemoy = 0;

        for (int j = 0; j < arg; j++) {

            ListeChainee h = new ListeChainee(1000);
            ListeTriee f = new ListeTriee(h);
            long date_debut = System.nanoTime();
            for (char i = 'z'; i <= 'q'; i--) {
                String p = Character.toString(i);
                f.adjlisT(p);
            }
            long date_fin = System.nanoTime();
            long duree = date_fin - date_debut;
            dureemoy += duree;
        }
        return (dureemoy / arg);
    }

    /**
     * methode permettant de chronometrer l'ajout des 10 cdc de liste fin en liste chainee
     *
     * @param arg nombre de fois qu on va le faire pour la moyenne
     * @return la moyenne de la duree
     */
    public long chronochfin10(int arg) {
        long dureemoy = 0;

        for (int j = 0; j < arg; j++) {

            ListeChainee h = new ListeChainee(1000);
            ListeTriee f = new ListeTriee(h);
            long date_debut = System.nanoTime();
            for (int i = 0; i < ELEMENTS_DE_FIN.length; i++) {
                f.adjlisT(ELEMENTS_DE_FIN[i]);
            }
            long date_fin = System.nanoTime();
            long duree = date_fin - date_debut;
            dureemoy += duree;
        }
        return (dureemoy / arg);
    }

    /**
     * methode bonus permettant de chronometrer l'ajout des 10 dernieres lettre de l'alphabet en liste contigue
     *
     * @param arg nombre de fois qu on va le faire pour la moyenne
     * @return la moyenne de la duree
     */
    public long chronocofinbonus(int arg) {
        long dureemoy = 0;

        for (int j = 0; j < arg; j++) {

            ListeContigue h = new ListeContigue(1000);
            ListeTriee f = new ListeTriee(h);
            long date_debut = System.nanoTime();
            for (char i = 'z'; i <= 'q'; i--) {
                String p = Character.toString(i);
                f.adjlisT(p);
            }
            long date_fin = System.nanoTime();
            long duree = date_fin - date_debut;
            dureemoy += duree;
        }
        return (dureemoy / arg);
    }

    /**
     * methode permettant de chronometrer l'ajout des 10 cdc de la liste fin en liste contigue
     *
     * @param arg nombre de fois qu on va le faire pour la moyenne
     * @return la moyenne de la duree
     */
    public long chronocofin10(int arg) {
        long dureemoy = 0;

        for (int j = 0; j < arg; j++) {

            ListeContigue h = new ListeContigue(1000);
            ListeTriee f = new ListeTriee(h);
            long date_debut = System.nanoTime();
            //trie la liste donné
            for (int i = 0; i < ELEMENTS_DE_FIN.length; i++) {
                f.adjlisT(ELEMENTS_DE_FIN[i]);
            }
            long date_fin = System.nanoTime();
            long duree = date_fin - date_debut;
            dureemoy += duree;
        }
        return (dureemoy / arg);
    }

    /**
     * methode permettant de chronometrer la suppression des 10 cdc de liste debut en liste contigue
     *
     * @param arg nombre de fois qu on va le faire pour la moyenne
     * @return la moyenne de la duree
     */
    public long chronocosup(int arg) {
        long dureemoy = 0;

        for (int j = 0; j < arg; j++) {

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

            dureemoy += duree;
        }
        return (dureemoy / arg);
    }

    /**
     * methode permettant de chronometrer la suppression des 10 cdc de liste debut en liste chainee
     *
     * @param arg nombre de fois qu on va le faire pour la moyenne
     * @return la moyenne de la duree
     */
    public long chronochsup(int arg) {
        long dureemoy = 0;

        for (int j = 0; j < arg; j++) {

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
            dureemoy += duree;
        }
        return (dureemoy / arg);
    }

    /**
     * methode permettant de chronometrer la suppression des 10 cdc de liste fin en liste contigue
     *
     * @param arg nombre de fois qu on va le faire pour la moyenne
     * @return la moyenne de la duree
     */
    public long chronocosupfin(int arg) {
        long dureemoy = 0;

        for (int j = 0; j < arg; j++) {

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
            dureemoy += duree;
        }
        return (dureemoy / arg);
    }

    /**
     * methode permettant de chronometrer la suppression des 10 cdc de liste fin en liste chainee
     *
     * @param arg nombre de fois qu on va le faire pour la moyenne
     * @return la moyenne de la duree
     */
    public long chronochsupfin(int arg) {
        long dureemoy = 0;

        for (int j = 0; j < arg; j++) {

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
            dureemoy += duree;
        }
        return (dureemoy / arg);
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

    /**
     * methhode qui nous permet de voir toute la liste triee
     *
     * @return s , cdc avec toute la liste triee
     */
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

    /**
     * methode permettant de connaitre la durée d'analyse totale d'une liste (liste fin)
     * avec memlisT en liste chaine
     *
     * @param chaine
     * @param arg
     * @return duree
     */
    public long chronochmemfin(String chaine, int arg) {
        long dureemoy = 0;

        for (int j = 0; j < arg; j++) {
            ListeChainee h = new ListeChainee(1000);
            ListeTriee f = new ListeTriee(h);
            for (int i = 0; i < ELEMENTS_DE_FIN.length; i++) {
                f.adjlisT(ELEMENTS_DE_FIN[i]);
            }
            long date_debut = System.nanoTime();
            this.memlisT(chaine);
            long date_fin = System.nanoTime();
            long duree = date_fin - date_debut;
            return duree;
        }
        return (dureemoy / arg);
    }

    /**
     * methode permettant de connaitre la durée d'analyse totale d'une liste (liste fin)
     * avec memlisT en liste contigue
     *
     * @param chaine
     * @param arg
     * @return duree
     */
    public long chronocomemfin(String chaine, int arg) {
        long dureemoy = 0;

        for (int j = 0; j < arg; j++) {
            ListeContigue h = new ListeContigue(1000);
            ListeTriee f = new ListeTriee(h);
            for (int i = 0; i < ELEMENTS_DE_FIN.length; i++) {
                f.adjlisT(ELEMENTS_DE_FIN[i]);
            }
            long date_debut = System.nanoTime();
            this.memlisT(chaine);
            long date_fin = System.nanoTime();
            long duree = date_fin - date_debut;
            return duree;
        }
        return (dureemoy / arg);
    }

    /**
     * methode permettant de connaitre la durée d'analyse totale d'une liste (liste debut)
     * avec memlisT en liste chainee
     *
     * @param chaine
     * @param arg
     * @return duree
     */

    public long chronochmemdebut(String chaine, int arg) {
        long dureemoy = 0;

        for (int j = 0; j < arg; j++) {

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
        return (dureemoy / arg);
    }

    /**
     * methode permettant de connaitre la durée d'analyse totale d'une liste (liste debut)
     * avec memlisT en liste contigue
     *
     * @param chaine
     * @param arg
     * @return duree
     */
    public long chronocomemdebut(String chaine, int arg) {
        long dureemoy = 0;

        for (int j = 0; j < arg; j++) {

            ListeContigue h = new ListeContigue(1000);
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
        return (dureemoy / arg);
    }


}
