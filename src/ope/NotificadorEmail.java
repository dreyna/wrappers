
package ope;

/**
 *
 * @author Docente
 */
public class NotificadorEmail extends NotificadorDecorador{
    
    public NotificadorEmail(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        super.enviarMensaje(mensaje); 
        enviarEmail(mensaje);
    }
    
    private void enviarEmail(String mensaje) {
        System.out.println("Enviando notificación por correo electrónico: " + mensaje);
    }
}
