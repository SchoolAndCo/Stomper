package views;

import modules.Boris.Action;
import modules.Boris.View;

public class base extends View {
    @Override
    public void draw() {
    }

    @Override
    public Boolean init() {
        return true;
    }

    @Override
    public Action onCommand(String command) {
        return null;
    }

    @Override
    public Boolean onSelection(String selection) {
        return false;
    }
}
