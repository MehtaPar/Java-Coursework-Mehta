import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class MediaDemo extends Application {

	private static final String MEDIA_URL = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/SubaruOutbackOnStreetAndDirt.mp4";
	
	public void start(Stage primaryStage) {
	
	Media media = new Media(MEDIA_URL);
	MediaPlayer mp = new MediaPlayer(media);
	MediaView mv = new MediaView(mp);
	
	Button play = new Button(">");
	play.setOnAction(e -> {
		if(play.getText().equals(">")){
		mp.play();
		play.setText("||");
		}else {
		mp.pause();
		play.setText(">");
		}	
	});
	
	Button rewind = new Button("<<");
	rewind.setOnAction(e-> mp.seek(Duration.ZERO));
	
	Slider vol = new Slider();
	vol.setPrefWidth(150);
	vol.setMaxWidth(Region.USE_PREF_SIZE);
	vol.setMinWidth(30);
	vol.setValue(50);
	mp.volumeProperty().bind(vol.valueProperty().divide(100));
	
	HBox hBox = new HBox(10);
	hBox.setAlignment(Pos.CENTER);
	hBox.getChildren().addAll(play, rewind, new Label("Volume"), vol);
	
	BorderPane pane = new BorderPane();
	pane.setCenter(mv);
	pane.setBottom(hBox);
	
	Scene scene = new Scene(pane, 650, 500);
	primaryStage.setTitle("Param's Media Demo");
	primaryStage.setScene(scene);
	primaryStage.show();
	
	}


}