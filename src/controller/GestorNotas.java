package src.controller;

import src.view.VentanaNotas;
import src.service.ServicioNotas;
import src.model.Nota;

public class GestorNotas {

    private VentanaNotas view;
    private ServicioNotas service;

    public GestorNotas(VentanaNotas view,String usuario){

        this.view = view;
        this.service = new ServicioNotas(usuario);

        cargarLista();

        view.crear.addActionListener(e -> crear());
        view.eliminar.addActionListener(e -> eliminar());
        view.editar.addActionListener(e -> editar());

        view.lista.addListSelectionListener(e -> mostrar());
    }

    private void cargarLista(){

        view.modeloLista.clear();

        for(Nota n : service.getNotas()){

            view.modeloLista.addElement(n.getTitulo());

        }
    }

    private void crear(){

        service.crearNota(
                view.titulo.getText(),
                view.contenido.getText()
        );

        cargarLista();
    }

    private void eliminar(){

        int i = view.lista.getSelectedIndex();

        if(i>=0){

            service.eliminarNota(i);
            cargarLista();

        }
    }

    private void editar(){

        int i = view.lista.getSelectedIndex();

        if(i>=0){

            service.editarNota(
                    i,
                    view.titulo.getText(),
                    view.contenido.getText()
            );

            cargarLista();
        }
    }

    private void mostrar(){

        int i = view.lista.getSelectedIndex();

        if(i>=0){

            Nota n = service.getNotas().get(i);

            view.titulo.setText(n.getTitulo());
            view.contenido.setText(n.getContenido());

        }
    }
}