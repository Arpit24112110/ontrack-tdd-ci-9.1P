package sit707.ontrack_tdd_ci;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TaskStatusCheckerTest {

    @Test
    void shouldReturnSubmittedStatus() {

        TaskStatusChecker checker = new TaskStatusChecker();

        String result = checker.checkStatus("S123", "T101");

        assertEquals("Submitted", result);
    }

    @Test
    void shouldReturnPassedStatus() {

        TaskStatusChecker checker = new TaskStatusChecker();

        String result = checker.checkStatus("S456", "T202");

        assertEquals("Passed", result);
    }

    @Test
    void shouldReturnTaskNotFound() {

        TaskStatusChecker checker = new TaskStatusChecker();

        String result = checker.checkStatus("S999", "T999");

        assertEquals("Task not found", result);
    }

    @Test
    void shouldReturnStudentIdRequired() {

        TaskStatusChecker checker = new TaskStatusChecker();

        String result = checker.checkStatus("", "T101");

        assertEquals("Student ID is required", result);
    }

    @Test
    void shouldReturnTaskIdRequired() {

        TaskStatusChecker checker = new TaskStatusChecker();

        String result = checker.checkStatus("S123", "");

        assertEquals("Task ID is required", result);
    }
}