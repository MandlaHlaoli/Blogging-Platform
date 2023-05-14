module com.example.bloggingplatform {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bloggingplatform to javafx.fxml;
    exports com.example.bloggingplatform;
}