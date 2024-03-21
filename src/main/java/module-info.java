module com.task8.task8_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.task8.task8_1 to javafx.fxml;
    exports com.task8.task8_1;
}