package src;
public class Manager extends Employee 
{
    private double approvalLimit;

    public Manager(int empId, String name, String dept, String email, double approvalLimit) {
        super(empId, name, dept, email);
        this.approvalLimit = approvalLimit;
    }

    public double getApprovalLimit() 
    { 
    	return approvalLimit; 
    	}
    public void setApprovalLimit(double approvalLimit) 
    {
    	this.approvalLimit = approvalLimit; 
    }

    public boolean approveExpense(Expense expense) 
    {
        if (expense.getAmount() <= approvalLimit) 
        {
            expense.setStatus("APPROVED");
            System.out.println("Manager " + getName() + " approved expense " + expense.getExpenseId());
            return true;
        } 
        else 
        {
            expense.setStatus("REJECTED");
            System.out.println("Manager " + getName() + " rejected expense " + expense.getExpenseId());
            return false;
        }
    }
    @Override
    public void displayInfo() 
    {
        System.out.println("Manager: " + getName() + " | Dept: " + getDept() + " | Limit: " + approvalLimit);
    }
}
