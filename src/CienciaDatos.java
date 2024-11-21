
//Escribe un programa que lea un archivo de texto con datos numéricos (un número por línea) y guarde esos valores en un arreglo. 
//El programa debe calcular el promedio y la desviación estándar e imprimir los resultados en pantalla.

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CienciaDatos {

    //Funcion que calcula el promedio de un arreglo de enteros
    public static double promedio(double[] datos) {
        double suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma += datos[i];
        }
        return suma / datos.length;
    }

    //Funcion que calcula la desviacion estandar de un arreglo de enteros
    public static double desviacionEstandar(double[] datos) {
        double promedio = promedio(datos);
        double suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma += Math.pow(datos[i] - promedio, 2);
        }
        return Math.sqrt(suma / datos.length);
    }

    //Funcion que imprime el promedio y la desviacion estandar de un arreglo de enteros
    public static void imprimirEstadisticas(double [] datos) {
        System.out.println("Promedio: " + promedio(datos));
        System.out.println("Desviacion estandar: " + desviacionEstandar(datos));
    }

    //Funcion que lee un archivo de texto con datos numericos y los guarda en un arreglo de doubles
    public static double[] leerArchivo(String nombreArchivo) throws Exception{
        int x=0;
        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
        String linea;
        ArrayList<Double> datos = new ArrayList<>();
        while ((linea = br.readLine()) != null) {
             datos.add(Double.parseDouble(linea));
        }
        br.close();
        double  arreglo [] = new double[datos.size()];
        for (int i = 0; i < datos.size(); i++) {
            arreglo[i] = datos.get(i);
        }
        return arreglo;
        }
    
    
}
