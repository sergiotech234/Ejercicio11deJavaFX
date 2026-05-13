package org.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label mensaje = new Label("Completa el formulario");
        TextField nombre = new TextField();
        nombre.setPromptText("Nombre");
        TextField correo = new TextField();
        correo.setPromptText("Correo electrónico");
        PasswordField contraseña = new PasswordField();
        contraseña.setPromptText("Contraseña");
        Button button1 = new Button("Enviar");
        button1.setOnAction(e -> {
            if (nombre.getText().isEmpty() ||
                    correo.getText().isEmpty() ||
                    contraseña.getText().isEmpty()) {
                mensaje.setText("Todos los campos son obligatorios");
            } else {
                mensaje.setText("Formulario enviado correctamente");
            }
        });
        VBox layout = new VBox(
                mensaje,
                nombre,
                correo,
                contraseña,
                button1
        );
        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setTitle("Ejercicio 11");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}