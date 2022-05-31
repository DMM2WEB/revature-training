package com.dmm.Day07;

class UserAlreadyLoggedInException extends Exception {

}

class Authentication {
    private boolean isLoggedIn = false;

    public void login (String email, String password) {
        if (!isLoggedIn) {
            if (email.equals("admin") && password.equals("123")) {
                System.out.println("Login successfully");
                isLoggedIn = true;
            }
            else {
                System.out.println("Login failed, try again");
            }
        }

        else {
            try {
                throw new UserAlreadyLoggedInException();
            }
            catch (UserAlreadyLoggedInException e) {
                System.out.println("You are already logged in");
            }
        }
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Authentication auth = new Authentication();
        auth.login("admin", "123");
        auth.login("admin", "123");
    }
}
