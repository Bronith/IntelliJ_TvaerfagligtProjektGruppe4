package gui;

import gui.ProduktionsVindue.DestilatPane;
import gui.ProduktionsVindue.ProduktionPane;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {
    private TabPane tabPane = new TabPane();


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Sall Whisky Distillery");
        GridPane pane = new GridPane();
        initPrimaryStageContent(pane);
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
        tabPane.getTabs().add(new Tab("Produktion", new ProduktionPane()));
        Scene scene = new Scene(tabPane, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void initPrimaryStageContent(GridPane pane) {

        pane.setPadding(new Insets(15));
        pane.setHgap(10);
        pane.setVgap(15);
        pane.setGridLinesVisible(true);

    }
}
