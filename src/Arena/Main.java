package Arena;

import Arena.Tridy.Postava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s=0;
        Rozhrani rozhrani=new Rozhrani();
        Scanner scanner=new Scanner(System.in);
        while(s!=10){
            System.out.println(rozhrani.start());
            String sc= scanner.next();
            System.out.println(rozhrani.Trida());
            s= scanner.nextInt();
            Postava hrac = rozhrani.vyberTridy(sc,s);
            System.out.println(rozhrani.Rasa());
            s= scanner.nextInt();
            rozhrani.vyberRasy(hrac,s);
            System.out.println(hrac);
        }

    }
}