package entidades;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class servidor {

    public static void main(String[] args) {

        try {

            ServerSocket server = new ServerSocket(5000);

            System.out.println("Servidor iniciado...");

            while (true) {

                Socket cliente = server.accept();

                BufferedReader entrada = new BufferedReader(
                        new InputStreamReader(cliente.getInputStream())
                );

                PrintWriter salida = new PrintWriter(
                        cliente.getOutputStream(), true
                );

                String mensaje = entrada.readLine();

                controller c = new controller();

                String respuesta = c.registrar(mensaje);

                salida.println(respuesta);

                cliente.close();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}