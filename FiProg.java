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
		System.out.println("et pour les 10 premieres lettres en chainee");
		long s = h2.chronoch();
		System.out.println(s);
		System.out.println("et pour les 10 premieres lettres en contigue");
		long listechai = h.chronoco();
		System.out.println(listechai);
		System.out.println("et pour les 10 dernieres lettres en chainee");
		long sfin = h2.chronochfin();
		System.out.println(sfin);
		System.out.println("et pour les 10 dernieres lettres en contigue");
		long sfinco = h.chronocofin();
		System.out.println(sfinco);
	}
}