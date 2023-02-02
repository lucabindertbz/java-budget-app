import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    // Create a Scanner object
    private Scanner scanner = new Scanner(System.in);
    // Reference to a Budget object
    private Budget budget;

    // Constructor that takes a Budget object as argument
    public Menu(Budget budget) {
        this.budget = budget;
    }

    // Displays the main menu options
    public void displayMenu() {
        // Infinite loop for the menu
        while (true) {
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Income Categories");
            System.out.println("4. View Expense Categories");
            System.out.println("5. Calculate Balance");
            System.out.println("6. Calculate Savings");
            System.out.println("7. Exit");

            // Try to read an integer as the option
            int option = 0;
            try {
                option = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                // If the input is not an integer, show an error message and continue the loop
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }

            // Perform the action based on the option chosen
            switch (option) {
                case 1:
                    addIncome();
                    break;
                case 2:
                    addExpense();
                    break;
                case 3:
                    viewIncomeCategories();
                    break;
                case 4:
                    viewExpenseCategories();
                    break;
                case 5:
                    calculateBalance();
                    break;
                case 6:
                    calculateSavings();
                    break;
                case 7:
                    System.out.println("Program closed");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // addIncome method prompts the user to enter the source of income, amount, date, category, and note
    private void addIncome() {
        // prompt the user to enter source of income
        System.out.println("Enter source of income: ");
        String source = scanner.nextLine();

        // prompt the user to enter amount
        System.out.println("Enter amount: ");
        double amount;
        try {
            amount = scanner.nextDouble();
        } catch (InputMismatchException e) {
            // catch exception if the input is not a number
            System.out.println("Invalid amount. Please enter a number.");
            scanner.nextLine();
            return;
        }
        // consume the new line character
        scanner.nextLine();

        // prompt the user to enter date in the format yyyy-mm-dd
        System.out.println("Enter date in the format yyyy-mm-dd:");
        LocalDate date;
        try {
            date = LocalDate.parse(scanner.nextLine());
        } catch (DateTimeParseException e) {
            // catch exception if the date format is incorrect
            System.out.println("Invalid date format. Please try again.");
            return;
        }

        // prompt the user to enter category
        System.out.println("Enter category:");
        String category = scanner.nextLine();

        // prompt the user to enter note
        System.out.println("Enter note:");
        String note = scanner.nextLine();

        // add the income to the budget
        budget.addIncome(new Income(source, amount, date, category, note));
    }

    // addExpense method prompts the user to enter the category of expense, amount, description, and date
    private void addExpense() {
        // prompt the user to enter the category of expense
        System.out.println("Enter category of expense: ");
        String category = scanner.nextLine();

        // prompt the user to enter amount
        System.out.println("Enter amount: ");
        double amount;
        try {
            amount = scanner.nextDouble();
            // consume the new line character
            scanner.nextLine();
        } catch (InputMismatchException e) {
            // catch exception if the input is not a number
            System.out.println("Invalid amount. Please enter a number.");
            scanner.nextLine();
            return;
        }

        // prompt the user to enter description
        System.out.println("Enter description: ");
        String description = scanner.nextLine();

        // prompt the user to enter date in the format yyyy-mm-dd
        System.out.println("Enter date in the format yyyy-mm-dd:");
        LocalDate date;
        try {
            date = LocalDate.parse(scanner.nextLine());
        } catch (DateTimeParseException e) {
            // catch exception if the date format is incorrect
            System.out.println("Invalid date format. Please try again.");
            return;
        }

        // add the expense to the budget
        budget.addExpense(new Expense(amount, category, description, date));
    }

    private void viewIncomeCategories() {
        // Try to print out the categories of income and their amounts
        try {
            for (String category : budget.getIncomeCategories().keySet()) {
                System.out.println(category + ": $" + budget.getIncomeCategories().get(category));
            }
        }
        // Catch NullPointerException if there is no income category found
        catch (NullPointerException e) {
            System.out.println("No income categories found. Please add some income first.");
        }
    }


    private void viewExpenseCategories() {
        // Loop through the categories of expenses and print out the categories and their amounts
        for (String category : budget.getExpenseCategories().keySet()) {
            System.out.println(category + ": $" + budget.getExpenseCategories().get(category));
        }
    }

    private void calculateBalance() {
        // Try to calculate and print out the balance of income and expenses
        try {
            double totalIncome = budget.getTotalIncome();
            double totalExpenses = budget.getTotalExpenses();
            double balance = totalIncome - totalExpenses;
            System.out.println("Total Income: $" + totalIncome);
            System.out.println("Total Expenses: $" + totalExpenses);
            System.out.println("Balance: $" + balance);
        }
        // Catch ArithmeticException if there is an error in the calculation
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occured: " + e.getMessage());
        }
    }


    private void calculateSavings() {
        // Try to calculate and print out the savings amount
        try {
            double savings = budget.getTotalIncome() - budget.getTotalExpenses();
            System.out.println("Savings: $" + savings);
        }
        // Catch ArithmeticException if there is an error in the calculation
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occured: " + e.getMessage());
        }
    }
}
