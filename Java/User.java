public class User extends Account {
     public User(String name, String document, String email, String password){
          super(name, document);
          this.email = email;
          this.password = password;
     }
     void printDataUser(){
          System.out.println("Document driver: " + document + "Name Driver: " + "Email: " + email + "Password: " + password );
     }
}
