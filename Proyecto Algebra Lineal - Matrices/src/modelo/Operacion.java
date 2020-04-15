package modelo;

import javax.swing.JOptionPane;

public class Operacion {

    /*Cuando todos los metodos de una clase son de tipo static 
     * no necesitas crear el objeto
     * que es eso?
     * Operacion objOperacion=new Operacion()
     * eso ya no vas hacer
     * Operacion.metodoQueDeses
     */
    public static Matriz matrizC;

    public static Matriz suma(Matriz matrizA, Matriz matrizB) {

        matrizC = new Matriz(matrizB.getNroFilas(), matrizB.getNroColumnas());

        Integer suma = 0;

        if ((matrizA.getNroFilas() == matrizB.getNroFilas())
                && (matrizA.getNroColumnas() == matrizB.getNroColumnas())) {
            for (int i = 0; i < matrizA.getNroFilas(); i++) {
                for (int j = 0; j < matrizA.getNroColumnas(); j++) {
                    suma = matrizA.getValor(i, j) + matrizB.getValor(i, j);
                    matrizC.setValor(i, j, suma);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dimensiones Incorrectas", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return matrizC;
    }

    public static Matriz multiplicacion(Matriz matrizA, Matriz matrizB) {
        Integer suma = 0;

        if (matrizA.getNroColumnas() == matrizB.getNroFilas()) {
            for (int i = 0; i < matrizA.getNroFilas(); i++) {
                for (int j = 0; j < matrizB.getNroColumnas(); j++) {

                    for (int k = 0; k < matrizB.getNroColumnas(); k++) {
                        suma += matrizA.getValor(i, k) * matrizB.getValor(k, j);
                        matrizC.setValor(i, j, suma);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dimensiones Incorrectas", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return matrizC;
    }

    public static String determinante(Matriz matrizA) {
        Integer nroFilas = matrizA.getNroFilas();
        float copiaMatrizA[][] = new float[nroFilas][nroFilas];

        float deter = 1;

        for (int i = 0; i < nroFilas; i++) {
            for (int j = 0; j < nroFilas; j++) {
                copiaMatrizA[i][j] = matrizA.getValor(i, j);
            }
        }

        for (int k = 0; k < (nroFilas - 1); k++) {
            for (int i = (k + 1); i < nroFilas; i++) {
                for (int j = (k + 1); j < nroFilas; j++) {
                    copiaMatrizA[i][j] -= copiaMatrizA[i][k] * copiaMatrizA[k][j] / copiaMatrizA[k][k];
                }
            }
        }

        for (int i = 0; i < nroFilas; i++) {
            deter *= copiaMatrizA[i][i];
        }
        String CAD = "";

        CAD = "" + deter;

        return CAD;
    }

    public static String inversa(Matriz matrizA) {
        //suponemos A es cuadrada : filas=columnas
        Integer nroFilas = matrizA.getNroFilas();
        float copiaMatrizA[][] = new float[nroFilas][nroFilas];
        float B[][] = new float[nroFilas][nroFilas];
        float C[][] = new float[nroFilas][nroFilas];


        for (int i = 0; i < nroFilas; i++) {
            for (int j = 0; j < nroFilas; j++) {
                copiaMatrizA[i][j] = matrizA.getValor(i, j);
                C[i][j] = 0;
                if (i == j) {
                    B[i][j] = 1;
                } else {
                    B[i][j] = 0;
                }
            }
        }
        for (int k = 0; k < (nroFilas - 1); k++) {
            for (int i = (k + 1); i < nroFilas; i++) {
                for (int s = 0; s < nroFilas; s++) {
                    B[i][s] -= copiaMatrizA[i][k] * B[k][s] / copiaMatrizA[k][k];
                }
                for (int j = (k + 1); j < nroFilas; j++) {
                    copiaMatrizA[i][j] -= copiaMatrizA[i][k] * copiaMatrizA[k][j] / copiaMatrizA[k][k];
                }
            }
        }

        for (int s = 0; s < nroFilas; s++) {
            C[nroFilas - 1][s] = B[nroFilas - 1][s] / copiaMatrizA[nroFilas - 1][nroFilas - 1];
            for (int i = (nroFilas - 2); i >= 0; i--) {
                C[i][s] = B[i][s] / copiaMatrizA[i][i];
                for (int k = (nroFilas - 1); k > i; k--) {
                    C[i][s] -= copiaMatrizA[i][k] * C[k][s] / copiaMatrizA[i][i];
                }
            }
        }
        String CAD = "";
        for (int i = 0; i <= (nroFilas - 1); i++) {
            for (int j = 0; j <= (nroFilas - 1); j++) {

                CAD = CAD + C[i][j] + "\t";
            }
            CAD = CAD + "\n";

        }
        return CAD;
    }

    public static String adjunta(Matriz matrizA) {
        Integer n = matrizA.getNroFilas();
        float CopiaA[][] = new float[n][n];
        float ADJ[][] = new float[n][n];
        String CAD = "";
        float C, det;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                CopiaA[i][j] = matrizA.getValor(i, j);
            }
        }

        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                for (int k = i; k <= n - 2; k++) {
                    for (int l = 0; l <= n - 1; l++) {
                        C = CopiaA[k + 1][l];
                        CopiaA[k][l] = C;
                    }
                }
                for (int k = j; k <= n - 2; k++) {
                    for (int l = 0; l <= n - 1; l++) {
                        C = CopiaA[l][k + 1];
                        CopiaA[l][k] = C;
                    }
                }

                det = DETER(CopiaA, n - 1);
                ADJ[i][j] = det * (float) Math.pow(-1, j + i);

                for (int i2 = 0; i2 < n; i2++) {
                    for (int j2 = 0; j2 < n; j2++) {
                        CopiaA[i2][j2] = matrizA.getValor(i2, j2);
                    }
                }


            }
        }

        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                CAD = CAD + ADJ[i][j] + "\t";

            }
            CAD = CAD + "\n";
        }
        return CAD;

    }

    public static float DETER(float A[][], int n) {

        for (int k = 0; k < n - 1; k++) {
            for (int i = k + 1; i < n; i++) {
                for (int j = k + 1; j < n; j++) {
                    A[i][j] -= A[i][k] * A[k][j] / A[k][k];
                }
            }
        }
        float deter = 1;

        for (int i = 0; i < n; i++) {
            deter *= A[i][i];
        }
        return deter;
    }

    public static String transpuesta(Matriz matrizA) {
        int NFA, NCA;
        String CAD = "";

        NFA = matrizA.getNroFilas();
        NCA = matrizA.getNroColumnas();

        for (int j = 0; j <= NCA - 1; j++) {
            for (int i = 0; i <= NFA - 1; i++) {

                CAD = CAD + matrizA.getValor(i, j) + "\t";
            }
            CAD = CAD + "\n";

        }
        return CAD;
    }

    public static String diagonal(Matriz matrizA) {
        int NFA, NCA, num;
        String CAD = "";
        NFA = matrizA.getNroFilas();
        NCA = matrizA.getNroColumnas();
        if (NFA == NCA) {
            for (int i = 0; i <= NFA - 1; i++) {
                for (int j = 0; j <= NCA - 1; j++) {
                    if (i == j) {
                        CAD = CAD + matrizA.getValor(i, j) + "\t";
                    } else {
                        CAD = CAD + 0 + "\t";
                    }
                }
                CAD = CAD + "\n";
            }

        } else {
            JOptionPane.showMessageDialog(null, "Dimensiones Incorrectas", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return CAD;
    }

    public static Matriz resta(Matriz matrizA, Matriz matrizB) {
        int NFA, NFB, NCA, NCB;

        Integer resta = 0;
        NFA = matrizA.getNroFilas();
        NCA = matrizA.getNroColumnas();

        NFB = matrizB.getNroFilas();
        NCB = matrizB.getNroColumnas();

        if ((NFA == NFB) && (NCA == NCB)) {
            for (int i = 0; i <= NFA - 1; i++) {
                for (int j = 0; j <= NCA - 1; j++) {
                    resta = matrizA.getValor(i, j) - matrizB.getValor(i, j);
                    matrizC.setValor(i, j, resta);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dimensiones Incorrectas", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return matrizC;
    }

}