public class Telefono extends Dispositivo {
    private int bateria;
    private boolean pantallaEstrellada;
    public Telefono(String numeroSerie, String cliente, String marca,
                    String descripcionFalla, int bateria, boolean pantallaEstrellada) {
        super(numeroSerie, cliente, marca, descripcionFalla);
        this.bateria = bateria;
        this.pantallaEstrellada = pantallaEstrellada;
    }
    public Telefono(String numeroSerie, String cliente) {
        super(numeroSerie, cliente);
        this.bateria = 100; 
        this.pantallaEstrellada = false;
    }
    public void evaluarDanio() {
        if (pantallaEstrellada == true) {
            this.costo = this.costo + 800.0;
            System.out.println("Pantalla estrellada: se suman $800.");
        } else {
            System.out.println("La pantalla está bien, sin cargo.");
        }
    }
    public void cambiarBateria() {
        this.bateria = 100;
        this.costo = this.costo + 450.0;
        System.out.println("Batería cambiada, salud al 100%. Se suman $450.");
    }
}