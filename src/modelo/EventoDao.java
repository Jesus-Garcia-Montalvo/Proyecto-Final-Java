package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EventoDao {

    Statement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();

    public List<EventoModel> listar() {
        List<EventoModel> datos = new ArrayList<>();
        try {
            con = conectar.conectar();
            ps = con.createStatement();
            rs = ps.executeQuery("select * from evento");
            while (rs.next()) {
                EventoModel p = new EventoModel();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setTipoEvento(rs.getString(3));
                p.setFecha(rs.getString(4));
                p.setHoraInicio(rs.getString(5));
                p.setHoraFinal(rs.getString(6));
                p.setLugar(rs.getString(7));
                p.setBoleteria(rs.getString(8));
                p.setEstado(rs.getString(9));

                datos.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Aquí deberías cerrar los recursos (Statement, ResultSet, Connection) en bloques finally.
            // Para simplificar, los he omitido aquí, pero en producción deberías gestionar los recursos adecuadamente.
        }
        return datos;
    }
}
