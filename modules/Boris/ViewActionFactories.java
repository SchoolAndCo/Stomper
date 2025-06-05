package modules.Boris;

import modules.Boris.action.a_redirect;
import modules.Boris.action.a_stop;
import modules.Boris.action.a_nop;
import modules.Boris.action.a_dd;

public class ViewActionFactories {
    public Action redirect(Class<? extends View> target) {
        return new a_redirect(target);
    }

    public Action redirect(View target) {
        return new a_redirect(target);
    }

    public Action stop() {
        return new a_stop();
    }

    public Action nop() {
        return new a_nop();
    }

    public Action dd(Object... data) {
        return new a_dd(data);
    }
}
