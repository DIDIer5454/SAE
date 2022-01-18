public class FiProg {
	public static String listefichier(ListeTriee l, String n) {
		LectureFichier f = new LectureFichier(n);

		String[] nom = f.lireFichier();
		for (int i = 0; i < nom.length; i++) {
			l.adjlisT(nom[i]);
		}
		return l.toString();
	}
	public static void main(String [] args){
		ListeContigue r = new ListeContigue(20);
		ListeChainee ch =new ListeChainee(20);
		ListeTriee h = new ListeTriee(r);
		ListeTriee h2 = new ListeTriee(ch);
		listefichier(h,"liste10.txt");
		System.out.println(listefichier(h,"liste10.txt"));
		System.out.println("pour les 10 premieres chaine de caractere en contigue ");
		long s10ch = h2.chronoch10();
		System.out.println(s10ch);
		System.out.println("(bonus) et pour les 10 premieres lettres de l'alphabet");
		long s = h2.chronochbonus();
		System.out.println(s);
		System.out.println("pour les 10 premieres chaine de caractere en chainee ");
		long s10co = h2.chronoco10();
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
		long sfin10co = h2.chronochfin10();
		System.out.println(sfin10co);
		System.out.println("(bonus) pour les 10 dernieres lettres de l'alphabet en contigue");
		long sfinco = h.chronocofinbonus();
		System.out.println(sfinco);
		System.out.println("pour la suppression de 10  cdc en contigue");
		long ki = h2.chronocosup();
		System.out.println(ki);
		System.out.println("pour la suppression de 10  cdc en chaine");
		long ki2 = h2.chronochsup();
		System.out.println(ki2);

	}
}