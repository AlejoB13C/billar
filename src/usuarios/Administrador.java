package usuarios;

public class Administrador extends Empleado{
    private int nivelAcceso;

    public Administrador(String id, String name, String email, String passwordHash, String estado, String cargo,
            double salario, String horario, int nivelAcceso) {
        super(id, name, email, passwordHash, estado, cargo, salario, horario);
        this.nivelAcceso = nivelAcceso;
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }
    
    public void crearReporte(){
        System.out.println("Creando reporte...");
    }

    public void crearTorneo(){
        System.out.println("Creando torneo...");
    }

    public void crearPromocion(){
        System.out.println("Creando promoción...");
    }
}
