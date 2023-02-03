import java.time.LocalDate;
// Class definition for Income object
public class Income {
    // Declare instance variables
    private String source;    // The source of the income
    private double amount;    // The amount of the income
    private LocalDate date;  // The date of the income
    private String category;  // The category of the income
    private String note;      // Additional notes about the income

    // Constructor to initialize instance variables
    public Income(String source, double amount, LocalDate date, String category, String note) {
        this.source = source;
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.note = note;
    }

    // Getter for source
    public String getSource() {
        return source;
    }

    // Setter for source
    public void setSource(String source) {
        this.source = source;
    }

    // Getter for amount
    public double getAmount() {
        return amount;
    }

    // Setter for amount
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Getter for date
    public LocalDate getDate() {
        return date;
    }

    // Setter for date
    public void setDate(LocalDate date) {
        this.date = date;
    }

    // Getter for category
    public String getCategory() {
        return category;
    }

    // Setter for category
    public void setCategory(String category) {
        this.category = category;
    }

    // Getter for note
    public String getNote() {
        return note;
    }

    // Setter for note
    public void setNote(String note) {
        this.note = note;
    }
}
