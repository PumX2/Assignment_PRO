package view;

import controller.*;
import static controller.CardManager.in;
import controller.Validation;
import java.util.ArrayList;
import model.*;
import java.io.FileNotFoundException;
import java.text.ParseException;

public class Main extends Menu {
    static String[] mc = {"Show Card", "Show Transaction", "Add new card", "Transaction", "Three Card Largest", "Total Transaction Same Day", "Five Transaction Largest Of Day", "Exit."};
    ArrayList<Card> cards = new ArrayList<>();
    ArrayList<Transaction> transactions = new ArrayList<>();
    
    
    
    
    public Main() throws FileNotFoundException, ParseException {
        super("COMPANY MANAGEMENT SYSTEM", mc);
        CardManager.readFile("C:\\HUNG\\DEV\\JAVA\\LAB211_Lab6_CardManage\\src\\model\\transaction.txt", transactions);
        CardManager.readFileCard("C:\\HUNG\\DEV\\JAVA\\LAB211_Lab6_CardManage\\src\\model\\card.txt", cards);
    }
//--------------------------------------------------------

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:CardManager.showCard(cards);
                break;
            case 2:CardManager.showTransaction(transactions);
                break;
            case 3:CardManager.addNewCard(cards);
                break;
            case 4:CardManager.transaction(cards, transactions);
                break;
            case 5:CardManager.threeCardLargest(transactions);
                break;
            case 6:CardManager.totalTransSameDay(transactions);
                break;
            case 7:CardManager.fiveTransLargestOfDay(transactions);
                break;
            case 8:
                System.out.println("Thank You...");
                System.exit(0);
        }
        
    }
//-------------------------------------------------------

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        new Main().run();
    }
}