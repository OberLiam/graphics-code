package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application
{
	public static void main(String[] args) {
		// starts everything here. Can't be called more than once.
		launch(args);
	}
	
	@Override
	public void start(Stage primary) throws Exception {
		primary.setTitle("Here is the title!");
		Button btn1 = new Button();
		Button btn2 = new Button();
		btn1.setText("Say \"Hello World\"");
		btn2.setText("tin");
		StackPane root = new StackPane();
		root.getChildren().add(btn1);
		root.getChildren().add(btn2);
		primary.setScene(new Scene(root, 800, 600));
		primary.show();
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello World");
			}
		});
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("hidden worlds");
			}
		});
	}
}
