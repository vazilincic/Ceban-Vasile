package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        TextField num1 = new TextField();
        TextField num2 = new TextField();
        Label result = new Label();
        Label error = new Label();
        Label divider = new Label("/");
        TilePane row = new TilePane();
        row.getChildren().addAll(num1, divider, num2);

        num1.setPrefColumnCount(7);
        num2.setPrefColumnCount(7);


        error.setTextFill(Color.web("#D8000C"));
        error.setFont(new Font(50.0));
        result.setFont(new Font(20.0));

        Button btn = new Button();
        btn.setText("Divide");
        btn.setOnAction(event -> {
            try {
                result.setText("");
                error.setText("");

                if (num1.getText().isEmpty()) {
                    throw new Exception("The first input is empty");
                }

                if (num2.getText().isEmpty()) {
                    throw new Exception("The second input is empty");
                }

                float num1Val = Float.parseFloat(num1.getText());
                float num2Val = Float.parseFloat(num2.getText());

                if (num2Val == 0f) {
                    throw new ArithmeticException("Division by 0 is not possible!");
                }

                float resultVal = num1Val / num2Val;
                result.setText( Float.toString(resultVal) );
            }
            catch(NumberFormatException e) {
                error.setText("Error. Not a number!");
            }
            catch(Exception e) {
                error.setText(e.getMessage());
            }
        });

        VBox root = new VBox(30);

        root.getChildren().addAll(row, btn, result, error);
        primaryStage.setScene(new Scene(root, 400, 350));
        primaryStage.show();
    }
}