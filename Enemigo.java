public class Enemigo {
    private int vida = 100; // Atributo privado
    private String nombre = "Orco"; // Atributo privado

    // Método público
    public void recibirDano(int cantidad) {
        this.vida -= cantidad;
        System.out.println(nombre + " ha recibido daño. Vida restante: " + vida);
    }
}