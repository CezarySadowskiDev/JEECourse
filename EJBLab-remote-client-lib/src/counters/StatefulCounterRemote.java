/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counters;

import javax.ejb.Remote;

/**
 *
 * @author student
 */
@Remote
public interface StatefulCounterRemote {

    int count();
    
}
