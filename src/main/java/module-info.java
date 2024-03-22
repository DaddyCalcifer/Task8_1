module com.task8.task8_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.postgresql.jdbc;

    opens com.task8.task8_1 to javafx.fxml;
    exports com.task8.task8_1;
}