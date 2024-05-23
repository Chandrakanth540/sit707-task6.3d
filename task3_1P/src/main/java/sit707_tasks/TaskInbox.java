public class TaskInbox {
    public String getTaskInbox(String studentId) {
        // This is a simplified hardcoded response.
        // In a real scenario, this would fetch data from a database.
        if (studentId == null || studentId.isEmpty()) {
            return "Invalid student ID.";
        }

        if (studentId.equals("12345")) {
            return "Task1: Submitted, Feedback: Pending\n" +
                   "Task2: Submitted, Feedback: Given\n" +
                   "Chat: Hi there!, Sure, let me check.";
        } else {
            return "No tasks found for the given student ID.";
        }
    }
}
