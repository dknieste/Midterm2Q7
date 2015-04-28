package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	public Parent createContent() {

		VBox vbox = new VBox();
		vbox.setSpacing(5);

		HBox hbox = new HBox();
		hbox.setSpacing(5);

		PasswordField passwordbox = new PasswordField();
		passwordbox.setPromptText("Type your password");

		Button ok = new Button("OK");

		final Label label = new Label("");

		hbox.getChildren().addAll(passwordbox, ok);
		vbox.getChildren().addAll(hbox, label);

		ok.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				if (passwordbox.getText().equals("bugaboo")) {
					label.setText("Your password is correct");
				} else {
					label.setText("Your password is incorrect");
				}
				passwordbox.clear();
			}
		});

		return vbox;

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(new Scene(createContent()));
		primaryStage.show();
	}

	/**
	 * Java main for when running without JavaFX launcher
	 * 
	 * @param args
	 *            command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
}