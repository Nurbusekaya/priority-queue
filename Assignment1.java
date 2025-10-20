import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Canavarın adı
        System.out.print("Enter your monster's name: ");
        String name = input.nextLine();

        // Element seçimi
        System.out.println("Choose your monster's element: (1-Fire , 2-Water , 3-Earth)");
        System.out.print("Enter 1, 2, or 3: ");
        int element = input.nextInt();

        if (element < 1 || element > 3) {
            System.out.println("Invalid element choice! Must be 1 -3.");
            return;
        }

        //Potansiyel seçimi
        System.out.println("Choose your monster's potential:");
        System.out.println("1. Normal");
        System.out.println("2. Rare");
        System.out.print("Enter 1 or 2: ");
        int potential = input.nextInt();

        if (potential != 1 && potential != 2) {
            System.out.println("Invalid potential choice! Must be 1 (Normal) or 2 (Rare).");
            return;
        }

        //Kader sayısı
        System.out.print("Enter your monster's Destiny Number (1-10): ");
        int destiny = input.nextInt();

        if (destiny < 1 || destiny > 10) {
            System.out.println("Invalid destiny number! Must be between 1 and 10.");
        }

        //Başlangıç statları
        int hp = 50;
        int ap = 10;
        int dp = 5;

        //Element bonusları
        if (element == 1) {         
            ap += 5;
        } else if (element == 2) {  
            hp += 20;
        } else if (element == 3) {  
            dp += 10;
        }

        //Potansiyel bonusu
        if (potential == 2) { 
            hp += 10;
            ap += 10;
            dp += 10;
        }

        //Kader sayısı
        if (element == 1) {        
            ap += destiny;
        } else if (element == 2) { 
            hp += destiny;
        } else if (element == 3) { 
            dp += destiny;
        }
        
        String elementName;
if (element == 1) {
    elementName = "Fire";
} else if (element == 2) {
    elementName = "Water";
} else {
    elementName = "Earth";
}
        String potentialName;

if (potential == 1) {
    potentialName = "Normal";
} else {
    potentialName = "Rare";
}


        //Çıktı
        System.out.println("\n====== Monster's Profile ======");
        System.out.println("Name       : " + name);
        System.out.println("Element    : " + elementName);
        System.out.println("Potential  : " + potentialName);
        System.out.println("HP         : " + hp);
        System.out.println("AP         : " + ap);
        System.out.println("DP         : " + dp);
        input.close();
    }
}