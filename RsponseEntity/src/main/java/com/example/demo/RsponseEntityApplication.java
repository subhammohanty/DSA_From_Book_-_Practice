package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;

@SpringBootApplication
@RestController
public class RsponseEntityApplication {

	public static void main(String[] args) {
		SpringApplication.run(RsponseEntityApplication.class, args);
	}
	
	@PostMapping("/demo")
	public Map<Integer, String> demo(@RequestBody Input input){
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Test");
		return map;
	}

}
