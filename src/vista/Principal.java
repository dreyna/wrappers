/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import ope.Notificador;
import ope.NotificadorBasico;
import ope.NotificadorEmail;
import ope.NotificadorSMS;

/**
 *
 * @author Docente
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Notificador notificador = new NotificadorBasico();

        // Envolver el notificador básico con el decorador de Email
        notificador = new NotificadorEmail(notificador);

        // Envolver el notificador básico+email con el decorador de SMS
        notificador = new NotificadorSMS(notificador);

        // Enviar mensaje con todas las funcionalidades
        notificador.enviarMensaje("¡Hola, has recibido una nueva notificación!");
    }
    
}
