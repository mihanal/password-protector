package com.attune;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Loader extends Application {

	@Override
	public void start(Stage stage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/Login-screen.fxml"));
        Scene scene = new Scene(root);
    
        stage.setTitle("ATTUNE PASSWORD PROTECTOR");
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();
	}
}
