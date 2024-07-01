/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partone;

/**
 *
 * @author RC_St10457666
 */
/**public class TaskTest {
    @Test
    public void testTaskDescriptionLength() {
        Task task = new Task("Test Task", 1, "This is a test description that exceeds fifty characters in length", "John Doe", "To Do", 5);
        assertFalse(task.checkTaskDescription(), "Description should be more than 50 characters");
        
        task = new Task("Test Task", 1, "This is a valid description.", "John Doe", "To Do", 5);
        assertTrue(task.checkTaskDescription(), "Description should be within 50 characters");
    }

    @Test
    public void testCreateTaskID() {
        Task task = new Task("Login Feature", 0, "Create Login to authenticate users", "Robyn Harrison", "To Do", 8);
        assertEquals("LO:0:SON", task.createTaskID(), "Task ID should match the given format");
    }

    @Test
    public void testTotalHoursAccumulation() {
        Task task1 = new Task("Task 1", 0, "Description 1", "Dev One", "To Do", 5);
        Task task2 = new Task("Task 2", 1, "Description 2", "Dev Two", "Doing", 3);
        assertEquals(8, task1.getTaskDuration() + task2.getTaskDuration(), "Total hours should be the sum of task durations");
    }
}*/
