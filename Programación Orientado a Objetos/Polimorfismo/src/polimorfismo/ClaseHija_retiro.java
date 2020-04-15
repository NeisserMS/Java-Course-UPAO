
package polimorfismo;

public class ClaseHija_retiro extends Cajero {
    
    @Override
    public void Transacciones(){
        
        System.out.print("¿Cuanto deseas retirar?");
        Retiro(); //Invocamos al metodo retiro
        if (retiro <= getSaldo()) { //El retiro tiene que ser menor al saldo
            transacciones = getSaldo(); // el saldo se guarda en transacciones
            setSaldo(transacciones - retiro);
                System.out.println("---------------------------------");
                System.out.println("Retiraste: " + retiro);
                System.out.println("Tu saldo actual es: " + getSaldo());
                System.out.println("----------------------------------");
        
        } else{ System.out.println("------------------");
                System.out.println("Saldo insuficiente.");
                System.out.println("-------------------");
        
        }
        
    
        
    }
    
}
