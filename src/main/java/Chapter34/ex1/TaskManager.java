package Chapter34.ex1;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    private Queue<Task> taskQueue = new PriorityQueue<>();
    private Scanner scanner = new Scanner(System.in);

    void mainLoop(){
        Option option;

        do {
            printOptions();
            System.out.println("Wybierz opcję ");
            option = Option.createFromInt(scanner.nextInt());
            switch (option){
                case ADD :
                    taskQueue.offer(readAndCreateTaks());
                    System.out.println("Kolejne zadanie dodane do kolejki");
                    break;
                case TAKE:
                    takeTask();
                    break;
                case EXIT:
                    System.out.println("Pa pa");
                    break;
            }
        }while (option != Option.EXIT);
    }

    private void takeTask() {
    }

    private Task readAndCreateTaks() {
        System.out.println("Podaj nazwę zadania");
        String taskName = scanner.nextLine();
        System.out.println("Podaj opis zadania");
        String description = scanner.nextLine();
        System.out.println("Podaj priorytet zadania");
        for (Task.Priority value : Task.Priority.values()) {
            System.out.println(value + " ");
        }
        System.out.println();
        Task.Priority priority = Task.Priority.valueOf(scanner.nextLine());
        return new Task(taskName, description, priority);
    }

    private void printOptions() {
        Option [] values = Option.values();
        for (Option value : values) {
            System.out.println(value);
        }

    }
}
