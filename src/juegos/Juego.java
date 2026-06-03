package juegos;

public abstract class Juego {
    private String id;
    public String estado;
    public double precioHora;

    public Juego(String id, double precioHora) {
        this.id = id;
        this.estado = "Disponible";
        this.precioHora = precioHora;
    }

    public String getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public abstract double calcularCosto(int tiempo);
}
