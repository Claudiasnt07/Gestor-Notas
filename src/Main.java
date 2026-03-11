package src;

import src.view.VentanaLogin;
import src.controller.GestorAutenticacion;

public class Main {
    
    public static void main(String[] args) {

        VentanaLogin view = new VentanaLogin();
        GestorAutenticacion auth = new src.controller.GestorAutenticacion(view);
    }
}
