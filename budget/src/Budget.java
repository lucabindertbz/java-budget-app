import java.util.HashMap;
import java.util.Map;

// Class Budget to manage personal budget
public class Budget {
    // Income and Expenses instance variables
    private double income;
    private double expenses;
    
    // Maps to store income and expense categories
    private Map<String, Double> incomeCategories;
    private Map<String, Double> expenseCategories;

    // Constructor to initialize income and expenses
    public Budget(double income, double expenses) {
        this.income = income;
        this.expenses = expenses;
        // Initializing income and expense categories maps
        this.incomeCategories = new HashMap<>();
        this.expenseCategories = new HashMap<>();
    }

    // Default constructor with default values for income and expenses
    public Budget() {
        this(0, 0);
    }

    // Getters for income, expenses and their categories
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

    
    // Setters for income and expenses
    public void setIncome(double income) {
        this.income = income;
    }
    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    // Method to add income to the budget
    public void addIncome(Income income) {
        // Get category and amount of the income
        String category = income.getSource();
        double amount = income.getAmount();
        // If category already exists, add the amount to the existing amount
        if (incomeCategories.containsKey(category)) {
            amount += incomeCategories.get(category);
        }
        // Put the category and updated amount in the map
        incomeCategories.put(category, amount);
    }

    // Method to add expenses to the budget
    public void addExpense(Expense expense) {
        // Get category and amount of the expense
        String category = expense.getCategory();
        double amount = expense.getAmount();
        // If category already exists, add the amount to the existing amount
        if (expenseCategories.containsKey(category)) {
            amount += expenseCategories.get(category);
        }
        // Put the category and updated amount in the map
        expenseCategories.put(category, amount);
    }

    // Method to calculate total income from all categories
    public double getTotalIncome() {
        double totalIncome = 0;
        // Iterate over values of the income categories map and add to total
        for (double value : incomeCategories.values()) {
            totalIncome += value;
        }
        return totalIncome;
    }
    // Method to calculate total expenses from all categories
    public double getTotalExpenses() {
        double totalExpenses = 0;
        // Iterate over values of the expense categories map and add to total
        for (double value : expenseCategories.values()) {
            totalExpenses += value;
        }
        return totalExpenses;
    }
}
