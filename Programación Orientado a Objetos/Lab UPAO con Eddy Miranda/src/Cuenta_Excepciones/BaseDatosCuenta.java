
package Cuenta_Excepciones;
public class BaseDatosCuenta {
    protected Cuenta cuentas[];
    protected int numerodecuentas;

    public BaseDatosCuenta() {
        cuentas = new Cuenta[20];
        numerodecuentas=0;
        
    }
    
    public void AgregarCuenta(Cuenta oC)
    {    
        if(numerodecuentas<20)
        {
            cuentas[numerodecuentas]=oC;
            numerodecuentas++;
        }
    
    }
    
    public void MostrarCuenta()
    {
         for(int i=0;i<numerodecuentas;i++)
     {
         
         System.out.println(cuentas[i]);
         System.out.println("");
     }
     System.out.println("La cantidad de cuentas creadas es: " + numerodecuentas);
    }
    
    
}



