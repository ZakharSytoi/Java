public class Job implements Comparable<Job> {
    private String description;
    private Integer priority;

    public Job(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "description='" + description + '\'' +
                ", priority=" + priority;
    }

    @Override
    public int compareTo(Job o) {
        return o.priority.compareTo(this.priority);
    }

    public String getDescription() {
        return description;
    }

    public Integer getPriority() {
        return priority;
    }
}
