package tyreso.gymnasium.cardgame;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class test {
    public static void main(String[] args) {
        Card testCard = new Card("Hearts", 1, false);
        System.out.println(testCard.value + testCard.suit + testCard.faceUp);

        testCard.flip();
        System.out.println("Flipping card");
        System.out.println(testCard.value + testCard.suit + testCard.faceUp);

        System.out.println("Flipping card twice");
        testCard.flip();
        System.out.println("After first flip");
        System.out.println(testCard.value + testCard.suit + testCard.faceUp);
        testCard.flip();
        System.out.println("After second flip");
        System.out.println(testCard.value + testCard.suit + testCard.faceUp);


    }
}
