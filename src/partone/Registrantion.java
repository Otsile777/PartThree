
package partone;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static partone.EasyKanban.addTasks;
/**
 *
 * @author RC_ST1045766
 */
public class Registrantion {
static Login ObjLoginSystem = new Login ();
static EasyKanban objEasyKanban = new EasyKanban();
static ArrayList<Task> taskList = new ArrayList<>();
static int taskCounter = 0;
static Scanner scanner = new Scanner(System.in);
   
public static void main(String[] args) {
        
       getUserInformationInput();
       login();
       EasyKanban();
       addTasks();
       
    
}
    // Get user input
     public static void getUserInformationInput(){
      ObjLoginSystem.setUserName(JOptionPane.showInputDialog("Enter UserName:"));
      ObjLoginSystem.setPassword(JOptionPane.showInputDialog("Enter Password:"));
      ObjLoginSystem.setFirstName(JOptionPane.showInputDialog("Enter FirstName:"));
      ObjLoginSystem.setLastName(JOptionPane.showInputDialog("Enter LastName:"));
      
    } 

 private static boolean login() {
        System.out.println("Enter username:");
        String username = scanner.next();
        System.out.println("Enter password:");
        String password = scanner.next();
        // For simplicity, assume any non-empty input is a successful login
        return !username.isEmpty() && !password.isEmpty();
    }
 
     public static void EasyKanban() {
        if (login()) {
            System.out.println("Welcome to EasyKanban");
            boolean running = true;
            while (running) {
                System.out.println("1) Add tasks\n2) Show report\n3) Quit");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        addTasks();
                        break;
                    case 2:
                        System.out.println("Coming Soon");
                        break;
                    case 3:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } else {
            System.out.println("Login failed. Exiting...");
        }
    } 
     public static void addTasks() {
        System.out.println("How many tasks do you want to enter?");
        int numTasks = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        for (int i = 0; i < numTasks; i++) {
            System.out.println("Enter task name:");
            String taskName = scanner.nextLine();
            System.out.println("Enter task description:");
            String taskDescription = scanner.nextLine();
            System.out.println("Enter developer details:");
            String developerDetails = scanner.nextLine();
            System.out.println("Enter task duration (in hours):");
            int taskDuration = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.println("Select task status (1: To Do, 2: Doing, 3: Done):");
            int statusChoice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            String taskStatus = statusChoice == 1 ? "To Do" : statusChoice == 2 ? "Doing" : "Done";

            Task task = new Task(taskName, taskCounter++, taskDescription, developerDetails, taskStatus, taskDuration);

            if (!task.checkTaskDescription()) {
                System.out.println("Please enter a task description of less than 50 characters");
            } else {
                taskList.add(task);
                JOptionPane.showMessageDialog(null, task.printTaskDetails(), "Task Details", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        int totalHours = 0;
        for (Task task : taskList) {
            totalHours += task.getTaskDuration();
        }
        System.out.println("Total Hours across all tasks: " + totalHours);
    }
         
    }
     
     

 