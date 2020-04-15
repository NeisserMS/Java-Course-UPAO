package Clases;

public class Juego_cartas {

    public static void main(String[] args) {
        
       String carta[] = {"Diamantes", "Corazones", "Flores", "Espadas"};
        String rango[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "AS"};
        

        String[] baraja = new String[52];
        
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                baraja[4 * i + j] = rango[i] + " de " + carta[j];
            }
        }
        
        System.out.println("-------EN ORDEN------");
        
        for (int i = 0; i < 52; i++) {
            System.out.println(baraja[i]);
        }

        int N = rango.length * carta.length;

        String[] random = new String[N];
        if (N == 52) {
            for (int i = 0; i < N; i++) {
                int r = i + (int) (Math.random() * (N - i));
                random[i] = baraja[r];
                baraja[r] = baraja[i];
                baraja[i] = random[i];
            }
        } else {
            for (int i = 0; i < N; i++) {
                random[i] = baraja[(int) (Math.random() * 52)];
            }
        }
        
        System.out.println("\n------AL AZAR-----");
        
        for (int i = 0; i < N; i++) {
            System.out.println(baraja[i]);
        }

    }

}
