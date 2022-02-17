/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.esprit.services;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import tn.edu.esprit.models.offre;

/**
 *
 * @author LENOVO
 */
public class ServiceOffreTest {
    
    public ServiceOffreTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of ajouter method, of class ServiceOffre.
     */
    @Test
    public void testAjouter() {
        System.out.println("ajouter");
        offre t = null;
        ServiceOffre instance = new ServiceOffre();
        instance.ajouter(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class ServiceOffre.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 0;
        ServiceOffre instance = new ServiceOffre();
        offre expResult = null;
        offre result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class ServiceOffre.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        ServiceOffre instance = new ServiceOffre();
        List<offre> expResult = null;
        List<offre> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modifier method, of class ServiceOffre.
     */
    @Test
    public void testModifier() {
        System.out.println("modifier");
        offre t = null;
        ServiceOffre instance = new ServiceOffre();
        boolean expResult = false;
        boolean result = instance.modifier(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supprimer method, of class ServiceOffre.
     */
    @Test
    public void testSupprimer() {
        System.out.println("supprimer");
        int id = 0;
        ServiceOffre instance = new ServiceOffre();
        boolean expResult = false;
        boolean result = instance.supprimer(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
