import java.util.Random;
import java.util.Scanner;

public class MineMetoder {

    public MineMetoder() {

    }

    // opretter getWhile void metode
    void getWhile() {

        // Denne løkke(while) udskriver tal fra 0 til 10
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

    }

    //opretter getFor void metode
    void getFor()  {

        // Denne løkke(for) udskriver tal fra 0 til 10
        for (int i = 0; i <= 10; i++)   {
            System.out.print(i + " ");
        }

    }

    //opretter getRandom void metode
    void getRandom()    {

        // opretter random objekt af Random klassen
        Random random = new Random();

        // Udskriver et tilfældigt tal mellem 0 og 10
        System.out.println(random.nextInt(11));

    }

    //opretter getScanner void metode
    void getScanner()   {

        // opretter input objekt af klassen Scanner
        Scanner input = new Scanner(System.in);

        // Gemmer brugerens input i en String variabel
        String brugerensInput = input.next();

        // Udskriver hvad brugeren har skrevet
        System.out.println("Du har skrevet: " + brugerensInput);


    }

    // opretter getArray void metode
    void getArray() {
        // Laver et 5 * 5 array af datatypen int
        int[][] matrix = new int[5][5];

        // Skifter til næste række i arrayet
        for (int i = 0; i < 5; i++) {
            // Udfylder den ene række
            for (int j = 0; j < 5; j++) {
                // opretter random objekt af klassen Random
                Random random = new Random();

                // Gemmer et tal mellem 0 og 1 i matrix arrayet
                matrix[i][j] = random.nextInt(2);

                // Udskriver tallet i matrix
                System.out.print(matrix[i][j]);

            }
            // opretter ny linje
            System.out.println();
        }
    }
}
