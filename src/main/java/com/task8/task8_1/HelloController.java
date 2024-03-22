package com.task8.task8_1;

import com.task8.task8_1.Controllers.ListTaskDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Список задач выведен в консоль!");
        var listDao = new ListTaskDAO(10);
        var tasks = listDao.getAllTasks();
        for (var t:
             tasks) {
            System.out.println(t.toString());
        }

    }
}