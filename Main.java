public class Main {
    public static void main(String[] args) {
        // Creamos dos instancias (objetos) diferentes
        Enemigo orco = new Enemigo(); 
        Enemigo elfo = new Enemigo();

        // Usamos el método
        orco.recibirDano(20);
        elfo.recibirDano(50);
    }
}