/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;


/**
 *
 * @author elabtahysanae
 */

public class User {
    private String login;
    private String password;
    private String securityQuestion;
    private String securityAnswer;
    private String email;
    
    

    public User(String login, String password, String securityQuestion, String securityAnswer, String email) {
        this.login = login;
        this.password = password;
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
        this.email = email;
       
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurityQuestion() {
         return securityQuestion;
    }
     public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion =securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }
    public void setSecurityAnswer(String securityAnswer) {
       this.securityAnswer = securityAnswer;
    }
   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email= email;
    }

    @Override
    public String toString() {
        return "User{" + "login=" + login + ", password=" + password + ", securityQuestion=" + securityQuestion + ", securityAnswer=" + securityAnswer + ", email=" + email + '}';
    }
    
    
    
}