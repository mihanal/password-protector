package com.attune.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.attune.entity.Entry;
import com.attune.service.EntryService;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class EntryPageController implements Initializable{
	
	@FXML private TextField 	system;
	@FXML private TextField 	userName;
	@FXML private PasswordField password;
	@FXML private TextField 	systemUrl;

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
	public void handlePostEntryAction(ActionEvent event) {
		
		String sys 		= system.getText();
		String uName 	= userName.getText();
		String pass	 	= password.getText();
		String url	 	= systemUrl.getText();
		
		Entry entry = new Entry(sys, uName, pass, url);
		EntryService service = new EntryService();
		service.enrichEntry(entry);
	}
}
