package com.project.kevin.braceletproject;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Cotizacion1_esCorrecta() throws Exception {
        // Cotizacion de: 1 manilla de cuero con dije de martillo en Oro o Oro rosado, en USD
        int cantidad = 1, tipoDivisa = 0, tipoMaterial = 0, tipoDije = 0, tipoMetal = 0;
        assertEquals(100, Metodos.calcular(cantidad,tipoDivisa,tipoMaterial,tipoDije,tipoMetal));
    }

    @Test
    public void Cotizacion2_esCorrecta() throws Exception {
        // Cotizacion de: 5 manillas de cuero con dije de ancla en Plata, en COP
        int cantidad = 5, tipoDivisa = 1, tipoMaterial = 0, tipoDije = 1, tipoMetal = 2;
        assertEquals(1500000, Metodos.calcular(cantidad,tipoDivisa,tipoMaterial,tipoDije,tipoMetal));
    }

    @Test
    public void Cotizacion3_esCorrecta() throws Exception {
        // Cotizacion de: 2 manillas de cuero con dije de ancla en Plata, en USD
        int cantidad = 10, tipoDivisa = 0, tipoMaterial = 1, tipoDije = 0, tipoMetal = 3;
        assertEquals(500, Metodos.calcular(cantidad,tipoDivisa,tipoMaterial,tipoDije,tipoMetal));
    }


}