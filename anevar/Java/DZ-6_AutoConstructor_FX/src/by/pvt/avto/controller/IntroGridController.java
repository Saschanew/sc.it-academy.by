package by.pvt.avto.controller;

import by.pvt.avto.bean.Avto;
import by.pvt.avto.bean.Disk;
import by.pvt.avto.bean.Motor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class IntroGridController {
	
	@FXML
	private TextField txtName;
	
	@FXML
	private Label lblMessage, lblDisks, lblMotor, lblLoad;
	
	private Avto avto = new Avto();
	
	@FXML 
	private void addDisk(){
		Disk disk = new Disk();
		avto.getDisks().add(disk);
		if(avto.getDisks().size()>4){
			lblDisks.setText("Многоколесный танк");
		} else {
		lblDisks.setText("У авто, " + avto.getDisks().size() + " колес");
		}
	}
	
	@FXML 
	private void addMotor(ActionEvent ae){
		Motor motor = new Motor();
		avto.setMotor(motor);
		lblMotor.setText("Мотор одна штука");
	}
	
	@FXML 
	private void load(ActionEvent ae){
		avto.setLoaded(true);
		lblLoad.setText("Заправлен!");
	}
	
	@FXML 
	private void drive(ActionEvent ae){
		
		if(avto.canDrive()==true){
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText("КРАСАВА! ЕДЕМ!");
			alert.setTitle("Хорошая новость");
			alert.showAndWait();
			System.out.println("ЕДЕМ");
		}
		if (avto.getMotor()==null && avto.getDisks().size()<=3) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setContentText("Чувак как ты собрался ехать без мотора и полного набора 4ех колес!!!");
			alert.setHeaderText("ОШИБОЧКА ВЫШЛА!");
			alert.setTitle("ОШИБОЧКА");
			alert.showAndWait();			
			System.out.println("Чувак как ты собрался ехать без мотора и полного набора 4ех колес!!!");
		}
		if (avto.getMotor()!=null && avto.getDisks().size()<=3) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setContentText("Чувак как ты собрался ехать без полного набора 4ех колес!!!");
			alert.setHeaderText("ОШИБОЧКА ВЫШЛА!");
			alert.setTitle("ОШИБОЧКА");
			alert.showAndWait();
			System.out.println("Чувак как ты собрался ехать без полного набора 4ех колес!!!");
		}
		if (avto.getMotor()==null) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setContentText("Без мотора поедем? Да ну на..");
			alert.setHeaderText("ОШИБОЧКА ВЫШЛА!");
			alert.setTitle("ОШИБОЧКА");
			alert.showAndWait();			
			System.out.println("Чувак как ты собрался ехать без мотора и полного набора 4ех колес!!!");
		}
		if (avto.isLoaded()==false) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setContentText("Чувак как ты собрался ехать незаправленным?!");
			alert.setHeaderText("А ЗАПРАВИТЬСЯ?");
			alert.setTitle("ОШИБОЧКА");
			alert.showAndWait();
			System.out.println("Чувак как ты собрался ехать без полного набора 4ех колес!!!");
		}		
	}
	
	@FXML
	private void change(ActionEvent ae){
		avto.getDisks().remove(0);
		if(avto.getDisks().size()>4){
			lblDisks.setText("Многоколесный танк");
		} else {
		lblDisks.setText("У авто, " + avto.getDisks().size() + " колес");
		}
		
	}
	
	@FXML 
	private void showBrand(ActionEvent ae){
		avto.setBrand(txtName.getText());
		System.out.println(avto.toString());
		
		lblMessage.setText("Ваш автомобиль, " + txtName.getText() + ".");
				
	}
	
}
