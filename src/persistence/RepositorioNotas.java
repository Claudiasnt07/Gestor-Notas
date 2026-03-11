package src.persistence;

import model.Nota;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.utils.*;

public class RepositorioNotas {
    
    public List<Nota> cargarNotas(String usuario) {
        List<Nota> notas = new ArrayList<>();
        String archivo = "notas_" + usuario + ".txt";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("\\|");
                notas.add(new Nota(partes[0], partes[1]));
            }
        } catch (Exception e) {}

        return notas;
    }

    public void guardarNotas(String usuario, List<Nota> notas) {
        String archivo = "notas_" + usuario + ".txt";

        try (PrintWriter pw = new PrintWriter(new FileWriter(archivo))) {
            for (Nota n : notas) {
                pw.println(n.getTitulo() + "|" + n.getContenido());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
