package cardCompareTo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Rank rank1 = Rank.valueOf(scanner.nextLine());
        Suit suit1 = Suit.valueOf(scanner.nextLine());

        Card card1 = new Card(suit1,rank1);

        Rank rank2 = Rank.valueOf(scanner.nextLine());
        Suit suit2 = Suit.valueOf(scanner.nextLine());

        Card card2 = new Card(suit2,rank2);

       if(card1.compareTo(card2) == 1){
           System.out.println(card1.toString());
       }else{
           System.out.println(card2.toString());
       }
    }
}
