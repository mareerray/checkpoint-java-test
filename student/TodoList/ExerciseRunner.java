public class ExerciseRunner {
    public static void main(String[] args) {
        TodoList myList = new TodoList(3); // List can hold up to 3 tasks
        myList.addTask("Go grocery shopping");
        myList.addTask("Pay electricity bill");
        myList.setStatus(0, TaskStatus.COMPLETED); // Mark the first task as completed
        myList.setDescription(1, "Pay all utility bills"); // Update the description of the second task
        myList.displayTasks(); // Display the list of tasks
        myList.addTask("Read a book");
        myList.addTask("Write a report");
        myList.displayTasks(); // Display the list of tasks
    }
}

/*
Expected output:
Tasks:                                                                                                                                              ─╯
Go grocery shopping            | COMPLETED
Pay all utility bills          | NEW
Tasks:
Go grocery shopping            | COMPLETED
Pay all utility bills          | NEW
Read a book                    | NEW
 */