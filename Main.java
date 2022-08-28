
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Your current Height: ");
            int height = sc.nextInt();
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Your Fathers Height: ");
            int father = sc.nextInt();
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Your Mothers Height: ");
            int mother = sc.nextInt();
            int adultboy = (int) ((father+mother)/2+2.5);
            int adultgirl = (int) ((father+mother)/2-2.5);
            System.out.println("Your Future Height as a Male would be "+adultboy+"cm");
            System.out.println("Your Future Height as a Female would be "+adultgirl+"cm");
        }
    }
