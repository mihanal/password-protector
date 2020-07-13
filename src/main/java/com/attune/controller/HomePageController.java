package com.attune.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.attune.entity.Entry;
import com.attune.service.EntryService;
import com.sun.marlin.Dasher;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class HomePageController implements Initializable{
	
	@FXML public  TableView<Entry> mainTable;
    @FXML public  TableColumn<Entry, String> tableSystem;
    @FXML public  TableColumn<Entry, String> tableUserName;
    @FXML public  TableColumn<Entry, String> tablePassword;
    @FXML public  TableColumn<Entry, String> tableUrl;

	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		EntryService service = new EntryService();
		List<Entry> entries = service.getEntries();
		
		ObservableList<Entry> data =
				FXCollections.observableArrayList();
				 
		tableSystem.setCellValueFactory(new PropertyValueFactory<Entry, String>("system"));
		tableUserName.setCellValueFactory(new PropertyValueFactory<Entry, String>("userName"));
		tablePassword.setCellValueFactory(new PropertyValueFactory<Entry, String>("password"));
		tableUrl.setCellValueFactory(new PropertyValueFactory<Entry, String>("url"));
		
		for(Entry entry : entries) {
			data.add(entry);
			System.out.println("--------------------------------------" + entry.getSystem());
		}			
		
		mainTable.setItems(data);
		
	}

	@FXML
	public void handleAddEntryAction(ActionEvent actionEvent) {
		
		try {
			
			Parent parent = FXMLLoader.load(getClass().getResource("/Entry.fxml"));
			Scene scene = new Scene(parent);
			Stage window = new Stage();							
			
			window.setScene(scene);
			window.show();
			
			Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
			window.setX((primScreenBounds.getWidth() - window.getWidth()) / 2);
			window.setY((primScreenBounds.getHeight() - window.getHeight()) / 2);
			
			
		} catch (IOException e) {				
			e.printStackTrace();
		}
	}
	
}
