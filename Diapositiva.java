public class Dispositivo {
    protected String numeroSerie;
    protected String cliente;
    protected String marca;
    protected String descripcionFalla;
    protected boolean reparado;
    protected double costo;
    public Dispositivo(String numeroSerie, String cliente, String marca, String descripcionFalla) {
        this.numeroSerie = numeroSerie;
        this.cliente = cliente;
        this.marca = marca;
        this.descripcionFalla = descripcionFalla;
        this.reparado = false;
        this.costo = 0.0;
    }
    public Dispositivo(String numeroSerie, String cliente) {
        this(numeroSerie, cliente, "Genérica", "Genérica");
    }
    public void finalizar() {
        this.reparado = true;
        System.out.println("===== REPORTE DE REPARACIÓN =====");
        System.out.println("Número de serie: " + numeroSerie);
        System.out.println("Cliente: " + cliente);
        System.out.println("Marca: " + marca);
        System.out.println("Problema: " + descripcionFalla);
        if (reparado) {
            System.out.println("Reparado: Sí");
        } else {
            System.out.println("Reparado: No");
        }
        System.out.println("Costo total: $" + costo);
        System.out.println("=================================");
    }
}