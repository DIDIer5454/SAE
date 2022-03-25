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

  public void suplis(int p){
      int i = this.tete;
      if (p==i){
          this.tete=this.tab[p].getSuc();

          LibererPlace(p);
      }else{
          boolean trouve = false;
          while(!trouve && !finliste(i)){
              if(this.tab[i].getSuc()==p){
                  trouve=true;
                  this.tab[i].setSuc(this.tab[p].getSuc());
                  LibererPlace(p);
              }else{
                  i=suc(i);
              }
          }
      }
  }
    public void adjtlis(String s) {
        int i = retournerPlaceLibre();
        int h = this.tete;
        this.tete = i;
        this.tab[i].setSuc(h);
        this.tab[i].setVal(s);


    }

    public void adjlis(int p, String s) {
        int i = retournerPlaceLibre();
        int h = this.tab[p].getSuc();
        this.tab[p].setSuc(i);
        this.tab[i].setVal(s);
        this.tab[i].setSuc(h);

    }

    public boolean finliste(int p) {
        return (p == -1);
    }

    public int tete() {
        return (this.tete);
    }

    public int suc(int p) {
        int i = this.tab[p].getSuc();
        return i;
    }

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


    public void LibererPlace(int p) {
        this.tab[p].setSuc(-2);
        this.tab[p].setVal(null);
    }

    public String val(int p) {
        return (tab[p].getVal());
    }
    //creation de la methode trier permettant de trier la liste chainee en tant que liste chainee 
}
