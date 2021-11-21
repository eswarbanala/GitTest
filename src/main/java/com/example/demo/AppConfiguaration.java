package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AppConfiguaration {
@RequestMapping("/hello")
public String hello()
{
	return "hello eswar.. Happy Learning..";
}

}
