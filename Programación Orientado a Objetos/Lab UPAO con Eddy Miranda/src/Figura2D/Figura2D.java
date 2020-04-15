package Figura2D;

public abstract class Figura2D {

    //Atributos
    float dim1;
    float dim2;

    //Constructor
    public Figura2D(float dim1, float dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract float area();// Metodo abstract

    @Override
    public String toString() {

        return "\n La Dimensionn 1 es:" + dim1
                + "\n La Dimension 2 es:" + dim2
                + "\n El area es :" + area();

    }

}
