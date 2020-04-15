
package polimorfismo;

public class Clasehija_Deposito  extends Cajero{

   @Override 
    public void Transacciones(){
        System.out.println("¿Cuanto deseas Depositar?");
        Deposito();
        
        transacciones = getSaldo();
        
        setSaldo(transacciones + deposito);
        System.out.println("Depositaste : " + deposito);
        System.out.println("Tu saldo actual es: " + getSaldo());
        
    
    }
    
    
    
    
}
