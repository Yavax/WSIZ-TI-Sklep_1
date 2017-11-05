/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warstwa_biznesowa;

import javax.ejb.Stateless;
import warstwa_biznesowa.entity.Produkt1;

/**
 *
 * @author N8
 */
@Stateless
public class Fasada_warstwy_biznesowej {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    private Produkt1 produkt;

    public Produkt1 getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt1 produkt) {
        this.produkt = produkt;
    }
    
}
