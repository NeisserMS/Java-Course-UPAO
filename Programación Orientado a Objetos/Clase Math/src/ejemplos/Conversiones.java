
package ejemplos;

public class Conversiones {

    public static void main(String[] args) {
        double anguloGrados = 45;
        double anguloRadianes = Math.toRadians(anguloGrados);
        System.out.println("Deg a Rad " + anguloGrados + " = " + anguloRadianes + "rad");
        
        anguloGrados = Math.toDegrees(anguloRadianes);
        System.out.println("Rad a Deg " + anguloRadianes + " = " + anguloGrados + "Deg");
        
    }
    
}
