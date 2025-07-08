public class AsercionesEjemplo {
    public static void main(String[] args) {
        int numero = -9;

        // Aserción: el número debe ser positivo
        assert numero >= 0 : "El número debe ser no negativo para calcular su raíz cuadrada. Valor recibido: " + numero;

        double raiz = Math.sqrt(numero);
        System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
    }
}
