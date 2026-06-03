package usuarios;

public class Cliente extends Usuario {
    private int puntosAcumulados;
    private int visitasTotales;
    private String historialJuegos;
    private String membresia;


    public Cliente(String id, String name, String email, String passwordHash, String estado, int puntosAcumulados,
            int visitasTotales, String historialJuegos, String membresia) {
        super(id, name, email, passwordHash, estado);
        this.puntosAcumulados = puntosAcumulados;
        this.visitasTotales = visitasTotales;
        this.historialJuegos = historialJuegos;
        this.membresia = membresia;
    }


    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }


    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }


    public int getVisitasTotales() {
        return visitasTotales;
    }


    public void setVisitasTotales(int visitasTotales) {
        this.visitasTotales = visitasTotales;
    }


    public String getHistorialJuegos() {
        return historialJuegos;
    }


    public void setHistorialJuegos(String historialJuegos) {
        this.historialJuegos = historialJuegos;
    }


    public String getMembresia() {
        return membresia;
    }


    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }

    public void hacerReserva(){
        System.out.println("Realizando reserva...");
    }

    public void ascenderAVIP(){
        System.out.println("Ascendiendo a VIP...");
    }
}
