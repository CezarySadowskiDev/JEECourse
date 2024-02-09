/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejblabappclient;

import counters.StatefulCounterRemote;
import javax.ejb.EJB;

/**
 *
 * @author student
 */
public class Main {

    @EJB
    private static StatefulCounterRemote statefulCounter;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(statefulCounter.count());
        try {Thread.sleep(10000);} catch (InterruptedException e) {}
        System.out.println(statefulCounter.count());
        try {Thread.sleep(10000);} catch (InterruptedException e) {}
        System.out.println(statefulCounter.count());
        try {Thread.sleep(10000);} catch (InterruptedException e) {}
        System.out.println(statefulCounter.count());
        try {Thread.sleep(10000);} catch (InterruptedException e) {}
        System.out.println(statefulCounter.count());
    }
    
}
