package modelo;

public class EventoModel {
    
    
      private int id;
    private String nombre;
    private String tipoEvento;
    private String fecha;
    private String horaInicio;
    private String horaFinal;
    private String lugar;
    private String boleteria;
    private String estado;
    
      public EventoModel() {
    }
    
  
    public EventoModel(int id, String nombre, String tipoEvento, String fecha, String horaInicio,
				String horaFinal, String lugar, String boleteria, String estado) {
			
			this.id = id;
			this.nombre = nombre;
			this.tipoEvento = tipoEvento;
			this.fecha = fecha;
			this.horaInicio = horaInicio;
			this.horaFinal = horaFinal;
			this.lugar = lugar;
			this.boleteria = boleteria;
			this.estado = estado;
		}
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getBoleteria() {
        return boleteria;
    }

    public void setBoleteria(String boleteria) {
        this.boleteria = boleteria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

  
                
                
                
}
