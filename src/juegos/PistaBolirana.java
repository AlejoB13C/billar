package juegos;

public class PistaBolirana extends Juego {
    public boolean esElectronica;

    public PistaBolirana(String id, double precioHora, boolean esElectronica) {
        super(id, precioHora);
        this.esElectronica = esElectronica;
    }

    public boolean isEsElectronica() {
        return esElectronica;
    }

    public void setEsElectronica(boolean esElectronica) {
        this.esElectronica = esElectronica;
    }

    @Override
    public double calcularCosto(int tiempo) {
        return (tiempo / 60.0) * getPrecioHora();
    }
}
