import java.util.Random;
import java.util.Scanner;

public class Main {
    //colors
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    public static void main(String[] args) {
        //valuables
        int guess,number,max;
        Scanner scanner =new Scanner(System.in);
        Random random =new Random();

        //main code
        System.out.println(PURPLE_BOLD+"sayi tahmin oyununa Hosgeldiniz!\nmax kaca kadar tutmak istersiniz?");
        max=scanner.nextInt();
        number=random.nextInt(max+1);
        while(true) {
            System.out.println(WHITE_BOLD+"\nsayiyi tuttum lutfen tahmin et!");
            guess = scanner.nextInt();
            if (guess == number) {
                System.out.println(GREEN_BOLD+"sayi dogrudur. tebrik ederim.");
                break;
            } else if (guess > number) {
                System.out.println(RED_BOLD+"tahmininiz tutugum sayidan buyuktur.");
                continue;
            } else if (guess < number) {
                System.out.println(RED_BOLD+"tahmininiz tutugum sayidan kucuktur");
                continue;
            }
        }
    }
}