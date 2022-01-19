public class ListeChainee implements Liste {

    private int tete;
    private MaillonString[] tab;

    public ListeChainee(int p) {
        this.tab = new MaillonString[p];
        for (int i = 0; i < this.tab.length; i++) {
            this.tab[i] = new MaillonString(null, -2);
        }
        this.tete = -1;
    }

    /**
     * permet de supprimer un element d'une liste
     *
     * @param p place de l'element  supprimer
     */
    public void suplis(int p) {
        int i = this.tete;
        if (p == i) {
            this.tete = this.tab[p].getSuc();
            LibererPlace(p);
        } else {
            boolean trouve = false;
            while (!trouve && !finliste(i)) {
                if (this.tab[i].getSuc() == p) {
                    trouve = true;
                    this.tab[i].setSuc(this.tab[p].getSuc());
                    LibererPlace(p);
                } else {
                    i = suc(i);
                }
            }
        }
    }

    /**
     * ajoute un element en tete de Liste
     *
     * @param s Element a ajouter en tete
     */
    public void adjtlis(String s) {
        int i = retournerPlaceLibre();
        int h = this.tete;
        this.tete = i;
        this.tab[i].setSuc(h);
        this.tab[i].setVal(s);


    }

    /**
     * ajoute un element a un endroit quelconque dans la liste
     *
     * @param p place apres laquelle inserer
     * @param s element a inserer
     */
    public void adjlis(int p, String s) {
        int i = retournerPlaceLibre();
        int h = this.tab[p].getSuc();
        this.tab[p].setSuc(i);
        this.tab[i].setVal(s);
        this.tab[i].setSuc(h);

    }

    /**
     * permet de savoir si on se trouve en fin de liste
     *
     * @param p place ou on se trouve
     * @return true si et seuelement si p est fin de liste
     */
    public boolean finliste(int p) {
        return (p == -1);
    }

    /**
     * retourne la premiere place de la liste
     *
     * @return tete de liste
     */
    public int tete() {
        return (this.tete);
    }

    /**
     * permet de connaitre la place suivante dans la liste
     *
     * @param p place en cours
     * @return place derriere p dans la liste
     */
    public int suc(int p) {
        int i = this.tab[p].getSuc();
        return i;
    }

    /**
     * methode permettant de retourne l indice d une place libre
     *
     * @return i l'indice d'une place libre
     */
    public int retournerPlaceLibre() {
        boolean find = false;
        int j = 0;
        while (find == false) {
            for (int i = 0; i < this.tab.length; i++) {
                if (this.tab[i].getSuc() == -2) {
                    j = i;
                    find = true;

                }
            }
        }
        return j;
    }

    /**
     * methode permettant de liberer une place
     *
     * @param p indice de la place a liberer
     */
    public void LibererPlace(int p) {
        this.tab[p].setSuc(-2);
        this.tab[p].setVal(null);
    }

    /**
     * retourne la valeur associee a la place p
     *
     * @param p place de la liste
     * @return la valeur associee a p
     */
    public String val(int p) {
        return (tab[p].getVal());
    }
    //creation de la methode trier permettant de trier la liste chainee en tant que liste chainee 
}
