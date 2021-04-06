package fortunerteller;
import  java.util.Scanner;

public class FortunerTeller {
    Scanner scanner = new Scanner(System.in);
    String[] fortunes = {
        "A dubious friend may be an enemy in camouflage.", 
        "Your success will astonish everyone.", 
        "You will soon be surrounded by good friends and laughter.", 
        "Many will travel to hear you speak.",
        "Now is a good time to buy stock.",
        "Physical activity will dramatically improve your outlook today.",
        "Say hello to others. You will have a happier day.",
        "You should be able to undertake and complete anything.",
        "You will be pleasantly surprised tonight.",
        "You will be traveling and coming into a fortune.",
    };
    int one, two, three;
    
    
    void getName() {
        System.out.println("What's your first name?");
        String name = scanner.next();
        one = name.length();
    }
    
    void getColor() {
        System.out.println("What's your favorite color?");
        String color = scanner.next();
        two = color.length();
    }
    
    void getFood() {
        System.out.println("What's your favorite food?");
        String food = scanner.next();
        three = food.length();
    }
    
    void askQuestions() {
        getName();
        getColor();
        getFood();
    }
    
    void tellFortune() {
        int res = one + two + three;
        res = res % fortunes.length;
        System.out.println(fortunes[res]);
    }
}
