package gui.ProduktionsVindue;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class ProduktionPane extends GridPane {
    private Button opretDestillatBtn = new Button("Opret destillat");

    public ProduktionPane() {

        this.setPadding(new Insets(5));

        this.add(opretDestillatBtn, 1, 1);
        opretDestillatBtn.setPrefSize(150, 50);

        GridPane.setHalignment(opretDestillatBtn, HPos.CENTER);

        opretDestillatBtn.setOnAction(event -> {
            DestilatPane destilatPane = new DestilatPane();
            destilatPane.OpretDestillat();

        });

    }
}
