//Clase con las pruebas unitarias de la clase Calendario

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TestCalendario {
    @Test
    public void testSiguienteYear() {
        int resultado = Calendario.siguienteYear(2019);
        int esperado = 2020;
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testSiguienteMes() {
        int resultado = Calendario.siguienteMes(12);
        int esperado = 1;
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testSiguienteDiaNuevoYear() {
        int[] resultado = Calendario.siguienteDia(31, 12, 2019);
        int[] esperado = {1, 1, 2020};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testSiguienteDiaMesFebrero() {
        int[] resultado = Calendario.siguienteDia(31, 1, 2019);
        int[] esperado = {1, 2, 2019};
        assertArrayEquals(esperado, resultado);
    }
     @Test
    public void testSiguienteDiaMesFebreroBisiesto() {
        int[] resultado = Calendario.siguienteDia(28, 2, 2020);
        int[] esperado = {29, 2, 2020};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testSiguienteDiaMesMarzoNoBisiesto() {
        int[] resultado = Calendario.siguienteDia(28, 2, 2019);
        int[] esperado = {1, 3, 2019};
        assertArrayEquals(esperado, resultado);
    }

     @Test
    public void testSiguienteDiaMesMarzoBisiesto() {
        int[] resultado = Calendario.siguienteDia(29, 2, 2020);
        int[] esperado = {1, 3, 2020};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testSiguienteDiaMesAbril() {
        int[] resultado = Calendario.siguienteDia(31, 3, 2019);
        int[] esperado = {1, 4, 2019};
        assertArrayEquals(esperado, resultado);
    }

   @Test
    public void testSiguienteDiaMesMayo() {
        int[] resultado = Calendario.siguienteDia(30, 4, 2019);
        int[] esperado = {1, 5, 2019};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testSiguienteDiaMesJunio() {
        int[] resultado = Calendario.siguienteDia(31, 5, 2019);
        int[] esperado = {1, 6, 2019};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testSiguienteDiaMesJulio() {
        int[] resultado = Calendario.siguienteDia(30, 6, 2019);
        int[] esperado = {1, 7, 2019};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testSiguienteDiaMesAgosto() {
        int[] resultado = Calendario.siguienteDia(31, 7, 2019);
        int[] esperado = {1, 8, 2019};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testSiguienteDiaMesSeptiembre() {
        int[] resultado = Calendario.siguienteDia(31, 8, 2019);
        int[] esperado = {1, 9, 2019};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testSiguienteDiaMesOctubre() {
        int[] resultado = Calendario.siguienteDia(30, 9, 2019);
        int[] esperado = {1, 10, 2019};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testSiguienteDiaMesNoviembre() {
        int[] resultado = Calendario.siguienteDia(31, 10, 2019);
        int[] esperado = {1, 11, 2019};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testSiguienteDiaMesDiciembre() {
        int[] resultado = Calendario.siguienteDia(30, 11, 2019);
        int[] esperado = {1, 12, 2019};
        assertArrayEquals(esperado, resultado);
    }



    
    @Test
    public void testEsBiciesto() {
        boolean resultado = Calendario.esBiciesto(2020);
        assertTrue(resultado);
    }

    //probar exactamente en los limites de los meses
    @Test
    public void testSiguienteDiaMesEnero() {
        int[] resultado = Calendario.siguienteDia(1, 1, 2019);
        int[] esperado = {2, 1, 2019};
        assertArrayEquals(esperado, resultado);
    }


    
}
