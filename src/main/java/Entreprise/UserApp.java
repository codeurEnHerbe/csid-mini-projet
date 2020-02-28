package Entreprise;

import javax.persistence.Id;
public class UserApp {

    @Id
    private int id;
    private String username;
    private String password;

    private int idEmployee;

    public UserApp(){
        this.id=-1;
    }

    public UserApp(int id, String username, String password, int idEmployee){
        this.id=id;
        this.username=username;
        this.password=password;
        this.idEmployee = idEmployee;
    }

    public int getId(){
        return this.id;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public String toString(){
        return "{id="+id+", username="+username+", password="+password+"}";
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }
}
