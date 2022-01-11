public class ListeContigue
implements Liste{
	private SousTitre[] tab;
	private int NbElements;


	public ListeContigue(int t){
		
		this.tab = new SousTitre[t];
	}
	/**
	 * permet de supprimer un element d'une liste
	 * @param p place de l'element  supprimer 
	 */
public void suplis(int p){
	for (int i=p;i<this.tab.length-1;i++){
		tab[i]=tab[i+1];
	
	}
this.NbElements=this.NbElements-1;	;
}
	
	/**
	 * ajoute un element en tete de Liste
	 * @param s Element a ajouter en tete
	 */
	public void adjtlis(SousTitre s){
		for (int i=NbElements;i>0;i--){
			tab[i]=tab[i-1];
			
		}
		tab[0]=s;
this.NbElements=this.NbElements+1;		;
	}
	
	/**
	 * ajoute un element a un endroit quelconque dans la liste
	 * @param p place apres laquelle inserer
	 * @param s element a inserer
	 */
	public void adjlis(int p, SousTitre s){
		for (int i=NbElements;i>p+1;i--){
			tab[i]=tab[i-1];
			
		}
		tab[p+1]=s;
		this.NbElements=this.NbElements+1;
		
	}
	
	/**
	 * permet de savoir si on se trouve en fin de liste
	 * @param p place ou on se trouve
	 * @return true si et seuelement si p est fin de liste
	 */
	public boolean finliste(int p){
		if (p==NbElements){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * retourne la premiere place de la liste
	 * @return tete de liste
	 */
	public int tete(){
		return(0);
	}
	
	/**
	 * permet de connaitre la place suivante dans la liste
	 * @param p place en cours
	 * @return place derriere p dans la liste
	 */
	public int suc(int p){
		return (p+1);
	}
	
	/**
	 * retourne la valeur associee a la place p
	 * @param p place de la liste
	 * @return la valeur associee a p
	 */
	public SousTitre val(int p){
		return(tab[p]);
	}




}