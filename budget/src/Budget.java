import java.util.HashMap;
import java.util.Map;

public class Budget {
    private double income;
    private double expenses;
    private Map<String, Double> incomeCategories;
    private Map<String, Double> expenseCategories;

    // Constructor
    public Budget(double income, double expenses) {
        this.income = income;
        this.expenses = expenses;
        this.incomeCategories = new HashMap<>();
        this.expenseCategories = new HashMap<>();
    }

    public Budget() {
        this(0, 0);
    }

    // Getters
    public double getIncome() {
        return income;
    }

    public double getExpenses() {
        return expenses;
    }

    public Map<String, Double> getIncomeCategories() {
        return incomeCategories;
    }

    public Map<String, Double> getExpenseCategories() {
        return expenseCategories;
    }

    // Setters
    public void setIncome(double income) {
        this.income = income;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    //Methods
//    public double calculateBalance(){
//        return income - expenses;
//    }
//
//    public double calculateSavings(){
//        return income - expenses;
//    }

    public void addIncome(Income income) {
        String category = income.getSource();
        double amount = income.getAmount();
        if (incomeCategories.containsKey(category)) {
            amount += incomeCategories.get(category);
        }
        incomeCategories.put(category, amount);
    }

    public void addExpense(Expense expense) {
        String category = expense.getCategory();
        double amount = expense.getAmount();
        if (expenseCategories.containsKey(category)) {
            amount += expenseCategories.get(category);
        }
        expenseCategories.put(category, amount);
    }

    public double getTotalIncome() {
        double totalIncome = 0;
        for (double value : incomeCategories.values()) {
            totalIncome += value;
        }
        return totalIncome;
    }
    public double getTotalExpenses() {
        double totalExpenses = 0;
        for (double value : expenseCategories.values()) {
            totalExpenses += value;
        }
        return totalExpenses;
    }

}
