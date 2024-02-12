module paul.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens paul.javafx to javafx.fxml;
    exports paul.javafx;
}
