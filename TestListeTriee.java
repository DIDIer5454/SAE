import static libtest.Lanceur.lancer;
import static libtest.OutilTest.assertEquals;
import libtest.*;


/**
 * classe de test qui permet de verifier que la classe ListeTriee
 * fonctionne correctement
 */
public class TestListeTriee {

	/**
	 * methode de lancement des tests
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		lancer(new TestListeTriee(), args);
	}

	/**
	 * test constructeur liste trie chainee
	 */


	public void test1_Lchainee(){
		ListeChainee r = new ListeChainee(20);
		ListeTriee h = new ListeTriee(r);
		h.adjlisT("zozo");
		h.adjlisT("baba");
		h.adjlisT("beba");
		h.adjlisT("roba");
		assertEquals("la liste devrait etre","baba,beba,roba,zozo,",h.toString());

	}
	/**
	 * test suppression element liste trie (chainee) en tete
	 */
	public void test2_Lchaineesup_tete() {
		ListeChainee r = new ListeChainee(20);
		ListeTriee h = new ListeTriee(r);
		h.adjlisT("zozo");
		h.adjlisT("baba");
		h.adjlisT("beba");
		h.adjlisT("roba");
		h.suplisT("baba");
		assertEquals("la liste devrait etre", "beba,roba,zozo,", h.toString());
	}
	/**
	 * test suppression element liste trie (chainee) au milieu de chaine
	 */
	public void test2_Lchaineesup_milieu() {
		ListeChainee r = new ListeChainee(20);
		ListeTriee h = new ListeTriee(r);
		h.adjlisT("zozo");
		h.adjlisT("baba");
		h.adjlisT("beba");
		h.adjlisT("roba");
		h.suplisT("beba");
		assertEquals("la liste devrait etre", "baba,roba,zozo,", h.toString());
	}
	/**
	 * test suppression element liste trie (chainee) en queue
	 */
	public void test2_Lchaineesup_queue() {
		ListeChainee r = new ListeChainee(20);
		ListeTriee h = new ListeTriee(r);
		h.adjlisT("zozo");
		h.adjlisT("baba");
		h.adjlisT("beba");
		h.adjlisT("roba");
		h.suplisT("zozo");
		assertEquals("la liste devrait etre", "baba,beba,roba,", h.toString());
	}
	/**
	 * test suppression element inexistant liste trie (chainee)
	 */
	public void test3_Lchaineesup_pasok() {
		ListeChainee r = new ListeChainee(20);
		ListeTriee h = new ListeTriee(r);
		h.adjlisT("zozo");
		h.adjlisT("baba");
		h.adjlisT("beba");
		h.adjlisT("roba");
		h.suplisT("bezf");
		assertEquals("la liste devrait etre", "baba,beba,roba,zozo,", h.toString());
	}
	/**
	 * test constructeur liste trie contigue
	 */
	public void test4_construccontigue(){
		ListeContigue r = new ListeContigue(20);
		ListeTriee h = new ListeTriee(r);
		h.adjlisT("zozo");
		h.adjlisT("baba");
		h.adjlisT("beba");
		h.adjlisT("roba");
		assertEquals("la liste devrait etre","baba,beba,roba,zozo,",h.toString());

	}
	/**
	 * test suppression element liste trie (contigue)
	 */
	public void test5_Lcontigueesup_tete() {
		ListeContigue r = new ListeContigue(20);
		ListeTriee h = new ListeTriee(r);
		h.adjlisT("zozo");
		h.adjlisT("baba");
		h.adjlisT("beba");
		h.adjlisT("roba");
		h.suplisT("baba");
		assertEquals("la liste devrait etre", "beba,roba,zozo,", h.toString());
	}
	public void test5_Lcontigueesup_milieu() {
		ListeContigue r = new ListeContigue(20);
		ListeTriee h = new ListeTriee(r);
		h.adjlisT("zozo");
		h.adjlisT("baba");
		h.adjlisT("beba");
		h.adjlisT("roba");
		h.suplisT("roba");
		assertEquals("la liste devrait etre", "baba,beba,zozo,", h.toString());
	}
	public void test5_Lcontigueesup_queue() {
		ListeContigue r = new ListeContigue(20);
		ListeTriee h = new ListeTriee(r);
		h.adjlisT("zozo");
		h.adjlisT("baba");
		h.adjlisT("beba");
		h.adjlisT("roba");
		h.suplisT("zozo");
		assertEquals("la liste devrait etre", "baba,beba,roba,", h.toString());
	}
	/**
	 * test suppression element inexistant liste trie (contigue)
	 */
	public void test6_Lcontiguesup_pasok() {
		ListeContigue r = new ListeContigue(20);
		ListeTriee h = new ListeTriee(r);
		h.adjlisT("zozo");
		h.adjlisT("baba");
		h.adjlisT("beba");
		h.adjlisT("roba");
		h.suplisT("bezf");
		assertEquals("la liste devrait etre", "baba,beba,roba,zozo,", h.toString());
	}
	/**
	 * test constructeur liste trie contigue non vide
	 */
	public void test4_construccontigue_nonvide(){
		ListeContigue r = new ListeContigue(20);
		r.adjtlis("zozo");
		r.adjtlis("baba");
		r.adjtlis("beba");
		r.adjtlis("roba");
		ListeTriee h = new ListeTriee(r);
		assertEquals("la liste devrait etre","baba,beba,roba,zozo,",h.toString());
	}

	/**
	 * test constructeur liste trie chainee liste non vide
	 */
	public void test1_Lchainee_nonvide(){
		ListeChainee r = new ListeChainee(20);
		r.adjtlis("zozo");
		r.adjtlis("baba");
		r.adjtlis("beba");
		r.adjtlis("roba");
		ListeTriee h = new ListeTriee(r);
		assertEquals("la liste devrait etre","baba,beba,roba,zozo,",h.toString());
	}
	public void test_lecturefichier(){
		ListeContigue r = new ListeContigue(1000);

	}

}
