package Cuenta_Bancaria;
public class Prueba {
    public static void main(String[] args){
        Medible[]cuenta=new Medible[3];
        cuenta[0]=new CuentaBancaria("Neisser",100.50);
        cuenta[1]=new CuentaBancaria("Jair",50.20);
        cuenta[2]=new CuentaBancaria("Karen",10.5);
        todo(cuenta);
        System.out.println("\nSaldo promedio de las cuentas: "+promedio(cuenta));
        System.out.println("\nCuenta con mayor dinero: "+maximo(cuenta));
                
        Medible[]pais=new Medible[3];
        pais[0]=new Pais("Bolívia",105152541);
        pais[1]=new Pais("Chile",508765);
        pais[2]=new Pais("Perú",820012458);
        todo(pais);
        System.out.println("\nPromedio de las superficies: "+promedio(pais));
        System.out.println("\nPaís con mayor extensión: "+maximo(pais));
    }
 
    private static double promedio(Medible[]o) {
         if (o.length==0){
            return 0;
        }
        double suma=0;
        for(int i=0;i<o.length;i++)
            suma =suma +o[i].obtenerMedida();
            return suma/o.length;
     
    }
    
    private static double maximo(Medible[]o){
        if (o.length==0){
            return 0;
        }
        double max= o[0].obtenerMedida();
        for(int i=0;i<o.length;i++){
            if(max<o[i].obtenerMedida()){
                max= o[i].obtenerMedida();
            }
        }
        return max;
    }
    private static void todo(Medible[]o){
        for(int i=0;i<o.length;i++){
            System.out.print(o[i].toString());
        }
    }
    
}
