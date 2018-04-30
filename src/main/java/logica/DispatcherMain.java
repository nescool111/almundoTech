package logica;

public class DispatcherMain {

    public static void main(String[] args) throws Exception {

        Dispatcher[] dispatchers = new Dispatcher[10];
        Object[] operadores = new Object[dispatchers.length];

        for (int i = 0; i < operadores.length; i++) {
            operadores[i] = new Object();
        }

        for (int i = 0; i < dispatchers.length; i++) {

            Object operador = operadores[i];
            Object supervisor = operadores[i];
            Object director = operadores[(i + 1) % operadores.length];

            if (i == dispatchers.length - 1) {
                dispatchers[i] = new Dispatcher(operador,supervisor, director);
            } else {
                dispatchers[i] = new Dispatcher(director, supervisor ,operador);
            }

            Thread t = new Thread(dispatchers[i], "Dispatcher " + (i + 1));
            t.start();
        }
    }
}
