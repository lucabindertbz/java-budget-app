import java.time.LocalDate;

public class Income {
    private String source;
    private double amount;
    private LocalDate date;
    private String category;
    private String note;

    public Income(String source, double amount, LocalDate date, String category, String note) {
        this.source = source;
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.note = note;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
