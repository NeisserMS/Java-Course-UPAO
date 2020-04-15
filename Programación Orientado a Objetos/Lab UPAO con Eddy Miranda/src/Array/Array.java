package Array;

public class Array{

    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);
        double[] a = new double[N];

        double maximo = 0, s = 0;

        for (int i = 0; i < N; i++) {
            a[i] = Math.random();

            if (a[i] > maximo) {
                maximo = a[i];
            }

            s = s + maximo;

            System.out.println("a" + "[" + i + "]=" + a[i]);
        }

        System.out.println("\nReferencia a=" + a);

        System.out.println("\nValor Maximo del Arreglo = " + maximo);

        System.out.println("\nPromedio del Arreglo = " + s);

        double[] b = new double[N];
        for (int i = 0; i < N; i++) {

            b[i] = a[i];

            System.out.println("b" + "[" + i + "]=" + b[i]);

        }

    }

}
