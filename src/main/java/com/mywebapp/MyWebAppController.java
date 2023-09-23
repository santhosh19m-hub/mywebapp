package com.mywebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWebAppController {
@GetMapping("/name")
public String get() {
	return "S.Santhosh Kumar";
}
}
