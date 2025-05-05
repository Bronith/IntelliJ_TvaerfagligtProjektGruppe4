package gui.ProduktionsVindue;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class ProduktionPane extends GridPane {
    private VBox buttonVBox = new VBox();
    private Button opretDestillatBtn = new Button("Opret destillat");
    private Button opretFadBtn = new Button("Opret fad");
    private Button opretFlaskeBtn = new Button("Opret flaske");

    public ProduktionPane() {

        this.setPadding(new Insets(5));

        this.add(buttonVBox, 1, 1);

        buttonVBox.getChildren().addAll(opretDestillatBtn, opretFadBtn, opretFlaskeBtn);

        opretDestillatBtn.setPrefSize(150, 50);
        opretFadBtn.setPrefSize(150, 50);
        opretFlaskeBtn.setPrefSize(150, 50);

        buttonVBox.setAlignment(Pos.CENTER);

        opretDestillatBtn.setOnAction(event -> {
            DestilatPane destilatPane = new DestilatPane();
            destilatPane.OpretDestillat();

        });

        opretFadBtn.setOnAction(event -> {
            FadPane fadPane = new FadPane();
            fadPane.OpretFad();
        });

        opretFlaskeBtn.setOnAction(event -> {
            FlaskePane flaskePane = new FlaskePane();
            flaskePane.OpretFlaske();
        });

    }
}
