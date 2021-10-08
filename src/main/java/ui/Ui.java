package ui;

import task.Task;
import taskList.TaskList;

/**
 * Ui class is only for printing message.
 */
public class Ui {

    public void welcome () {
        print("Hello! I'm Dafy\n" );
    }

    public void print(String message) {
        System.out.println( message);
    }

    /**
     * Displays an empty line
    */
    public void printEmptyLine() {
        System.out.println("\n");
    }

    /**
     * Displays a number of tasks in the Tasklist
    */
    public void printTaskNum(TaskList tasks, Task task) {
        System.out.println(task + "\n   Now you have " + tasks.sizeOfTask() + " tasks in the list.\n");
    }


    /**
     * Shows a list of tasks to the user, formatted as an indexed list.
     */
    public void printTaskList(TaskList list) {
        for (int i = 1; i <= list.sizeOfTask(); i++) {
            System.out.print("   " + i + ".");
            System.out.println(list.returnTask(i - 1));
        }
    }

}
