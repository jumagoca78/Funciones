public class Calendario {
    
    public static int siguienteYear (int year)
    {
        return ++year;
    }

    public static int siguienteMes(int mes){
        if (mes==12){
            mes=1;
           
        }
        else 
            mes++;

        return mes;
    }

    public static int [] siguienteDia (int dia, int mes, int year){
        int diasMesNoBiciesto []= {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int diasMesBiciesto []= {0,31,29,31,30,31,30,31,31,30,31,30,31};
        int fecha [] = new int [3];
        int yearTemporal=year;
        int mesTemporal=mes;

        if (esBiciesto(year)){
            //revisar si el día es el ultimo del mes
            if (diasMesBiciesto[mes]==dia){
                dia = 1;
                mesTemporal = siguienteMes(mes);
                //si el mesTemporal 1
                if (mesTemporal ==1){
                    yearTemporal= siguienteYear(year);
                }
            }
            else{
                dia++;
            }
        }else{
            //revisar si el día es el ultimo del mes
            if (diasMesNoBiciesto[mes]==dia){
                dia = 1;
                mesTemporal = siguienteMes(mes);
                //si el mesTemporal 1
                if (mesTemporal ==1){
                    yearTemporal= siguienteYear(year);
                }
            }
            else{
                dia++;
            }

        }
        fecha[0]=dia;
        fecha[1]=mesTemporal;
        fecha[2]=yearTemporal;
        return fecha;
    }

    public static boolean esBiciesto (int year){
        if (year%4==0){
            return true;
        }
        return false;
    }


}
