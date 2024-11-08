
import javax.swing.JOptionPane;

public class TemperaturaTest {

    public static void main(String[] args) {
        String numeroLecturasStr= JOptionPane.showInputDialog("Ingresa cuantas lecturas de temperatura quieres");
        int numeroLecturas = Integer.parseInt (numeroLecturasStr);

        double total = PromedioTemperatura.sumaTemperaturas(numeroLecturas);
        double promedio = PromedioTemperatura.promedioTemperatura (total, numeroLecturas);

        JOptionPane.showMessageDialog(null, total);
        JOptionPane.showMessageDialog(null, promedio);
    }
    
}
