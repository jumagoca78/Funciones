
import javax.swing.JOptionPane;

public class PromedioTemperatura {

    public static double promedioTemperatura (double total, int numeroLecturas){
        double resultado = total/numeroLecturas;
        return resultado;
    }

    public static double sumaTemperaturas (int numeroLecturas){

        double total=0.0;
        int contador =1;
        String temperaturaStr="";
        double temperatura;
        while (contador <= numeroLecturas){
             temperaturaStr = JOptionPane.showInputDialog("Ingresa la temperatura: ");
             temperatura = Double.parseDouble (temperaturaStr);
             total += temperatura;
            contador++;
        }
        return total;

    }
    
}
