package jp.tuyano.eclipsebook;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
public class SampleApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		 Label label = new Label("Welcome to javaFX");
		 TextField field= new TextField();
		 Button button = new Button("Click");
		  BorderPane pane =new BorderPane();
		  pane.setTop(label);
		  pane.setCenter(field);
		  pane.setBottom(button);
		  BorderPane.setAlignment(button, Pos.CENTER);
		Scene scene = new Scene(pane,300,150);
		stage.setScene(scene);
        stage.show();
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        launch(args);
	}

}
