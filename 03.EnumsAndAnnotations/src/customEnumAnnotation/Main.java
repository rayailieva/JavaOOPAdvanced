package customEnumAnnotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final String OUTPUT = "Type = %s, Description = %s";
    private static final String RANK_TYPE = "Rank";
    private static final String SUIT_TYPE = "Suit";

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        if (RANK_TYPE.equals(input)) {
            Class<Rank> rankTypeClass = Rank.class;
            printCustomEnumAnnotation(rankTypeClass);
        } else if (SUIT_TYPE.equals(input)) {
            Class<Suit> suitTypeClass = Suit.class;
            printCustomEnumAnnotation(suitTypeClass);
        }
    }

    private static void printCustomEnumAnnotation(Class<?> clazz) {
        if (clazz.isAnnotationPresent(CustomEnumAnnotation.class)) {
            CustomEnumAnnotation annotation = clazz.getAnnotation(CustomEnumAnnotation.class);
            System.out.println(String.format(OUTPUT,
                    annotation.type(),
                    annotation.description()));
        }
    }
}
