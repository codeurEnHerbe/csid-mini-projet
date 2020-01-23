package Entreprise;

public class UserAppDTO {

    private int id;
    private String username;
    private String password;

    public UserAppDTO(){
        this.id=-1;
    }

    public UserAppDTO(int id, String username, String password){
        this.id=id;
        this.username=username;
        this.password=password;
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

}
