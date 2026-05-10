package entidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class controller {

    public String registrar(String mensaje) {

        LocalDateTime ahora = LocalDateTime.now();

        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String hora = ahora.format(formato);

        System.out.println("--------------------------------");
        System.out.println("REGISTRO:");
        System.out.println(mensaje);
        System.out.println("HORA:");
        System.out.println(hora);
        System.out.println("--------------------------------");

        return "Registro guardado: " + hora;
    }
}