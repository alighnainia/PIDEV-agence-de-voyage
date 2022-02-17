/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.esprit.test;

/**
 *
 * @author Fayechi
 */
public class A {
    private int a;
    private static A instance;

    private A() {
        System.out.println("a created !");
    }
    
    public static A getInstance(){
        if(instance == null)
            instance = new A();
        return instance;
    }
    
}
