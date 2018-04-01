package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.media.MediaPlayer;

public class MediaBar extends HBox{
	
	Slider time = new Slider();
	Slider vol = new Slider();
	
	Button playButton = new Button("||");
	Label volume = new Label("Volume");
	
	MediaPlayer player;
	
	public MediaBar (MediaPlayer player2) {
		player = player2;
		
		setAlignment(Pos.CENTER);
		setPadding ( new Insets (5,10,5,10));
		
		vol.setPrefWidth(70);
		vol.setMinWidth(30);
		vol.setValue(100);
		
		HBox.setHgrow(time, Priority.ALWAYS);
		
		playButton.setPrefWidth(30);
		
		this.getChildren().add(playButton);
		this.getChildren().add(time);
		this.getChildren().add(volume);
		this.getChildren().add(vol);
		
	}

}
