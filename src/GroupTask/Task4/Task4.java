package GroupTask.Task4;

/*
Create Registration Class in which you would have
variables as email, userName and password that
have an access scope only within its own class. After
creating an object of the class user should be able to
call methods and in each method separately pass
values to set users email, username and password.
Requirements:
1 - > Valid email consider to be only yahoo
2 - > Valid userName and password cannot be empty and
3 - > should be of length larger than 6 characters
4 - > valid password cannot contain userName.
 */

class Registration {
    private String email;
    private String username;
    private String password;

    public void setEmail(String email){
            this.email=email;
    }
    public void setUsername(String username){
            this.username=username;
    }
    public String getUsername(){
            return username;
    }
    public void setPassword(String password){
            this.password=password;
    }
    public String getPassword(){
            return password;
    }

    void info(){
        if (email.toLowerCase().contains("yahoo")){
            if(!username.isEmpty()||!password.isEmpty()){
                if(username.length()>6&&password.length()>6){
                    if(password.contains(username)){
                        System.out.println("Password cannot contain username!");
                    }else {
                            System.out.println("account has been created");
                    }
                } else {
                        System.out.println("Username and password must have at least 6 characters");
                }
            }else {
                System.out.println("username or password cannot be empty");
            }
        } else {
            System.out.println("only yahoo email id is valid");
        }
    }
}
public class Task4 {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("yahoo");
        registration.setUsername("Milos4444");
        registration.setPassword("mielusnic45932");
        registration.info();
    }
}