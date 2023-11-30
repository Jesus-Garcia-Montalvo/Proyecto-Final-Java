package controlador;

import java.util.List;
import modelo.EventoDao;
import modelo.EventoModel;
import vista.EventoFrom;

public class EventoController {
    private EventoFrom vista;
    private EventoDao modelo;

    public EventoController(EventoFrom vista, EventoDao modelo) {
        this.vista = vista;
        this.modelo = modelo;
        // Puedes agregar aquí la lógica de inicialización, si es necesario.
    }

    public void iniciar() {
        // Puedes agregar aquí la lógica de inicio, si es necesario.
        cargarDatosEnTabla();
        // Configurar aquí los listeners de eventos si es necesario.
    }

    private void cargarDatosEnTabla() {
        // Obtener la lista de eventos desde el modelo
        List<EventoModel> eventos = modelo.listar();

        // Limpiar la tabla en la vista
        vista.tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},  // Datos vacíos
            new String[]{"id", "Nombre", "Tipo", "Fecha", "Hora Inicio", "Hora fin", "Lugar", "Boleteria", "Estado"}  // Nombres de las columnas
        ));

        // Llenar la tabla en la vista con los datos obtenidos del modelo
        for (EventoModel evento : eventos) {
            ((javax.swing.table.DefaultTableModel) vista.tabla.getModel()).addRow(new Object[]{
                evento.getId(), evento.getNombre(), evento.getTipoEvento(),
                evento.getFecha(), evento.getHoraInicio(), evento.getHoraFinal(),
                evento.getLugar(), evento.getBoleteria(), evento.getEstado()
            });
        }
    }

    // Puedes agregar métodos adicionales para manejar eventos u otras acciones según sea necesario.

    public static void main(String[] args) {
        // Crear instancias de la vista y el modelo
        EventoFrom vista = new EventoFrom();
        EventoDao modelo = new EventoDao();

        // Crear una instancia del controlador y pasarle la vista y el modelo
        EventoController controlador = new EventoController(vista, modelo);

        // Iniciar la aplicación llamando al método iniciar del controlador
        controlador.iniciar();

        // Hacer visible la vista
        vista.setVisible(true);
    }
}
