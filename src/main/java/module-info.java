module com.devrisby.qadesktop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.devrisby.qadesktop to javafx.fxml;
    exports com.devrisby.qadesktop;
}