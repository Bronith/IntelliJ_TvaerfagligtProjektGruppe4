package gui.ProduktionsVindue;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FadPane extends Stage {
    private final Stage stage = new Stage();


    public void OpretFad() {
        stage.setTitle("Opret Fad");
        GridPane pane = new GridPane();
        initContent(pane);
        Scene scene = new Scene(pane, 400,400);
        stage.setScene(scene);
        stage.show();

    }

    public void initContent (GridPane pane) {

        pane.setPadding(new Insets(15));
        pane.setHgap(10);
        pane.setVgap(15);
        pane.setGridLinesVisible(false);

        TextField nameInput = new TextField();
        pane.add(nameInput,0,0);

        TextField capacityInput = new TextField();
        pane.add(capacityInput,0,1);



    }
}
