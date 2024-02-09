/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import counters.StatefulCounterLocal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author student
 */
@Named(value = "counterBean")
@ApplicationScoped
public class CounterBean implements Serializable {

    @EJB
    private StatefulCounterLocal statefulCounter;

    /**
     * Creates a new instance of CounterBean
     */
    public CounterBean() {
    }
    
    public int getCurrentNumber() {
        return statefulCounter.count();
    }
    
}
