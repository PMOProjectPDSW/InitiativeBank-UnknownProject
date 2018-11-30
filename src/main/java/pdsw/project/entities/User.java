package pdsw.project.entities;

import java.io.Serializable;
import java.util.List;

/**
 * Class User that defines all the
 * attributes that an User can have
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public class User implements Serializable{
    
    private long id;
    private String fullName;
    private String email;
    private String departmentArea;
    private String password;
    private Role rol;
    private List<Initiative> iniciativas;
    
    public User() {
    }     
    
    public User(long id) {
        this.id = id;
    }

    public User(long id, String fullName, String email, String departmentArea, String password, Role rol) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.departmentArea = departmentArea;
        this.password = password;
        this.rol = rol;
    }

    public User(long id, String fullName, String email, String departmentArea, String password, Role rol, List<Initiative> iniciativas) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.departmentArea = departmentArea;
        this.password = password;
        this.rol = rol;
        this.iniciativas = iniciativas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartmentArea() {
        return departmentArea;
    }

    public void setDepartmentArea(String departmentArea) {
        this.departmentArea = departmentArea;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRol() {
        return rol;
    }

    public void setRol(Role rol) {
        this.rol = rol;
        //this.rol = Rol.valueOf(rol);
    }

    public List<Initiative> getIniciativas() {
        return iniciativas;
    }

    public void setIniciativas(List<Initiative> iniciativas) {
        this.iniciativas = iniciativas;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", fullName=" + fullName + ", email=" + email + ", departmentArea=" + departmentArea + ", password=" + password + ", rol=" + rol + ", iniciativas=" + iniciativas + '}';
    }   
}