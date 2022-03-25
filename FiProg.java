public class FiProg {
	public static String listefichier(ListeTriee l, String n) {
		LectureFichier f = new LectureFichier(n);

		String[] nom = f.lireFichier();
		for (int i = 0; i < nom.length; i++) {
			l.adjlisT(nom[i]);
		}
		return l.toString();
	}

	public static void main(String[] args) {
		if (args.length!=0) {
			int nb = Integer.parseInt(args[0]);

			ListeContigue argument = new ListeContigue(nb);
			ListeTriee argumentriee = new ListeTriee(argument);

		}
		ListeContigue r = new ListeContigue(20);
		ListeChainee ch = new ListeChainee(20);

		ListeTriee h = new ListeTriee(r);//liste contigue
		ListeTriee h2 = new ListeTriee(ch);//liste chainee

		listefichier(h, "liste10.txt");
		System.out.println(listefichier(h, "liste10.txt"));

		System.out.println("pour les 10 premieres chaine de caractere en chainee ");
		long s10ch=0;
		for (int i = 0;i<10;i++){
			s10ch += h2.chronoch10();
		}
		System.out.println(s10ch/10);


		System.out.println("(bonus) et pour les 10 premieres lettres de l'alphabet en chainee");
		long s = h2.chronochbonus();
		System.out.println(s);

		System.out.println("pour les 10 premieres chaine de caractere en contigue ");
		long s10co = h.chronoco10();
		System.out.println(s10co);

		System.out.println("(bonus) et les 10 premieres lettres de l'alphabet en contigue");
		long listechai = h.chronocobonus();
		System.out.println(listechai);

		System.out.println("pour les 10 dernieres cdc en chainee");
		long sfin10 = h2.chronochfin10();
		System.out.println(sfin10);

		System.out.println("(bonus)pour les 10 dernieres lettres en chainee");
		long sfinbonus = h2.chronochfinbonus();
		System.out.println(sfinbonus);

		System.out.println("pour les 10 dernieres cdc en contigue");
		long sfin10co = h.chronochfin10();
		System.out.println(sfin10co);

		System.out.println("(bonus) pour les 10 dernieres lettres de l'alphabet en contigue");
		long sfinco = h.chronocofinbonus();
		System.out.println(sfinco);

		System.out.println("pour la suppression de 10  cdc en contigue");
		long ki = h.chronocosup();
		System.out.println(ki);

		System.out.println("pour la suppression de 10  cdc en chaine");
		long ki2 = h2.chronochsup();
		System.out.println(ki2);

		System.out.println("pour la suppression de 10 cdc en fin en contigue");
		long kifin = h.chronocosupfin();
		System.out.println(kifin);

		System.out.println("pour la suppression de 10 cdc en fin en chaine");
		long ki2fin = h2.chronochsupfin();
		System.out.println(ki2fin);

		//question 20 :contigue debut
		h.memlisT("AA");
		System.out.println("on a trouve lelement"+h.memlisT("AA"));
		long trouveCoD = h.chronochsupfin();
		System.out.println(trouveCoD);

		//question 21 :contigue fin
		h.memlisT("AA");
		System.out.println("on a trouve lelement"+h.memlisT("AA"));
		long trouveCoF = h.chronochsupfin();
		System.out.println(trouveCoF);

		//question 20 :chainee debut
		h.memlisT("AA");
		System.out.println("on a trouve lelement"+h.memlisT("AA"));
		long trouveChD = h2.chronochsupfin();
		System.out.println(trouveChD);

		//question 21 :chainee fin
		h.memlisT("AA");
		System.out.println("on a trouve lelement"+h.memlisT("AA"));
		long trouveChF = h2.chronochsupfin();
		System.out.println(trouveChF);

		}
	}

}
