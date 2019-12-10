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
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Panel.fxml"));
			AnchorPane root = (AnchorPane)loader.load();
			Scene scene = new Scene(root,439,550);
			primaryStage.setScene(scene);
			primaryStage.show();
			scene.getStylesheets().addAll(Main.class.getResource("application.css").toExternalForm());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
