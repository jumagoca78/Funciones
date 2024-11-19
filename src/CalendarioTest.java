public class CalendarioTest {
    public static void main (String args[]){
        int dia=29, mes=2, year=2000;
        int fecha []= new int [3];

        int i=0;
        while (i<=10000000){
            fecha= Calendario.siguienteDia(dia, mes, year);
            dia=fecha[0];
            mes=fecha[1];
            year=fecha[2];
            Arreglos.mostrarArreglo(fecha);

            i++;
        }
    }
    
}
