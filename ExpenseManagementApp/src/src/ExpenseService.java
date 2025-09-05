package src;

import java.util.*;

public class ExpenseService {
    private List<Expense> expenses = new ArrayList<>();

    public Expense submitExpense(int id, String type, double amount, Employee emp) {
        Expense exp = new Expense(id, type, amount, emp);
        expenses.add(exp);
        System.out.println("Expense " + id + " submitted by " + emp.getName());
        return exp;
    }

    public Expense submitExpense(int id, String type, double amount, Employee emp, String attachment) {
        Expense exp = new Expense(id, type + " (with attachment: " + attachment + ")", amount, emp);
        expenses.add(exp);
        System.out.println("Expense " + id + " submitted by " + emp.getName() + " with attachment.");
        return exp;
    }

    public List<Expense> listByStatus(String status) {
        List<Expense> result = new ArrayList<>();
        for (Expense e : expenses) {
            if (e.getStatus().equalsIgnoreCase(status)) {
                result.add(e);
            }
        }
        return result;
    }

    public double calculateTotal(Employee emp) {
        double sum = 0;
        for (Expense e : expenses) {
            if (e.getRequester().equals(emp) && e.getStatus().equals("REIMBURSED")) {
                sum += e.getAmount();
            }
        }
        return sum;
    }

    public void printSummary() {
        System.out.println("\n=== Monthly Summary ===");
        for (Expense e : expenses) {
            e.printDetails();
        }
    }
}

