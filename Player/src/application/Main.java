package application;

import java.net.URISyntaxException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws URISyntaxException {
		
		Player player = new Player("file:///C://Users//tfrancisco//Desktop//JessieJNotMyEx.mp4");
		Scene scene = new Scene(player, 720, 535, Color.BLUE);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
