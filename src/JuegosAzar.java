public class JuegosAzar {

    //lanzamiento de volados
    public static int Volado(){
        return (int) (Math.random()*2);
    }

    //juego del melate
    public static int [] melate()
    {
        int seisNumero[]=new int [7];
        int contador=1;
        int pelotaMelate=0;
        
        while (contador <=6){
                       
            do{
                pelotaMelate = eventosAzar(56, 1);
            }
            while (existePelota (pelotaMelate, seisNumero));

                seisNumero[contador]=pelotaMelate;
                contador++;
            }
            return seisNumero;
        }

    //juego de melate repetido un millon de veces
    public static int [] melateUnMillon(){
        int seisNumero[]=new int [7];
        int numerosMelate[]=new int [57];
        int contador=1;
        int pelotaMelate=0;
        
        while (contador <=1000000){
                       
            seisNumero=melate();
            for (int i=1; i<=6; i++){
                numerosMelate[seisNumero[i]]++;
            
            }
            contador++;
        }
            return numerosMelate;
        }

    //funcion que verifica cuales son los 6 numeros mas repetidos en un arreglo
    
        
    

    public static boolean existePelota(int pelota, int[] arreglo){
        //Algoritmo de busqueda de la pelota en el arreglo

        for (int i=0; i<= arreglo.length-1;i++){
            if (arreglo[i]==pelota)
            return true;
        }
        return false;

    }

    //funcion generica de eventos de azar
public static int eventosAzar(int opciones, int inicio){
    return (int) (Math.random()*opciones)+ inicio;
}

    
}
