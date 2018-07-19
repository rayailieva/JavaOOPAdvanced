package cardRank;

public class Main {
    public static void main(String[] args) {

        Rank[] ranks = Rank.values();

        System.out.println("Card Ranks:");

        for(Rank rank : ranks){
            System.out.println(rank.toString());
        }
    }
}
