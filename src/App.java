import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner estatura = new Scanner (System.in);
        int opcion;
        boolean salir;
        System.out.println("ingresa tu estatura aproximada\n");

        do {

            System.out.println("opc1) 1.50 M.");
            System.out.println("opc2) 1.60 M.");
            System.out.println("opc3) 1.70 M.");
            System.out.println("opc4) 1.80 M.");
            System.out.println("opc5) Finalizar\n");

            System.out.println("Escribe tu opcion:");
            opcion = estatura.nextInt();
             
            
            switch(opcion){
                 case 1:
                    System.out.println("\ntu esta tura es baja.\n");
                 break;
                    
                 case 2:
                 System.out.println("\ntu estatura es baja pero entra en el promedio.\n");
                 break;

                 case 3:
                 System.out.println("\ntu estatura es promedio.\n");
                 break;
                 
                 case 4:
                 System.out.println("\ntu estatura es alta.\n");
                 break;

                 case 5:
                    salir = true;
                 break;
                 
                 default:
                   System.out.println("\nopcion no valida, seleccione otra.\n");
                 break;
            }
            
        } while (opcion !=5);
    }
}
