package ope;

/**
 *
 * @author Docente
 */
public abstract class NotificadorDecorador implements Notificador{
    protected Notificador notificador;

    public NotificadorDecorador(Notificador notificador) {
        this.notificador = notificador;
    }
    
    @Override
    public void enviarMensaje(String mensaje) {
         notificador.enviarMensaje(mensaje);
    }
    
}
