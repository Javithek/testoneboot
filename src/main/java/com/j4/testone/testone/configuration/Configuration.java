package com.j4.testone.testone.configuration;

import com.j4.testone.testone.bean.MateriaMath;
import com.j4.testone.testone.bean.OperationsMath;
import com.j4.testone.testone.bean.UniversityAcademy;
import com.j4.testone.testone.bean.UniversityAcademyImpl;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public OperationsMath getOperationMath(){
        return new MateriaMath();
    }

    @Bean
    public UniversityAcademy getUniversityAcademy(OperationsMath operationsMath){
        return new UniversityAcademyImpl(operationsMath);
    }

}
