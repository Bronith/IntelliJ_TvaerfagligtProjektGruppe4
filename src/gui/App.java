package gui;

import application.models.produktion.decorator.Destillat;
import application.models.produktion.decorator.Gær;
import application.models.produktion.decorator.Vand;
import application.models.produktion.decorator.WhiskyDestilat;

public class App {
    public static void main(String[] args) {


        Destillat newMake = new WhiskyDestilat("Muld", 55);
        newMake = new Vand(newMake);
        newMake = new Gær(newMake);
        System.out.println(newMake.getBeskrivelse() + newMake);
    }
}
