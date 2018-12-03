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
    private String name;
    private String email;
    private String password;
    private String area;    
    private String role;
    private List<Initiative> iniciativas;
    //votos
    //comentarios
    
    public User() {
    }     
    
    public User(long id) {
        this.id = id;
    }

    public User(long id, String name, String email, String password, String area, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.area = area;        
        this.role = role;
    }

    public User(long id, String name, String email, String password, String area, String role, List<Initiative> iniciativas) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.area = area;        
        this.role = role;
        this.iniciativas = iniciativas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Initiative> getIniciativas() {
        return iniciativas;
    }

    public void setIniciativas(List<Initiative> iniciativas) {
        this.iniciativas = iniciativas;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", area=" + area + ", role=" + role + ", iniciativas=" + iniciativas + '}';
    }   
}