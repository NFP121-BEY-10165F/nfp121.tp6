package question2;

import question1.Contributeur;
import question1.GroupeDeContributeurs;
import question1.Visiteur;
import question1.Cotisant;



public class DebitMaximal implements Visiteur<Integer>{ 

    public Integer visite(Contributeur c){ 
        return c.solde(); 
    } 


    public Integer visite(GroupeDeContributeurs g){ 
        int res = 0; 
        for(Cotisant c : g.getChildren()){ 
            int temp = c.accepter(this);
            if (res==0 || temp < res ){                             
                res =temp; 
            } 
        } 
        return res ;

    } 
} 