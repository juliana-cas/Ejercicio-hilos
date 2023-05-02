package EjercicioHilos;

public class FabricacionRopa {
    public static void main(String[] args) {
        Thread recortarTela = new Thread(new RecortarTela());
        Thread prepararMaquina = new Thread(new RecortarTela.PrepararMaquina());
        Thread coserRopa = new Thread(new RecortarTela.CoserRopa());

        recortarTela.start();
        prepararMaquina.start();
        coserRopa.start();

    }
    public static class RecortarTela implements Runnable {
    @Override
    public void run() {
        System.out.println("Recortando la tela para la ropa...");
        try {
            Thread.sleep(4000);
            System.out.println("La tela quedo recortada");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class PrepararMaquina implements Runnable {
        @Override
        public void run() {
            System.out.println("Preparando las agujas e hilos de la maquina");
            try {
                Thread.sleep(6000);
                System.out.println("La maquina quedo preparada");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class CoserRopa implements Runnable {
        @Override
        public void run() {
            System.out.println("Preparando el diseño para la ropa");
            try {
                Thread.sleep(9000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } System.out.println("La ropa quedo lista");
        }
    }
}
}