import modules.Boris.Interface;
import views.Index;
import views.manage.Manage;

public class Main {
    public static void main(String[] args) {
        Interface ui = new Interface(Index.class);

        ui.registerView(Index.class);
        ui.registerView(Manage.class);

        ui.start();
    }
}
