package sit707.ontrack_tdd_ci;

public class TaskStatusChecker {

    public String checkStatus(String studentId, String taskId) {

        if(studentId == null || studentId.isEmpty()) {
            return "Student ID is required";
        }

        if(taskId == null || taskId.isEmpty()) {
            return "Task ID is required";
        }

        if(studentId.equals("S123") && taskId.equals("T101")) {
            return "Submitted";
        }

        if(studentId.equals("S456") && taskId.equals("T202")) {
            return "Passed";
        }

        return "Task not found";
    }
}