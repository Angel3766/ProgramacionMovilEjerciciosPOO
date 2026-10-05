public class Computadora extends Dispositivo {
    private int ramGB;
    private String almacenamiento;
    public Computadora(String numeroSerie, String cliente, String marca,
                       String descripcionFalla, int ramGB, String almacenamiento) {
        super(numeroSerie, cliente, marca, descripcionFalla);
        this.ramGB = ramGB;
        this.almacenamiento = almacenamiento;
    }
    public Computadora(String numeroSerie, String cliente) {
        super(numeroSerie, cliente);
        this.ramGB = 8;                 
        this.almacenamiento = "HDD";
    }
    public void formatear() {
        System.out.println("El equipo " + numeroSerie + " fue formateado y limpiado.");
        this.costo = 350.0;
    }
    public void aplicarRecargoRam() {
        if (ramGB < 8) {
            this.costo = this.costo + 200.0;
            System.out.println("Se aplicó recargo de $200 por RAM baja.");
        }
    }
}