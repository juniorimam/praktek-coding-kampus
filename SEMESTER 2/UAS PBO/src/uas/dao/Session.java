
package uas.dao;


public class Session {
    
    private static String username_session;
    private static String password_session;
    
    public static void setUsernameSession ( String username_login){
        username_session = username_login;
    }
    public static String getUsernameSession(){
        return username_session;
}
     public static void setPasswordSession (String password_login){
         password_session = password_login;
     }
     public static String getPasswordSession (){
         return password_session;
     }
}
