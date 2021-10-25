import java.util.Scanner;

public class PotengaRekurencja {
    public static void main(String[] args) {

            Scanner scaner = new Scanner(System.in);

            System.out.println("Podaj podstawe potegi");
            int podstawa = scaner.nextInt();
            System.out.println("Podaj wykładnik potegi");
            int wykladnik = scaner.nextInt();
            potegowanie(podstawa, wykladnik);


        }

        public static int potegowanie(int pod, int wyk) {

            if (wyk == 0) {
                System.out.println("1");
                return 1;
            } else {
                int potega = pod * potegowanie(pod, wyk - 1);
                System.out.println(potega);
                return (potega);

            }



        }
    }

