package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("View.fxml"));
			//FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));

			AnchorPane root = (AnchorPane)loader.load();
			//Scene scene = new Scene(root, 1024, 680);
			Scene scene = new Scene(root, 500, 500);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}


}
