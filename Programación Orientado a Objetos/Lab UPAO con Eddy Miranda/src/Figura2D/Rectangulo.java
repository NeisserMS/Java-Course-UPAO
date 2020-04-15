
package Figura2D;

public class Rectangulo extends Figura2D {

    public Rectangulo(float l, float a) {
        super(l, a);
    }

    @Override
    public float area() {
        return dim1 * dim2;

    }

}
