package src.utils;

import java.security.MessageDigest;

public class UtilHash {
 
    public static String generarHash(String texto) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(texto.getBytes());

            String resultado = "";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
