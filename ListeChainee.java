public class ListeChainee implements Liste{

    private int tete;
    private  MaillonString[] tab;

    public ListeChainee(int p){
        this.tab=new MaillonString[p];
        for (int i=0;i<this.tab.length;i++){
            this.tab[i]= new MaillonString(null,-2);
        }
        this.tete=-1;
        }


    public void suplis(int p)
    {
        if(p==this.tete)
        {
            int suc = this.tab[this.tete].getSuc();
            this.LibererPlace(this.tete);
            this.tete = suc;
        }
        else
        {
            if(this.tab[p].getSuc()!=-1)
            {
                int i = this.tete;
                while(this.suc(i) != p)
                {
                    i++;
                }
                int suc = this.tab[p].getSuc();
                this.tab[i].setSuc(suc);
                this.LibererPlace(p);
            }
            else
            {
                int i = 0;
                while(this.suc(i) !=p)
                {
                    i++;
                }
                this.tab[i].setSuc(-1);
                this.LibererPlace(p);
            }
        }
    }


    public void adjtlis(String s){
int i =retournerPlaceLibre();
int h = this.tete;
this.tete=i;
this.tab[i].setSuc(h);
this.tab[i].setVal(s);


    }

    public void adjlis(int p,String s){
        int i =retournerPlaceLibre();
       int h = this.tab[p].getSuc();
        this.tab[p].setSuc(i);
        this.tab[i].setVal(s);
        this.tab[i].setSuc(h);

    }

    public boolean finliste(int p){
        return(p==-1);
    }

    public int tete(){
       return(this.tete);
    }

    public int suc(int p){
       int i=this.tab[p].getSuc();
       return i;
    }

    public int retournerPlaceLibre(){
        boolean find = false ;
        int j = 0;
        while (find == false) {
            for (int i = 0; i < this.tab.length; i++) {
                if (this.tab[i].getSuc() == -2) {
                    j=i;
                    find=true;

                }
            }
        }
        return j;
    }


    public void LibererPlace(int p)
    {
        this.tab[p].setSuc(-2);
        this.tab[p].setVal(null);
    }
    //creation de la methode trier permettant de trier la liste chainee en tant que liste chainee 
}
