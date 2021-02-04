import java.util.Scanner;
import java.util.ArrayList;
public class Tester {
    public static void main(String[] args) {
        welcome();
    }
    
    public static void welcome() {
        Scanner scan = new Scanner(System.in);
        String password = "I'm Batman";
        // ability to login into a secure server!
        System.out.println("Enter secure password: ");
        String x = scan.nextLine();
        // verifies password
        if (x.equals(password)) {
            System.out.println("Welcome Special Agent to the Superehero data base.");
            System.out.println("Enter (1) DC heroes (2) Marvel heroes");
            int y = scan.nextInt();
            if (y == 1) {
                databaseDC();
            } else {
                databaseMarvel();
            }
        } else {
            System.out.println("What ever your planning, it's too late...");
        }
        scan.close();
    }

    public static void databaseDC() {
        Scanner scan = new Scanner(System.in);
        Superhero s1 = new Superhero("Name: Batman ", "Power: Extreme inteligence ", "Costume: Batsuit ", "Weakness: It's too late ", "Threat level: 10 ");
        Superhero s2 = new Superhero("Name: Superman ", "Power: Strength, flying, lazer eyes ", "Costume: Red suit ", "Weakness: kryptonite ", "Threat level: 10 " );
        Superhero s3 = new Superhero("Name: Wonder Woman ", "Power: Strength, flying, lasso of truth ", "Costume: Bikini? ", "Weakness: bullets ", "Threat level: 8");
        Superhero s4 = new Superhero("Name: Aquaman ", "Power: He talks to fish ", "Costume: Loser pajamas ", "Weakness: a slap in the face ", "Threat level: 0");
        // list of all heroes 
        ArrayList<Superhero> data = new ArrayList<Superhero>();
        data.add(s1);
        data.add(s2);
        data.add(s3);
        data.add(s4);
        // allows for user to print specific data type
        System.out.println("Enter (1) Just list names (2) List all");
        int z = scan.nextInt();
        if (z == 1) {
            for (int i = 0; i < data.size(); i++) {
                System.out.println(data.get(i).getName());               
            }
        } else {
            for (int i = 0; i < data.size(); i++) {
                System.out.println(data.get(i));
            }
        }
    }

    public static void databaseMarvel() {
        Scanner scan = new Scanner(System.in);
        Superhero s5 = new Superhero("Name: Ironman ", "Power: A fully armor suit ", "Costume: Red armor ", "Weakness: hacking ", "Threat level: 7 ");
        Superhero s6 = new Superhero("Name: Spiderman ", "Power: Web shooting", "Costume: red spider costume ", "Weakness: bug repellent ", "Threat level: 5 ");
        Superhero s7 = new Superhero("Name: Hawkeye ", "Power: arrow shooting ", "Costume: jump suit", "Weakness: gun ", "Threat level: 0 "); 
        Superhero s8 = new Superhero("Name: Black Widow ", "Power: gun and fighting ", "Costume: jump suit ", "Weakness: Mortal ", "Threat level: 4 ");
        // list of heroes 
        ArrayList<Superhero> list = new ArrayList<Superhero>();
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);
        // allows user to print specific data type
        System.out.println("Enter (1) Just list names (2) List all");
        int z = scan.nextInt();
        if (z == 1) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getName());               
            }
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        } // end else
    } // end marvel method 


    
}


