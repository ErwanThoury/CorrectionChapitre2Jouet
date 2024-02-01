module sio.testjouet {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.testjouet to javafx.fxml;
    exports sio.testjouet;
}