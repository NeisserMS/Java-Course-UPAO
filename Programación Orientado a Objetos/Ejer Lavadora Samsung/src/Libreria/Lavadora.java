
package Libreria;

public class Lavadora {
    private int kilos = 0, llenadoCompleto = 0, TipoRopa = 0, LavadoCompleto = 0, secadoCompleto = 0;
    
    
public Lavadora(int kilos, int TipoRopa){
    this.kilos = kilos;
    this.TipoRopa = TipoRopa;
    
}
private void Llenado(){
    if ( kilos<=12) {
        llenadoCompleto = 1;
        System.out.println("Llenando...");
        System.out.println("Llenado Completo");
        
        
    } else {System.out.println("La carga de ropa es muy pesada, reduce la carga.");
        
    }
    }
private void Lavado(){
    Llenado();
    if(llenadoCompleto==1){
        if(TipoRopa == 1){
            System.out.println("Ropa Blanca / Lavado Suave");
            System.out.println("Lavando...");
            LavadoCompleto = 1;
            
        } else if(TipoRopa ==2){
            System.out.println("Ropa de Color / Lavado Intenso");
            System.out.println("Lavando...");
            LavadoCompleto = 1;
            
            
        } else{
            System.out.println("El tipo de ropa no esta disponible");
            System.out.println("Se lavara como ropa de color / Lavado intenso");
            LavadoCompleto = 1;
        }
            
        
    }
}
private void Secado(){
    Lavado();
    if(LavadoCompleto==1){
        System.out.println("Secando...");
        secadoCompleto = 1;
    }

}
    public void CicloFinalizado(){
        Secado();
        if(secadoCompleto ==1){
            System.out.println("Tu ropa esta Lista!");
        }
        
    }
    
     //Metodos set y get
        public int getTipoRopa(){
            return TipoRopa;
        }
    
        public void setTipoRopa(int TipoRopa){
            this.TipoRopa = TipoRopa;
        }
    
    



}
