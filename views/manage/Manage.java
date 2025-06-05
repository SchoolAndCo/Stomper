package views.manage;

import modules.Boris.Action;
import modules.Boris.View;
import modules.Boris.action.a_nop;
import modules.Boris.action.a_redirect;
import views.Index;

public class Manage extends View {
    @Override
    public void draw() {
        terminal.print("Manage View\n");
    }

    @Override
    public Boolean init() {
        return true;
    }

    @Override
    public Action onCommand(String command) {
        if (command.equals("back")) {
            return new a_redirect(Index.class);
        }
        return new a_nop();
    }

    @Override
    public Boolean onSelection(String selection) {
        return false;
    }
}
