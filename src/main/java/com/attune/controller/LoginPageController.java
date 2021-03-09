package com.attune.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class LoginPageController implements Initializable{
	
	@FXML private TextField 	userName;
	@FXML private PasswordField password;

	/**
	 *
	 *
	 *
	 *
	 *
	 *
	 * @param location
	 * @param resources
	 */
	public void initialize(URL location, ResourceBundle resources) {
	}

	@FXML
	private void handleLoginAction(ActionEvent actionEvent) {
		/*if(userName.getText().equals("mihan") && password.getText().equals("123")) {*/
			
			try {
				
				Parent parent = FXMLLoader.load(getClass().getResource("/home-screen.fxml"));
				Scene scene = new Scene(parent);
				Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();							
		        
				window.setScene(scene);
				window.show();
				
				Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
		        window.setX((primScreenBounds.getWidth() - window.getWidth()) / 2);
		        window.setY((primScreenBounds.getHeight() - window.getHeight()) / 2);
		        
			} catch (IOException e) {				
				e.printStackTrace();
			}
			/* } */
	}
}
