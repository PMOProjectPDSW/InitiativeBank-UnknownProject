package pdsw.project.beans;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.el.ELContext;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.model.chart.PieChartModel;
import pdsw.project.entities.Initiative;
import pdsw.project.entities.User;
import pdsw.project.services.InitiativeBankServices;

/**
 *
 * @author 2099190
 */
@Named
@SuppressWarnings("deprecation")
@ManagedBean(name = "initiativesBean")
@SessionScoped
public class InitiativesBean extends BaseBean {

    private String title;
    private String description;
    private Date creationDate;
    private String field;
    private String keyWords;
    private Initiative selectedInitiative;
    private String newStatus;
    private long user_id;
    private long tag_id;
    private List<Initiative> initiatives;
    private List<User> filteredInitiatives;
    private List<String> statuses = Arrays.asList("En espera de revision", "En revision", "Proyecto", "Solucionado");
    private PieChartModel modelInitiatives;

    @Inject
    private InitiativeBankServices initiativeBankServices;

    public InitiativesBean() {
        modelInitiatives = new PieChartModel();
        modelInitiatives.set("Estudiante", 42);
        modelInitiatives.set("Servicios Generales", 6);
        modelInitiatives.set("Administrativos", 34);
        modelInitiatives.set("Profesores", 18);
        modelInitiatives.setTitle("Iniciativas por Area");
        modelInitiatives.setLegendPosition("e");
    }

    public void registerInitiative() {
        ELContext elContext = FacesContext.getCurrentInstance().getELContext();
        LoginBean loginBean = (LoginBean) elContext.getELResolver().getValue(elContext, null, "loginBean");
        creationDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("DD/MM/YYYY");
        String stringDate = dateFormat.format(creationDate);
        newStatus = "En espera de revision";
        user_id = loginBean.getUser().getId();
        tag_id = 1;

        initiativeBankServices.addInitiative(title, description, newStatus, creationDate, field, keyWords, user_id, tag_id);
        title = "";
        description = "";
        field = "";
        keyWords = "";
        FacesMessage growlMessage = new FacesMessage("Registro Exitoso", "La Iniciativa se Registró correctamente");
        FacesContext.getCurrentInstance().addMessage(null, growlMessage);

    }

    public void searchInitiatives() {
        try {
            initiatives = initiativeBankServices.searchInitiatives();
            FacesContext.getCurrentInstance().getExternalContext().redirect("consultarIniciativas.xhtml");
        } catch (Exception ex) {
            Logger.getLogger(UsersBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void searchInitiativesProponent() {
        try {
            ELContext elContext = FacesContext.getCurrentInstance().getELContext();
            LoginBean loginBean = (LoginBean) elContext.getELResolver().getValue(elContext, null, "loginBean");
            user_id = loginBean.getUser().getId();

            initiatives = initiativeBankServices.searchInitiativesProponent(user_id);
            FacesContext.getCurrentInstance().getExternalContext().redirect("consultarIniciativasProponente.xhtml");
        } catch (Exception ex) {
            Logger.getLogger(UsersBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void initiativesxArea() {
        modelInitiatives();
    }

    private void modelInitiatives() {
        
    }

    public void searchInitiativesStatus() {
        try {
            initiatives = initiativeBankServices.searchInitiatives();
            FacesContext.getCurrentInstance().getExternalContext().redirect("modificarEstadoIniciativa.xhtml");
        } catch (Exception ex) {
            Logger.getLogger(UsersBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateStatus() {
        try {
            if (selectedInitiative == null || newStatus.equals("")) {
                FacesMessage growlMessage = new FacesMessage("No se pudo cambiar el Estado", "No se ha seleccionado la Iniciativa o el nuevo Estado");
                FacesContext.getCurrentInstance().addMessage(null, growlMessage);
            } else {
                initiativeBankServices.changeStatus(selectedInitiative.getId(), newStatus);
                selectedInitiative.setStatus(newStatus);

                newStatus = "";
                FacesMessage growlMessage = new FacesMessage("Cambio de Estado Exitoso", "La Iniciativa se cambió de Estado correctamente");
                FacesContext.getCurrentInstance().addMessage(null, growlMessage);
            }
        } catch (Exception ex) {
            Logger.getLogger(UsersBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public Initiative getSelectedInitiative() {
        return selectedInitiative;
    }

    public void setSelectedInitiative(Initiative selectedInitiative) {
        this.selectedInitiative = selectedInitiative;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    public List<Initiative> getInitiatives() {
        return initiatives;
    }

    public void setInitiatives(List<Initiative> initiatives) {
        this.initiatives = initiatives;
    }

    public List<User> getFilteredInitiatives() {
        return filteredInitiatives;
    }

    public void setFilteredInitiatives(List<User> filteredInitiatives) {
        this.filteredInitiatives = filteredInitiatives;
    }

    public List<String> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<String> statuses) {
        this.statuses = statuses;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getTag_id() {
        return tag_id;
    }

    public void setTag_id(long tag_id) {
        this.tag_id = tag_id;
    }

    public PieChartModel getModelInitiatives() {
        return modelInitiatives;
    }

    public void setModelInitiatives(PieChartModel modelInitiatives) {
        this.modelInitiatives = modelInitiatives;
    }

}
