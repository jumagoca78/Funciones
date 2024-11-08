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
