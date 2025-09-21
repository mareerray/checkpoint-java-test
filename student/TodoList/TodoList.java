public class TodoList {
    private Task[] tasks;  // — an array to store your tasks.
    private int capacity;  // — the max allowed tasks.
    private int size;  // — tracks how many tasks are currently added.

    // Constructor initializes all three fields with the specified capacity.
    public TodoList (int capacity) {
        this.capacity = capacity;
        this.tasks = new Task[capacity]; // capacity defines max allowed tasks
        this.size = 0;
    }

    // Add a new task if there's space
    public void addTask(String description) {
        if (size < capacity) {
            tasks[size] = new Task(description);
            size++;
        }
    }

    // Change the status of a task at a specific index
    public void setStatus(int index, TaskStatus status) {
        if (index >= 0 && index < size) {
            tasks[index].setStatus(status);
        }
    }

    // Update the task's description only if the index is valid
    public void setDescription(int index, String newDescription) {
        if (index >=0 && index < size) {
            tasks[index].setDescription(newDescription);
        }
    }

    // Nicely print all task and their statuses
    public void displayTasks() {
        System.out.println("Tasks:");
        for (int i = 0; i < size; i++) {
            System.out.printf("%-30s | %s\n", tasks[i].getDescription(), tasks[i].getStatus());
        }
    }
}