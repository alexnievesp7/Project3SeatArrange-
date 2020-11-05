import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Who will be seating wear?");
    
    int[] seats = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    
    for(int i = 0; i < 15; i++){
      System.out.println(seats[i]);
    }
    
    System.out.println("");
    String[] names = {"Hayden", "Anthony", "Alex", "Trey", "Stephany", "Kevin", "Oscar", "Micheal", "Pam", "Jim", " Kelly", "Kely", "Stanly", "Angela", "Dwight" }; 
    
    for(int i = 0; i < 15; i++){
      System.out.println(names[i]);
    }
    System.out.println("Where would you like to sit?");
    Scanner scan = new Scanner(System.in);



  }
}