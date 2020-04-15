package Figura2D;

public class Triangulo extends Figura2D {

    public Triangulo(float dim1, float dim2) {
        super(dim1, dim2);
    }

    @Override
    public float area() {
        return dim1 * dim2;

    }

}
