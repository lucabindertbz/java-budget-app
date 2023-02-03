// Import statement for the LocalDate class from java.time package
import java.time.LocalDate;

public class Expense {
    // Instance variable to store the amount of the expense
    private double amount;
    // Instance variable to store the category of the expense
    private String category;
    // Instance variable to store the description of the expense
    private String description;
    // Instance variable to store the date of the expense
    private LocalDate date;

    // Constructor to initialize the Expense object with specified values
    public Expense(double amount, String category, String description, LocalDate date) {
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = date;
    }

    // Getter method to retrieve the amount of the expense
    public double getAmount() {
        return amount;
    }

    // Setter method to set the amount of the expense
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Getter method to retrieve the category of the expense
    public String getCategory() {
        return category;
    }

    // Setter method to set the category of the expense
    public void setCategory(String category) {
        this.category = category;
    }

    // Getter method to retrieve the description of the expense
    public String getDescription() {
        return description;
    }

    // Setter method to set the description of the expense
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter method to retrieve the date of the expense
    public LocalDate getDate() {
        return date;
    }

    // Setter method to set the date of the expense
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
