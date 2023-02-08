package com.j4.testone.testone.configuration;

import com.j4.testone.testone.bean.*;
import com.j4.testone.testone.pojo.Player;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
@EnableConfigurationProperties({Player.class})
public class Configuration {

    @Bean
    public OperationsMath getOperationMath(){
        return new MateriaMath();
    }

    @Bean
    public UniversityAcademy getUniversityAcademy(OperationsMath operationsMath){
        return new UniversityAcademyImpl(operationsMath);
    }

    @Bean
    public CredentialAll getCredentialAll(){
        return new UserCredential();
    }
}
