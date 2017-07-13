package com.app.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class CiCdExampleApplication {

	@RequestMapping("/greet")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model){
        return "Hello "+name+"!";
    }

	public static void main(String[] args) {
		SpringApplication.run(CiCdExampleApplication.class, args);
	}
}
