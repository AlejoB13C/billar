package juegos;

public class MesaBillar extends Juego {
    public String tipoMesa;

    public MesaBillar(String id, double precioHora, String tipoMesa) {
        super(id, precioHora);
        this.tipoMesa = tipoMesa;
    }

    @Override
    public double calcularCosto(int tiempo) {
        return (tiempo / 60.0) * getPrecioHora();
    }

    public String getTipoMesa() {
        return tipoMesa;
    }

}
