import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rozhrani rozhrani=new Rozhrani();
        Scanner scanner=new Scanner(System.in);
        System.out.println(rozhrani.start());
        String sc= scanner.next();
        System.out.println(rozhrani.Trida());
        int s= scanner.nextInt();
        Postava hrac = rozhrani.vyberTridy(sc,s);
        System.out.println(rozhrani.Rasa());
    }
}