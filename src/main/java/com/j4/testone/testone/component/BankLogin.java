package com.j4.testone.testone.component;

import org.springframework.stereotype.Component;

@Component("loginBank")
public class BankLogin implements EvaluationAccess{
    @Override
    public boolean validAccess(String username, String password) {
        if(username.equals("Javier")){
            if(password.equals("25212357")){
                return true;
            }
        }
        return false;
    }
}
