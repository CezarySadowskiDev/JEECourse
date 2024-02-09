/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fasada;

import encje.Wykonawca;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author student
 */
@Stateless
public class WykonawcaFacade extends AbstractFacade<Wykonawca> {

    @PersistenceContext(unitName = "AlbumyJPPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WykonawcaFacade() {
        super(Wykonawca.class);
    }
    
}
