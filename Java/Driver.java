public class Driver  extends Account{
     public Driver(String name, String document, String email, String password){
          super(name, document);
          this.email = email;
          this.password = password;
     }
     void printDataDriver(){
          System.out.println("Document driver: " + document + "Name Driver: " + "Email: " + email + "Password: " + password );
     }
}
