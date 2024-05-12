package sbu.cs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskScheduler
{
    public static class Task implements Runnable
    {
        /*
            ------------------------- You don't need to modify this part of the code -------------------------
         */
        String taskName;
        int processingTime;

        public Task(String taskName, int processingTime) {
            this.taskName = taskName;
            this.processingTime = processingTime;
        }
        /*
            ------------------------- You don't need to modify this part of the code -------------------------
         */

        @Override
        public void run() {

        }
    }

    public static ArrayList<String> doTasks(ArrayList<Task> tasks) throws InterruptedException {
        ArrayList<String> finishedTasks = new ArrayList<>();
        tasks.sort(new Comparator<Task>() {
            @Override
            public int compare(Task task1, Task task2) {
                return task2.processingTime - task1.processingTime;
            }
        });

        for (int i = 0; i < tasks.size(); i++) {
            Thread thread = new Thread(tasks.get(i));
            thread.start();
            thread.join();
            finishedTasks.add(tasks.get(i).taskName);
        }

        return finishedTasks;
    }

    public static void main(String[] args) {

    }
}
