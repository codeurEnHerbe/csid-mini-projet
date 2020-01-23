package Entreprise;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class EmployeeDTO {

    private int id;
    private String name;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String streetNumber;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String streetName;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String postalCode;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String city;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String country;

    public EmployeeDTO(){
        this.id=-1;
    }

    public EmployeeDTO(int id, String name, String streetNumber, String streetName, String postalCode,String city, String country){
        this.id=id;
        this.name=name;
        this.streetNumber=streetNumber;
        this.streetName=streetName;
        this.postalCode=postalCode;
        this.city=city;
        this.country=country;
    }

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    public String adressLine1(){
        return streetNumber + " " + streetName ;
    }


    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    public String adressLine2(){
        return city + " " + country + " " + postalCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString(){
        return "{id="+id+", name="+name+", address=" + adressLine1() + " " + adressLine2() + "}";
    }
}
