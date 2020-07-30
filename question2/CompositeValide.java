
package question2;

import question1.Contributeur;
import question1.GroupeDeContributeurs;
import question1.Visiteur;
import question1.Cotisant;


class CompositeValide implements Visiteur<Boolean>{ 

    public Boolean visite(Contributeur c){ 
        return c.solde()>= 0; 
    } 


    public Boolean visite(GroupeDeContributeurs g){ 
        if(g.nombreDeCotisants()<=0){ 
            return false; 
        } 
        for(Cotisant c : g.getChildren()){ 
            if( !c.accepter(this)){ 
                return false; 
            } 
        } return true ; 
    } 
}