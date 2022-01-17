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

	@Test
	public void test1_Lchainee(){
		ListeChainee r = new ListeChainee(0);
		ListeTriee h = new ListeTriee(r);
		h.adjlisT("zozo");
		h.adjlisT("baba");
		h.adjlisT("beba");
		h.adjlisT("roba");
		assertEquals("la liste devrait etre","baba,beba,roba,zozo,",h.toString());

	}
	/**
	 * test suppression element liste trie (chainee)
	 */
	public void test2_Lchaineesup() {
		ListeChainee r = new ListeChainee(0);
		ListeTriee h = new ListeTriee(r);
		h.adjlisT("zozo");
		h.adjlisT("baba");
		h.adjlisT("beba");
		h.adjlisT("roba");
		h.suplisT("baba");
		assertEquals("la liste devrait etre", "beba,roba,zozo,", h.toString());
	}
	/**
	 * test suppression element inexistant liste trie (chainee)
	 */
	public void test3_Lchaineesup_pasok() {
		ListeChainee r = new ListeChainee(0);
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
	public void test4_construccontigue){
		ListeContigue r = new ListeContigue(0);
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
	public void test5_Lcontigueesup() {
		ListeContigue r = new ListeContigue(0);
		ListeTriee h = new ListeTriee(r);
		h.adjlisT("zozo");
		h.adjlisT("baba");
		h.adjlisT("beba");
		h.adjlisT("roba");
		h.suplisT("baba");
		assertEquals("la liste devrait etre", "beba,roba,zozo,", h.toString());
	}
	/**
	 * test suppression element inexistant liste trie (contigue)
	 */
	public void test6_Lcontiguesup_pasok() {
		ListeContigue r = new ListeContigue(0);
		ListeTriee h = new ListeTriee(r);
		h.adjlisT("zozo");
		h.adjlisT("baba");
		h.adjlisT("beba");
		h.adjlisT("roba");
		h.suplisT("bezf");
		assertEquals("la liste devrait etre", "baba,beba,roba,zozo,", h.toString());
	}
	// ......................
	// ......................
	// ......................

}
