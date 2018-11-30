package pdsw.project.beans;

import com.google.inject.Injector;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

/**
 *
 * @author grandthefuck
 */
public abstract class BaseBean implements Serializable {

    private Injector injector;

    public Injector getInjector() {
        if (injector == null) {
            ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext()
                    .getContext();
            injector = (Injector) servletContext.getAttribute(Injector.class.getName());
        }
        return injector;
    }

    public void setInjector(Injector injector) {
        this.injector = injector;
    }

    @PostConstruct
    public void init() {
        getInjector().injectMembers(this);
    }
}
