package logica;

public class Dispatcher implements Runnable {

    private final Object operador;
    private final Object supervisor;
    private final Object director;

    Dispatcher(Object operador, Object supervisor, Object director) {
        this.operador = operador;
        this.supervisor = supervisor;
        this.director = director;

    }

    private void dispatchCall(String action) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " " + action);
        Thread.sleep(((int) ( (Math.random() * (5 - 1)) * 1000)));
    }

    @Override
    public void run() {
        try {
            while (true) {
                dispatchCall(System.nanoTime() + ": esperando usuario");
                synchronized (operador) {
                    dispatchCall(System.nanoTime() + ": Atendido por operador");
                    synchronized (supervisor) {
                        dispatchCall(System.nanoTime() + ": Atendido por supervisor");
                        synchronized (director) {
                            dispatchCall(System.nanoTime() + ": Atendido por director");
                      }
                    }
                    dispatchCall(System.nanoTime() + ": Esperenado mas usuarios");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}