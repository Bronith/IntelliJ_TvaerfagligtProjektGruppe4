package gui;

import application.models.produktion.decorator.Destillat;
import application.models.produktion.decorator.Gær;
import application.models.produktion.decorator.Vand;
import application.models.produktion.decorator.WhiskyDestilat;
import javafx.application.Application;

public class App {
    public static void main(String[] args) {

        Application.launch(Gui.class);



        Destillat newMake = new WhiskyDestilat("Muld", 55);
        newMake = new Vand(newMake);
        newMake = new Gær(newMake);
        System.out.println(newMake.getBeskrivelse() + newMake);

    }
}
