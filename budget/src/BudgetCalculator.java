import java.util.ArrayList;
import java.util.List;

public class BudgetCalculator {
    private List<Income> incomes = new ArrayList<>();
    private List<Expense> expenses = new ArrayList<>();

    public void addIncome(Income income) {
        incomes.add(income);
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public double calculateBudget() {
        double totalIncome = 0;
        for (Income income : incomes) {
            totalIncome += income.getAmount();
        }

        double totalExpenses = 0;
        for (Expense expense : expenses) {
            totalExpenses += expense.getAmount();
        }

        return totalIncome - totalExpenses;
    }
}
