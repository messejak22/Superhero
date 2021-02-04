import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        welcome();
    }
    
    public static void welcome() {
        Scanner scan = new Scanner(System.in);
        String password = "I'm Batman";
        System.out.println("Enter secure password: ");
        String x = scan.nextLine();
        if (x.equals(password)) {
            System.out.println("Welcome Special Agent to the Superehero data base.");
            System.out.println("Enter (1) DC heroes (2) Marvel heroes");
            int y = scan.nextInt();
            if (y == 1) {
                

            } else {

            }
        } else {
            System.out.println("What ever your planning, it's too late...");
        }
    }

    public void databaseDC() {
        Superhero s1 = new Superhero("Batman", "Extreme inteligence", "Batsuit", "It's too late", 10);
        Superhero s2 = new Superhero("Superman", "Strength, flying, lazer eyes", "Red suit", "kryptonite", 10 );
        Superhero s3 = new Superhero("Wonder Woman", "Strength, flying, lasso of truth", "Bikini?", "bullets", 8);
        Superhero s4 = new Superhero("Aquaman", "He talks to fish", "Loser pajamas", "a slap in the face", 0);
    }

    public void databaseMarvel() {
        Superhero s5 = new Superhero("Ironman", "A fully armor suit", "Red armor", "hacking", 7);
        Superhero s6 = new Superhero("Spiderman", "Web shooting", "red spider costume", "bug repellent", 5);
        Superhero s7 = new Superhero("Hawkeye", "arrow shooting ", "jump suit", "gun", 0); 
    }


    
}


