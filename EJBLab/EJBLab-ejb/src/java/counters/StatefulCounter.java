/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counters;

import javax.ejb.Stateful;

/**
 *
 * @author student
 */
@Stateful
public class StatefulCounter implements StatefulCounterRemote, StatefulCounterLocal {
    
    private int counter = 0;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public int count() {
        return ++counter;
    }
}
