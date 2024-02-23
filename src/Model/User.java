/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author hp
 */
public class User {
     private int id;
    private String fullnames;
    private String email;
    private String phone_number;
    private String password;
    

    // Constructor
    public User(int id, String fullnames, String email, String phone_number) {
        this.id = id;
        this.fullnames = fullnames;
        this.email = email;
        this.phone_number = phone_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getFullnames() {
        return fullnames;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }
}
