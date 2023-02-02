//Main class to run the program
public class Main {
    public static void main(String[] args) {
        //Create a Budget object
        Budget budget = new Budget();
        //Create a Menu object and pass the Budget object to it
        Menu menu = new Menu(budget);
        //Display the menu
        menu.displayMenu();
    }
}
