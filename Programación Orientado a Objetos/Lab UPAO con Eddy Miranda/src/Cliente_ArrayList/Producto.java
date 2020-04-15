
package Cliente_ArrayList;


public class Producto{
    
    private String codigo;
    private String descripcion;
    private float precio;
    private float precio2;
    

    public Producto(String codigo, String descripcion, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    
    public float pagoTotal(float precio2){
        
        return precio + precio2;
    }
   
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\nPRODUCTO:" + "\nCodigo: " + codigo + "\nDescripcion:" + descripcion + "\nPrecio: " + precio;
    }   
}


