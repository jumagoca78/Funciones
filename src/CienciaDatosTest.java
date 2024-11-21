public class CienciaDatosTest {
    public static void main(String[] args) {
        try {
            double[] datos = CienciaDatos.leerArchivo("cienciaDatosData.txt");
            CienciaDatos.imprimirEstadisticas(datos);
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
    }
} 