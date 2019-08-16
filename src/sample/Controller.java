package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.List;

public class Controller  {
    @FXML
    private GridPane gridpane;
    @FXML
    private WebView web;

    @FXML
    private HBox hbox;

    @FXML
    private Button button;

    @FXML
    private CheckBox chekBox;

    @FXML
    private RadioButton radioButton;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private ListView<String> listview;

    @FXML
    private HBox hbox0;

    @FXML
    private Button button0;

    @FXML
    private CheckBox chekBox0;

    @FXML
    private RadioButton radioButton0;
    @FXML
    private Label label;

    @FXML
    private ComboBox<String> comboBox0;

    @FXML
    private ListView<String> listview0;


    public void initialize(){

        /**minimize btn**/
        button0.setOnAction(e -> {
            ((Stage)((Button)e.getSource()).getScene().getWindow()).setIconified(true);
        });
        /**or like this**/
//        button0.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                Node node= (Node) event.getSource();
//                Stage stage=(Stage) node.getScene().getWindow();
//                stage.setIconified(true);
//            }
//
//        });
        /**exit btn**/
        button.setOnAction(new EventHandler<ActionEvent>() {
                               @Override
                               public void handle(ActionEvent event) {
                                   System.exit(0);
                               }
                           });
        /**or like this**/
//        button.setOnAction(event -> {
//            System.exit(0);
//        });

                listview.getItems().add("gmail");
        listview.getItems().add("facebook");
        listview0.getItems().add("reddit");
        listview0.getItems().add("youtube");

        comboBox.getItems().add("gmail");
        comboBox.getItems().add("facebook");
        comboBox0.getItems().add("reddit");
        comboBox0.getItems().add("youtube");

        comboBox.getSelectionModel().selectFirst();
        comboBox0.getSelectionModel().selectFirst();








    }

    @FXML
    private void changeScale(){
        double x=label.getScaleX();
        double y=label.getScaleY();
        if (x==1.0&&y==1.0){
            label.setScaleX(1.1);
            label.setScaleY(1.1);
        }else {
            label.setScaleY(1.0);
            label.setScaleX(1.0);
        }

    }
    @FXML
    private void fileChoser(){
        FileChooser fileChooser=new FileChooser();
        fileChooser.setTitle("title is here");
        FileChooser.ExtensionFilter txt=new FileChooser.ExtensionFilter("TXT","*.txt");
        FileChooser.ExtensionFilter mp4=new FileChooser.ExtensionFilter("MP4","*.mp4");
        FileChooser.ExtensionFilter pdf=new FileChooser.ExtensionFilter("PDF","*.pdf");
        fileChooser.getExtensionFilters().addAll(pdf,txt,mp4);
        List<File> files=fileChooser.showOpenMultipleDialog(gridpane.getScene().getWindow());
        if (files==null){
            System.out.println("file is null");
        }else {
            for (File file:files){
                System.out.println(file);

            }
        }
    }
// code so we can dragg the shit as we want
    double X=0.0;
    double Y=0.0;
    @FXML
    void dragged(MouseEvent event){
        Node node= (Node) event.getSource();
        Stage stage=(Stage) node.getScene().getWindow();
        stage.setY(event.getScreenY()-Y);
        stage.setX(event.getScreenX()-X);

    }
    @FXML
    void pressed(MouseEvent event){
        Y=event.getSceneY();
        X=event.getSceneX();

    }


}





