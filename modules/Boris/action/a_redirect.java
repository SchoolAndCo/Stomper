package modules.Boris.action;

import modules.Boris.Action;
import modules.Boris.Interface;
import modules.Boris.View;
import modules.Boris.exceptions.InvalidRedirect;

public class a_redirect extends Action{
    public Class<? extends View> targetClass;
    public View targetInstance;
    private Interface base;

    public a_redirect(Class<? extends View> target) {
        this.targetClass = target;
    }

    public a_redirect(View target) {
        this.targetInstance = target;
    }

    public Boolean execute(Interface base) {
        this.base = base;

        if (targetClass != null) {
            return redirectByClass();
        }
        if (targetInstance != null) {
            return redirectByInstance();
        }

        throw new InvalidRedirect(null);
    }

    private Boolean redirectByClass() {
        if (!global.registeredViews.contains(targetClass)) {
            throw new InvalidRedirect(targetClass);
        }

        return base.selectView(targetClass);
    }

    private Boolean redirectByInstance() {
        if (!global.registeredViews.contains(targetInstance.getClass())) {
            throw new InvalidRedirect(targetInstance.getClass());
        }

        return base.selectView(targetInstance);
    }
}
