import java.time.LocalDate;

public class Expense {
    private double amount;
    private String category;
    private String description;
    private LocalDate date;

    public Expense(double amount, String category, String description, LocalDate date) {
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
