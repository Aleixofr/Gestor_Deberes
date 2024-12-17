package es.carballeira.gestordeberes;

public class Trabajo {

    private String descripcion;
    private String fechaEntrega;
    private Asignatura asignatura;
    public enum Asignatura {
        PMDM,
        AD,
        EIE,
        PSP,
        DI
    };
    private boolean estado; // true si esta completo

    public Trabajo(String descripcion, String fechaEntrega, Asignatura asignatura, boolean estado) {
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.asignatura = asignatura;
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getEstado() {
        if (isEstado()) {
            return "COMPLETADO";
        }

        return "PENDIENTE";
    }

    @Override
    public String toString() {
        return "Trabajo{" +
                "descripcion='" + descripcion + '\'' +
                ", fechaEntrega='" + fechaEntrega + '\'' +
                ", asignatura=" + asignatura +
                ", estado=" + estado +
                '}';
    }
}
