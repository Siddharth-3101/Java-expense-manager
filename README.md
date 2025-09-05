Expense Management System (Java Console App)

A console-based Expense Management application built in Java using Object-Oriented Programming (OOP) principles.
This project allows employees to submit expenses, managers to approve/reject them, and the system to handle reimbursements with reporting features.

🚀 Features

    Employee & Manager Profiles

    Employees can submit expenses with/without attachments.

    Managers have approval limits and can approve/reject expenses.

    Expense Lifecycle

    Submit → Approve/Reject → Reimburse

    Supports multiple expense types (e.g., Travel, Meals).

    Reports & Tracking

    List expenses by status (Submitted, Approved, Reimbursed).

    Calculate total reimbursements per employee.

    Monthly summaries (extendable).

🛠️ OOP Concepts Demonstrated

    Inheritance → Manager extends Employee.

    Method Overloading → submit() with/without attachments.

    Method Overriding → Custom approval logic in Manager.

    Polymorphism → Handle Employee and Manager using base class references.

    Encapsulation → Restricted direct edits to sensitive fields like expense status.

📂 Project Structure
├── Employee.java
├── Manager.java
├── Expense.java
├── ExpenseService.java
└── ExpenseAppMain.java

💻 How to Run

    Clone the repo:

        git clone https://github.com/your-username/expense-management-java.git


    Open the project in Eclipse IDE (or any Java IDE).

        Run ExpenseAppMain.java to test the system.
