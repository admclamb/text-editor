package org.texteditor.window;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class WindowManager {
    Stage stage;

    public WindowManager(Stage stage) {
        this.stage = stage;
    }

    public void setup(String title, String label) {
        stage.setTitle(label);

        Label sceneLabel = new Label("Welcome to JavaFx");

        StackPane root = new StackPane(sceneLabel);

        Scene scene = new Scene(root, 400, 300);

        stage.setScene(scene);
    }

    public void setup(String title, String label, Boolean isMaximized) {
        setup(title, label);
        stage.setMaximized(isMaximized);
    }
}
