package src;
public class ExpenseAppMain {
    public static void main(String[] args) {
        ExpenseService service = new ExpenseService();

        Employee emp1 = new Employee(101, "siddharth", "IT", "siddharth@gmail.com");
        Employee emp2 = new Employee(102, "siddharth1", "HR", "sid@gmail.com");
        Manager mgr = new Manager(201, "siddharthMgr", "Finance", "sidd@gmail.com", 5000);

        Expense exp1 = service.submitExpense(1, "Travel", 3000, emp1);
        Expense exp2 = service.submitExpense(2, "Meals", 5000, emp2, "reciept");

        mgr.approveExpense(exp1);
        mgr.approveExpense(exp2);

        exp1.markReimbursed();
        exp2.markReimbursed();

        System.out.println("\nTotal reimbursed for " + emp1.getName() + ": " + service.calculateTotal(emp1));
        System.out.println("Total reimbursed for " + emp2.getName() + ": " + service.calculateTotal(emp2));

        service.printSummary();
        Employee ref = mgr; 
        ref.displayInfo(); 
    }
}
