public class TodoList {
    private Task[] tasks;  // — an array to store your tasks.
    private int capacity;  // — the max allowed tasks.
    private int count;  // — tracks how many tasks are currently added.

    // Constructor initializes all three fields with the specified capacity.
    public TodoList (int capacity) {
        this.capacity = capacity;
        this.tasks = new Task[capacity]; // capacity defines max allowed tasks
        this.count = 0;
    }

    // Add a new task if there's space
    public void addTask(String description) {
        if (count < capacity) {
            tasks[count] = new Task(description);
            count++;
        }
    }

    // Change the status of a task at a specific index
    public void setStatus(int index, TaskStatus status) {
        if (index >= 0 && index < count) {
            tasks[index].setStatus(status);
        }
    }

    // Update the task's description only if the index is valid
    public void setDescription(int index, String newDescription) {
        if (index >=0 && index < count) {
            tasks[index].setDescription(newDescription);
        }
    }

    // Nicely print all task and their statuses
    public void displayTasks() {
        System.out.println("Tasks:");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-33s | %s\n", tasks[i].getDescription(), tasks[i].getStatus());
        }
    }
}