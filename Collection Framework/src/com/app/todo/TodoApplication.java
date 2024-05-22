package com.app.todo;

import com.app.todo.model.Task;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class TodoApplication {

    private static Queue<Task> queue = new LinkedList<>();
    private static Stack<Task> stack = new Stack<>();

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1.Add New Task : ");
            System.out.println("2.Process Task : ");
            System.out.println("3.Display Completed Task : ");
            System.out.println("Enter your choice : ");
            int ch = sc.nextInt();

            switch (ch){
                case 1:
                    boolean result = addNewTask(sc);
                    if(result){
                        System.out.println("Task Added Successfully.....");
                    }else{
                        System.out.println("Not Added....");
                    }
                    break;
                case 2:
                    processTask();
                    break;
                case 3:
                    displayCompletedTasks();
                    break;
                default :
                    System.out.println("invalid choice");
            }
        }while (true);

    }

    private static boolean addNewTask(Scanner sc){
        System.out.println("Enter Task Description : ");
        String description = sc.nextLine()+sc.next();
        System.out.println("Enter Duration : ");
        int duration = sc.nextInt();

        Task task = new Task(description,duration);
        boolean res = queue.offer(task);
        if(res)
            return true;
        else
            return false;
    }

    private static void processTask(){
        while (!queue.isEmpty()){
            Task task = queue.poll();
            task.setStatus(true);
            Task completed= stack.push(task);
            System.out.println("Completed Task "+completed);
        }
    }

    private static void displayCompletedTasks() {
        if (!stack.isEmpty()) {
            System.out.println("Completed tasks:");
            for (Task task : stack) {
                String status = task.getStatus() ? "Completed" : "Pending";
                System.out.println("Description: " + task.getDescription() +
                        ", Duration: " + task.getDuration() +
                        ", Status: " + status);
            }
        } else {
            System.out.println("No completed tasks to display!");
        }
    }
}
