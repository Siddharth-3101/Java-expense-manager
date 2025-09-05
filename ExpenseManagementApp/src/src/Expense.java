package src;
public class Expense {
    private int expenseId;
    private String type; 
    private double amount;
    private String status; 
    private Employee requester;

    public Expense(int expenseId, String type, double amount, Employee requester) {
        this.expenseId = expenseId;
        this.type = type;
        this.amount = amount;
        this.status = "SUBMITTED";
        this.requester = requester;
    }


    public int getExpenseId() { 
    	return expenseId; }
    public String getType() { 
    	return type; }
    public double getAmount() { 
    	return amount; }
    public String getStatus() { 
    	return status; }
    public Employee getRequester() { 
    	return requester; }

   
    protected void setStatus(String status) { 
    	this.status = status; }


    public void markReimbursed() {
        if (status.equals("APPROVED")) {
            status = "REIMBURSED";
            System.out.println("Expense " + expenseId + " reimbursed.");
        } 
        else {
            System.out.println("Expense " + expenseId + " not eligible for reimbursement.");
        }
    }

    public void printDetails() {
        System.out.println("Expense ID: " + expenseId + " | Type: " + type +
                " | Amount: " + amount + " | Status: " + status +
                " | Requester: " + requester.getName());
    }
}

