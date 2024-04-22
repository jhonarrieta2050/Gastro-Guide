
package Logica;

public class Usuario {
    private String username;
    private String name;
    private String last_name;
    private String gender;
    private String country;    
    private String email;
    private String age;
    private String password;
    private int index;

    public Usuario() {
    }

    public Usuario(int index, String username, String name, String last_name, String gender, String country, String email, String age, String password) {
        this.index=index;
        this.username = username;
        this.name = name;
        this.last_name = last_name;
        this.gender = gender;
        this.country = country;
        this.email = email;
        this.age = age;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
}