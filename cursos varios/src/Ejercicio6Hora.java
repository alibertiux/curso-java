import java.util.Scanner;

public class Ejercicio6Hora {
    public static void main(String[] args) {
        int hora = 0;
        int minutos = 0;
        int segundos = 0;
        String horario = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame la hora = ");
        hora = scanner.nextInt();
        System.out.println("Dame los minutos = ");
        minutos = scanner.nextInt();
        System.out.println("Dame los segundos = ");
        segundos = scanner.nextInt();
        boolean esAutenticado = false;

        if (hora>=0 && hora <= 24 &&minutos>=0 && minutos <= 59  && segundos>= 0 && segundos <= 59 ) {
            esAutenticado = true ;
        } else {
            System.out.println("La hora es incorrecta");
        }
        if (hora <= 11 && esAutenticado) {
            if (hora == 0) {
                hora = 12;
            }
            System.out.println("La hora es:" + hora + ":" + minutos + ":" + segundos +" am "  );
        } else if (hora>=12 && esAutenticado){
            if(hora > 12) {
                hora = hora - 12;
            }
            System.out.println("La hora es: " + hora + ":" + minutos + ":" + segundos +"pm " );
               // if( hora = 12
             //   }

            }

        }

    }