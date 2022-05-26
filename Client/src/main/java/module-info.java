module com.rosogisoft.client.client {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.rosogisoft.client to javafx.fxml;
    exports com.rosogisoft.client;
}