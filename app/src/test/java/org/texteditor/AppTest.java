package org.texteditor;

import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import javafx.stage.Stage;

import static org.junit.Assert.*;

public class AppTest extends ApplicationTest {
    private Stage stage;

    @Override
    public void start(Stage stage) {
        this.stage = stage;
        App app = new App();
        try {
            app.start(stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        stage.show();
    }

    @Test
    public void testWindowOpens() {
        assertTrue("Stage should be showing", stage.isShowing());
    }
}