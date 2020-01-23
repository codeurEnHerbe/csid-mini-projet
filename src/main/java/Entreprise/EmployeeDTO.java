package Entreprise;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class EmployeeDTO {

    private int id;
    private String name;
    private String address;

    public EmployeeDTO(){
        this.id=-1;
    }

    public EmployeeDTO(int id, String name, String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public String toString(){
        return "{id="+id+", name="+name+", address="+address+"}";
    }
}
