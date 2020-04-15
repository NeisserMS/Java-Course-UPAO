
package polimorfismo;

import java.util.Scanner;

public  abstract class  Cajero {

    protected int transacciones, retiro, deposito;
    private int saldo;

    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0; //Variables locales
        int seleccion = 0;

        do {
            do {
                System.out.println("Por favor Seleccione una opción: ");
                System.out.println("    1.- Consulta de Saldo.");
                System.out.println("    2.-Retiro de Efectivo.");
                System.out.println("    3.-Deposito de efectivo");
                System.out.println("    4.-Salir.");
                seleccion = entrada.nextInt(); // va a guardar la opcion que se ha elegido.

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1; // para que el ciclo termine, ya que cambia.
                } else {
                    System.out.println("---------------------------------------");
                    System.out.println(" Opción no disponible, vuelva a intentar.");
                    System.out.println("----------------------------------------");
                }
            } while (bandera == 0);

            if (seleccion == 1) {
                
                Cajero mensajero = new Clase_hija();
                mensajero.Transacciones();

            } else if (seleccion == 2) {
                Cajero mensajero = new ClaseHija_retiro();
                mensajero.Transacciones();
                
            } else if (seleccion == 3) {
                Cajero mensajero = new Clasehija_Deposito();
                mensajero.Transacciones();
                
            } else if (seleccion == 4) {
                System.out.println("----------------------");
                System.out.println("Gracias, vuelva pronto!");
                System.out.println("-----------------------");
                bandera =2;
                
            }
        } while (bandera != 2);

    }
    
   public void Retiro(){
       retiro = entrada.nextInt();
        
    }
   
   public void Deposito(){
       deposito = entrada.nextInt();
   }
   
   public abstract void Transacciones();
   
    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
      
   }


