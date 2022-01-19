public class FiProg {
    /**
     * methode permettant de creer une liste trie a partie d'un fichier
     *
     * @param l liste triee (chainee ou contigue) (vide)
     * @param n nom du fichier
     * @return la liste triee en cdc
     */
    public static String listefichier(ListeTriee l, String n) {
        LectureFichier f = new LectureFichier(n);

        String[] nom = f.lireFichier();
        for (int i = 0; i < nom.length; i++) {
            l.adjlisT(nom[i]);
        }
        return l.toString();
    }


    public static void main(String[] args) {
        //mise en place des liste de base avec une taille de 20
        ListeContigue r = new ListeContigue(20);
        ListeChainee ch = new ListeChainee(20);

        ListeTriee h = new ListeTriee(r);//liste contigue
        ListeTriee h2 = new ListeTriee(ch);//liste chainee
        //Si argument different de 0 alors le 1er est la taille de la liste triee
        if (args.length != 0) {
            //transformation de la cdc en entier
            int nb = Integer.parseInt(args[0]);
            if (nb <= 10) {
                System.out.println("veuillez choisir une taille de tableau superieur à 10");
            }

            ListeContigue argument = new ListeContigue(nb);
            ListeChainee argumentriee = new ListeChainee(nb);

            h = new ListeTriee(argument);//liste contigue
            h2 = new ListeTriee(argumentriee);//liste chainee
        }
        //nombre de repetition de base pour cacluler les moyennes
        int nbfois = 100;
        //nombre de repetitionpour cacluler les moyennes avec le 2eme argument
        if (args.length == 1) {
            nbfois = Integer.parseInt(args[1]);
        }

        //test de la methode listefichier
        listefichier(h, "liste10.txt");
        System.out.println(listefichier(h, "liste10.txt"));

        System.out.println("pour les 10 premieres chaine de caractere en chainee ");
        long moy = h2.chronoch10(nbfois);
        System.out.println(moy);


        System.out.println("(bonus) et pour les 10 premieres lettres de l'alphabet en chainee");
        long s65 = h2.chronochbonus(nbfois);
        System.out.println(s65);

        System.out.println("pour les 10 premieres chaine de caractere en contigue ");
        long s10co = h.chronoco10(nbfois);
        System.out.println(s10co);

        System.out.println("(bonus) et les 10 premieres lettres de l'alphabet en contigue");
        long listechai = h.chronocobonus(nbfois);
        System.out.println(listechai);

        System.out.println("pour les 10 dernieres cdc en chainee");
        long sfin10 = h2.chronochfin10(nbfois);
        System.out.println(sfin10);

        System.out.println("(bonus)pour les 10 dernieres lettres en chainee");
        long sfinbonus = h2.chronochfinbonus(nbfois);
        System.out.println(sfinbonus);

        System.out.println("pour les 10 dernieres cdc en contigue");
        long sfin10co = h.chronochfin10(nbfois);
        System.out.println(sfin10co);

        System.out.println("(bonus) pour les 10 dernieres lettres de l'alphabet en contigue");
        long sfinco = h.chronocofinbonus(nbfois);
        System.out.println(sfinco);

        System.out.println("pour la suppression de 10  cdc en contigue");
        long ki = h.chronocosup(nbfois);
        System.out.println(ki);

        System.out.println("pour la suppression de 10  cdc en chaine");
        long ki2 = h2.chronochsup(nbfois);
        System.out.println(ki2);

        System.out.println("pour la suppression de 10 cdc en fin en contigue");
        long kifin = h.chronocosupfin(nbfois);
        System.out.println(kifin);

        System.out.println("pour la suppression de 10 cdc en fin en chaine");
        long ki2fin = h2.chronochsupfin(nbfois);
        System.out.println(ki2fin);

        //question 20 :contigue debut
        h.memlisT("AA");
        System.out.println("mem contigue debut");
        long trouveCoD = h.chronocomemdebut("AA", nbfois);
        System.out.println(trouveCoD);

        //	question 21 :contigue fin
        h.memlisT("AA");
        System.out.println("mem contigue fin");

        long trouveCoF = h.chronocomemfin("AA", nbfois);
        System.out.println(trouveCoF);

        //question 20 :chainee debut
        h.memlisT("AA");
        System.out.println("mem chainee debut");
        long trouveChD = h2.chronochmemdebut("AA", nbfois);
        System.out.println(trouveChD);

        //question 21 :chainee fin
        h.memlisT("AA");
        System.out.println("mem chainee fin");
        long trouveChF = h2.chronochmemfin("AA", nbfois);
        System.out.println(trouveChF);


    }
}

