package com.j4.testone.testone.controller;

import com.j4.testone.testone.bean.CredentialAll;
import com.j4.testone.testone.bean.OperationsMath;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.j4.testone.testone.pojo.Player;
@Controller
public class FacadeMath {

    private final Log _LOG = LogFactory.getLog(FacadeMath.class);

    @Autowired
    @Qualifier("getOperationMath")
    private OperationsMath operationsMath;

    @Autowired
    @Qualifier("getCredentialAll")
    private CredentialAll credentialAll;

    @Autowired
    private Player player;


    @RequestMapping("/suma")
    @ResponseBody
    public ResponseEntity<String> getOperationMath(){
        return new ResponseEntity<String>("El resultado de tu suma es: " + operationsMath.sum(20, 20), HttpStatus.OK);
    }

    @RequestMapping("/user")
    @ResponseBody
    public ResponseEntity<String> getUserCredential(){
        return new ResponseEntity<>(credentialAll.fullCreadential(), HttpStatus.OK);
    }

    @RequestMapping("/player")
    @ResponseBody
    public ResponseEntity<String> getPlayer(){
        _LOG.info("Estas ingresando al method player!");
        _LOG.debug("Entity player en return: " + player);
        return new ResponseEntity<>("Player name: " + player.getName() + " ability: " + player.getAbility() + " age: " + player.getAge(), HttpStatus.OK);
    }

}
