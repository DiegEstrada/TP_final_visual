package aplicacion.contralador.beans.forms;

import aplicacion.contralador.beans.CatalogoBean;
import aplicacion.contralador.beans.ProductoBean;
import aplicacion.contralador.beans.PromocionBean;
import aplicacion.modelo.dominio.Catalogo;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.Promocion;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Grupo Alfa
 */
@ManagedBean
@SessionScoped
public class GestionPromocionesFormBean implements Serializable {

    public GestionPromocionesFormBean() {
    
    }

    
}
