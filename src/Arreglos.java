
public class Arreglos {

    public static void mostrarArreglo (int [] arreglo){

        for (int i=0; i<= arreglo.length-1;i++){
            System.out.println(arreglo[i]);
        }
    }

    //llenar de pares el arreglo
    public static void llenarArregloPares(int [] arreglo){
        for (int i=0; i<= arreglo.length-1;i++){
            arreglo[i]=i*2;
        }
    }

    //llenar de impares el arreglo
    public static void llenarArregloImpares(int [] arreglo){
        for (int i=0; i<= arreglo.length-1;i++){
            arreglo[i]=i*2+1;
        }
    }

    //llenar de numeros aleatorios entre1 y 1 el arreglo 
    public static void llenarArregloAleatorio(int [] arreglo){
        for (int i=0; i<= arreglo.length-1;i++){
            arreglo[i]=(int) JuegosAzar.eventosAzar(100, 1);    
        }
    }

//funcion que logra buscar el entero mas grande en un arreglo
public static int buscarMaximo(int[] arreglo) {
    int maximo = Integer.MIN_VALUE;
    if (arreglo.length==0){
        throw new IllegalArgumentException("El arreglo no puede estar vacio");
    }
    for (int i = 0; i <= arreglo.length-1; i++) {
        if (arreglo[i] > maximo) {
            maximo = arreglo[i];
        }
    }
    return maximo;
    }

    //funcion que logra buscar el entero mas pequeños en un arreglo
public static int buscarMinimo(int[] arreglo) {
    int minimo = Integer.MAX_VALUE;
    if (arreglo.length==0){
        throw new IllegalArgumentException("El arreglo no puede estar vacio");
    }
    for (int i = 0; i <= arreglo.length-1; i++) {
        if (arreglo[i] < minimo) {
            minimo = arreglo[i];
        }
    }
    return minimo;
    }

}
