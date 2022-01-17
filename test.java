public class test {
    public static void main(String args[]) {
        ListeChainee liste = new ListeChainee(20);
        String chaine ="roihfni";
        String chaine2 ="a";
        String chaine3 ="b";
        String chaine4 ="c";
        String chaine5 ="d";


        int i = liste.tete();
        int prec = liste.tete();
        boolean trouve = false;
        if (liste.finliste(i)) {
            liste.adjtlis(chaine);
        } else {
            while (liste.finliste(i) == false && trouve == false) {
                if (chaine.compareTo(liste.val(i)) > 0) {
                    prec = i;
                    i = liste.suc(i);
                } else {
                    trouve = true;


                }
            }
            if (trouve || liste.finliste(i)) {
                liste.adjlis(prec, chaine);
            }
        }
    }
}

