module com.example.programovani {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.programovani to javafx.fxml;
    exports com.example.programovani;
}