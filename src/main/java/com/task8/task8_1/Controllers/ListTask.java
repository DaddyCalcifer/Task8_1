package com.task8.task8_1.Controllers;

import com.task8.task8_1.Models.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTask {
    private List<Task> tasks;

    public ListTask(int size) {
        tasks = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            Task task = new Task(
                    i + 1,
                    "Task " + (i + 1),
                    randomTime(random),
                    "Context for task " + (i + 1));
            tasks.add(task);
        }
    }

    public static int randomTime(Random random) {
        int hours = random.nextInt(24);
        int minutes = random.nextInt(60);
        return hours*100+minutes;
    }
}
