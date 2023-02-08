package com.j4.testone.testone;

import com.j4.testone.testone.bean.UniversityAcademy;
import com.j4.testone.testone.component.EvaluationAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestoneApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("loginUser")
	private EvaluationAccess evaluationAccess;

	@Autowired
	@Qualifier("getUniversityAcademy")
	private UniversityAcademy universityAcademy;

	public static void main(String[] args) {
		SpringApplication.run(TestoneApplication.class, args);
	}

	@Override
	public void run(String... args){
		String username = "Keiner";
		String password = "J4vithek";
		if(evaluationAccess.validAccess(username, password)){
			System.out.println("Acceso Concedido! en la implementacion: [" + evaluationAccess.getClass() + "]");
		}else{
			System.out.println("Lo siento, no tienes acceso!");
		}
		if(universityAcademy.helperOperationMath(4,5)){
			System.out.println("Vas a ser un buen estudiante de math! [" + universityAcademy.getClass() + "]");
		}else{
			System.out.println("Debes practicar mas tus calculos matematicos! [" + universityAcademy.getClass() + "]");
		}
	}
}
