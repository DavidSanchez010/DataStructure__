module com.empresa.datastructure_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.empresa.datastructure_ to javafx.fxml;
    exports com.empresa.datastructure_;
}