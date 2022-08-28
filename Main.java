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
        int adult = (father+mother)/2;
        System.out.println("Your previous height was "+height+"cm\nYour Adult height will be "+adult+"cm");
    }
}