/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.youssefbenavente.libreriadigital;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Youssef Benavente
 */
public class PantallaPrincipalTest {

    private PantallaPrincipal pantallaPrincipal;

    public PantallaPrincipalTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        pantallaPrincipal = new PantallaPrincipal();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAñadirLibroLaSombraDelViento() {
        pantallaPrincipal.añadirLibroLaSombraDelViento();

        String libroEsperado = "La sombra del viento";

        assertEquals(libroEsperado, pantallaPrincipal.libro7.getTitulo());
    }

    /**
     * /**
     * Test of main method, of class PantallaPrincipal.
     *
     * @Test public void testMain() { System.out.println("main"); String[] args
     * = null; PantallaPrincipal.main(args); fail("The test case is a
     * prototype."); }
     */
}
