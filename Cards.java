import java.util.*;
import java.io.*;
class card{
    String kind;//kind is the four categories of cards.
    String value;// value means is it ace or 5 or king, etc.
    card(String val,String knd)
    {
        this.kind=knd;
        this.value=val;
    }
}

public class Cards{
    public static void main(String[] args)
    {
        String[] kind_of_cards={"Heart","spade","club","Diamond"};
        String[] value_of_cards={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        System.out.println("Here is your random card");
        card card_new=new card(value_of_cards[getRandomNumber(0,12)],kind_of_cards[getRandomNumber(0,3)]);
        System.out.println(card_new.value+" of "+card_new.kind);
    }
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    //just run the program as many times to get random card from deck.
}