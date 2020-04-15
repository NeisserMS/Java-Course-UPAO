
package ejemplos;


public class FuncionesTrignometricas {

    public static void main(String[] args) {
       //Programa para obtener el resultado en grados
       //Las funciones de math aceptan y devuelven en radianes, cuando son F.T.
        
       
       double resultado = 0;
       double anguloGrados = 45;
       double anguloRadianes = Math.toRadians(anguloGrados);
        
        //Calculando el seno con su metodo
        
        resultado = Math.sin(anguloRadianes);
        System.out.println("Seno de " + anguloGrados + " = " + resultado);
        
        //Calculando coseno
        resultado = Math.cos(anguloRadianes);
        System.out.println("Coseno de " + anguloGrados + " = " + resultado);
        
        //Tangente 
        
        resultado = Math.tan(anguloRadianes);
        System.out.println("Tangenge de " + anguloGrados + " = " + resultado);
        
        double valorIngresado = 0.707;
        
        anguloRadianes = Math.acos(valorIngresado);
        anguloGrados = Math.toDegrees(anguloRadianes);
        System.out.println("Arco coseno de: " + valorIngresado + " = " + anguloGrados + "°");
        
        
        
    }
    
}
