
package polimorfismo;

public class Prueba {

    public static void main(String[] args) {
        
        Cajero mesajero = new Clase_hija();
        mesajero.setSaldo(5);
        mesajero.Operaciones();
    }
    
}

