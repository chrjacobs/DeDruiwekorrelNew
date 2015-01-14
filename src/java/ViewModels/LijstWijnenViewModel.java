/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;

import DAL.Wijntbl;
import java.util.List;

/**
 *
 * @author Christel
 */
public class LijstWijnenViewModel {
    
private List<Wijntbl> wijnen;

    public LijstWijnenViewModel(List<Wijntbl> wijnen) {
        this.wijnen = wijnen;
    }
    
    
    
    public int getAantal(){
        return wijnen.size();
    }
    
    
    /**
     * @return the autos
     */
    public List<Wijntbl> getWijnen() {
        return wijnen;
    }

    /**
     * @param landen the bestellingen to set
     */
    public void setWijnen(List<Wijntbl> wijnen) {
        this.wijnen = wijnen;
    }
}


