package src.utils;

import java.security.MessageDigest;

public class UtilHash {
 
    public static String generarHash(String texto) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(texto.getBytes());

            String resultado = "";

            for (byte b : hash) {
                resultado += String.format("%02x", b);
            }

            return resultado;

        } catch (Exception e) {
            System.out.println("Ha habido un error creando hash");
            throw new RuntimeException(e);
        }
    }
}
