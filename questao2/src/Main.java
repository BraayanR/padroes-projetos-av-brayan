public class Main {
    public static void main(String[] args) {
        new Checkout(new FabricaBrasil()).finalizarPedido("Brasil");
        new Checkout(new FabricaAlemanha()).finalizarPedido("Alemanha");
    }
}