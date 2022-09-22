package com.example.passwordmatch;

public class PasswordMatch {
    public static Boolean match(String password1, String password2){
        Boolean match = true;

        if(password1.length() != password2.length()){
            match = false;
        }else{
            for(int i = 0; i < password1.length(); i++){
                if(password1.charAt(i) != password2.charAt(i)){
                    match = false;
                }
            }
        }

        return match;
    }
}
