package org.texteditor.window;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;
import javafx.stage.Stage;

public class WindowManagerTest extends ApplicationTest {
    private Stage stage;

    @Override
    public void start(Stage stage) {
        this.stage = stage;
        WindowManager windowManager = new WindowManager(stage);
        windowManager.setup("Test Window", "Test Label");
        stage.show();
    }

    @Test
    public void testWindowOpens() {
        assertTrue("Stage should be visible", stage.isShowing());
    }
}
