package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ControllerView {
	
	@FXML
    private void reportButtonHandler(/*ActionEvent event*/) {
    	try {
    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
    	        Parent root1 = (Parent) fxmlLoader.load();
    	        Stage stage = new Stage();
    	        stage.initModality(Modality.APPLICATION_MODAL);
    	        stage.setTitle("Report Page");
    	        stage.setScene(new Scene(root1));
    	        stage.setResizable(false);
    	        stage.show();
    	
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
        
    }
}
