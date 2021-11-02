
package entity;

import java.io.Serializable;

public class User implements Serializable{
    private String firstName;
    private String lastName;
    private String tel;
    
    public User(){
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Имя: " + firstName + ", Фамилия: " + lastName + ", Номер телефона: " + tel;
    }
    
}
