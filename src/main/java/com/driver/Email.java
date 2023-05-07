package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {

        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(oldPassword.equals(password) && checkNewPassword(newPassword)){
            this.password=newPassword;
        }
        return;
    }
    private Boolean checkNewPassword(String newPass){
        int n=newPass.length();
        boolean upper=false;
        boolean lower=false;
        boolean digit=false;
        boolean special=false;
        if(n<8){
            return false;
        }
        char p;
        for(int i=0;i<n;i++){
            p=newPass.charAt(i);
            if(Character.isUpperCase(p)){upper=true;}
            else if(Character.isLowerCase(p)){lower=true;}
            else if(Character.isDigit(p)){digit=true;}
            else{
                special=true;
            }
            if(upper && lower && digit && special){break;}
        }
        return true;
    }
}
