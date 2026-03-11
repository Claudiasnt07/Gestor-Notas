package src;

import view.VentanaLogin;
import controller.GestorAutenticacion;

public class Main {
    
    public static void main(String[] args) {

        VentanaLogin view = new VentanaLogin();
        GestorAutenticacion auth = new GestorAutenticacion(view);
    }
}
