package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root= (Parent) fxmlLoader.load();
        primaryStage.setTitle("Hello World");
        Scene scene=new Scene(root, 570, 200);
        primaryStage.setScene(scene);
        //set stage invisvble
        primaryStage.initStyle(StageStyle.TRANSPARENT);


        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
