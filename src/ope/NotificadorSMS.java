
package ope;

/**
 *
 * @author Docente
 */
public class NotificadorSMS extends NotificadorDecorador{
    
    public NotificadorSMS(Notificador notificador) {
        super(notificador);
    }
    
    @Override
    public void enviarMensaje(String mensaje) {
        super.enviarMensaje(mensaje); 
        enviarSMS(mensaje);
    }
    
    
    private void enviarSMS(String mensaje) {
        System.out.println("Enviando notificación por SMS: " + mensaje);
    }
}
