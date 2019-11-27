package com.SpringBootMicroservice.stockApplication.dbservice.model;

import javax.persistence.*;


//Object called Quote represents the data of quotes and we would like to store it in the database.
//In order to do this, we should define an entity so that JPA is aware of it.
@Entity
//Creates a table with the specified name and parameters in the respective repository. This is being done by spring data JPA
@Table(name="quotes", catalog="Test")
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name="user_name")
    private String userName;

    @Column(name="quote")
    private String quote;

    //Empty constructor for JPA
    public Quote() {

    }

    public Quote(String userName, String quote) {
        this.userName = userName;
        this.quote = quote;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
