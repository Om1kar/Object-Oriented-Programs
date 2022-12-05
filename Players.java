package DeckOfCards;

import java.util.Scanner;

public class Players {
    public static void main(String[] args) {
        System.out.println("\n1.View cards of 4 Players");
        System.out.println("Enter Choice :");
        DeckOfCards card = new DeckOfCards();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                card.getCardCombination();
                card.getPlayer();
                break;
            default:
                System.out.println("!!invalid input!!");
                break;
        }
    }
}
