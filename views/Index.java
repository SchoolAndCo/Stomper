package views;

import modules.Boris.Action;
import modules.Boris.View;
import modules.Boris.action.a_nop;
import modules.Boris.action.a_redirect;
import views.manage.Manage;

public class Index extends View {
    @Override
    public void draw() {
        terminal.print("Index View\n");
    }

    @Override
    public Boolean init() {
        return true;
    }

    @Override
    public Action onCommand(String command) {
        if (command.equals("manage")) {
            return new a_redirect(Manage.class);
        }

        return new a_nop();
    }

    @Override
    public Boolean onSelection(String selection) {
        return false;
    }
}
