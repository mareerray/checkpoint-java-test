public class Task {
    private String description;
    private TaskStatus status;

    // Constructor: "initializing the object's state."
    public Task (String description) {
        this.description = description;
        this.status = TaskStatus.NEW;
        // To avoid null, assign a value from TaskStatus enum to NEW as default value
    }

    // Setters
    public void setDescription(String description) {
        if (description.length() <= 30) {
            this.description = description;
        } else {
            this.description = description.substring(0, 30);
        }
    }
    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    // Getters
    public String getDescription() {
        return description;
    }
    public TaskStatus getStatus() {
        return status;
    }
}