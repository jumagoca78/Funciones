public class CalendarioTest {
    public static void main (String args[]){
        int dia=31, mes=12, year=2000;
        int fecha []= new int [3];

        fecha= Calendario.siguienteDia(dia, mes, year);
        Arreglos.mostrarArreglo(fecha);
    }
    
}
