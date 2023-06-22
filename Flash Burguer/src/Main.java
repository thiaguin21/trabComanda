public class Main {
    public static void main(String[] args) {

        Garcom gar = new Garcom();
        Cozinha coz = new Cozinha();

        gar.fazerPedido();
        coz.statusPedido();
        gar.fecharConta();

    }
}