public class TallerMain {
    public static void main(String[] args) {
        Computadora pc = new Computadora("PC-001", "Ana López", "Dell", "No enciende", 4, "HDD");
        pc.formatear();          
        pc.aplicarRecargoRam(); 
        pc.finalizar();
        System.out.println();    
        Telefono tel = new Telefono("TEL-001", "Luis Pérez", "Samsung", "Se descarga rápido", 40, true);
        tel.evaluarDanio();
        tel.cambiarBateria(); 
        tel.finalizar();
        System.out.println();
        Telefono generico = new Telefono("TEL-002", "María Ruiz");
        generico.finalizar();
    }
}