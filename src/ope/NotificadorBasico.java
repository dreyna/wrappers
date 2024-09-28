package ope;

/**
 *
 * @author Docente
 */
public class NotificadorBasico implements Notificador{

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enciando mensaje básico: "+mensaje);
    }
    
}
