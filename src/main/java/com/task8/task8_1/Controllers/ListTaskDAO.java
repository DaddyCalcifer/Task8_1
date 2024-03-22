package com.task8.task8_1.Controllers;

import com.task8.task8_1.Models.DbConnectionModel;
import com.task8.task8_1.Models.Task;
import com.task8.task8_1.Models.TaskDAO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.task8.task8_1.Controllers.ListTask.randomTime;

public class ListTaskDAO implements TaskDAO {

    private List<Task> tasks;

    public ListTaskDAO(int size) {
        tasks = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {

            Task task = new Task(
                    i + 1,
                    "Task " + (i + 1),
                    randomTime(random),
                    "Context for task " + (i + 1)
            );
            tasks.add(task);
        }
    }

    public List<Task> getAllTasks() {
        List<Task> tasks = new ArrayList<>();
        var db = new DbConnectionModel("jdbc:postgresql://localhost:5432/task8_1","postgres","admin");
        Connection conn = DbController.connectToDatabase(db);
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM task");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Task task = new Task(rs.getInt("id_task"),
                        rs.getString("name"),
                        rs.getInt("time"),
                        rs.getString("status")
                );
                tasks.add(task);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }


    public Task getTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }
    public void addTask(Task task) {
        tasks.add(task);
    }


    public void updateTask(Task task) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == task.getId()) {
                tasks.set(i, task);
                return;
            }
        }
    }

    public void deleteTask(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                return;
            }
        }
    }
}