package org.example;

// Importación de clases necesarias de JavaFX
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Clase principal que hereda de Application
public class Main extends Application {

    // Método que inicia la interfaz gráfica
    @Override
    public void start(Stage primaryStage) {

        // Etiqueta inicial con mensaje para el usuario
        Label mensaje = new Label("Completa el formulario");

        // Campo de texto para introducir el nombre
        TextField nombre = new TextField();

        // Texto guía que aparece dentro del campo
        nombre.setPromptText("Nombre");

        // Campo para introducir el correo
        TextField correo = new TextField();
        correo.setPromptText("Correo electrónico");

        // Campo especial para contraseña
        // Oculta los caracteres escritos
        PasswordField contraseña = new PasswordField();
        contraseña.setPromptText("Contraseña");

        // Creación del botón enviar
        Button button1 = new Button("Enviar");

        // Evento que se ejecuta al pulsar el botón
        button1.setOnAction(e -> {

            // Comprueba si alguno de los campos está vacío
            if (nombre.getText().isEmpty() ||
                correo.getText().isEmpty() ||
                contraseña.getText().isEmpty()) {

                // Muestra mensaje de error
                mensaje.setText("Todos los campos son obligatorios");

            } else {

                // Si todo está completo, muestra éxito
                mensaje.setText("Formulario enviado correctamente");
            }
        });

        // VBox organiza los elementos verticalmente
        VBox layout = new VBox(
                mensaje,
                nombre,
                correo,
                contraseña,
                button1
        );

        // Crear escena con tamaño 400x300
        Scene scene = new Scene(layout, 400, 300);

        // Título de la ventana
        primaryStage.setTitle("Ejercicio 11");

        // Asigna la escena a la ventana
        primaryStage.setScene(scene);

        // Muestra la ventana
        primaryStage.show();
    }

    // Método principal que inicia la aplicación
    public static void main(String[] args) {
        launch(args);
    }
}
