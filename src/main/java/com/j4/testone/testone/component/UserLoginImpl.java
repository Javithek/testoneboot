package com.j4.testone.testone.component;

import org.springframework.stereotype.Component;

@Component("loginUser")
public class UserLoginImpl implements EvaluationAccess{
    @Override
    public boolean validAccess(String username, String password) {
        if(username.equals("Keiner")){
            if(password.equals("J4vithek")){
                return true;
            }
        }
        return false;
    }
}
