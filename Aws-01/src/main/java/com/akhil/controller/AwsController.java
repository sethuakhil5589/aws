package com.akhil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {

	@RequestMapping("/")
	public String greeting() {
		return "Hello from Akhil";
	}
	
	@GetMapping("/configs")
	public String getConfiguration() {
		String osName = System.getProperty("os.name");
		String osVersion=System.getProperty("os.version");
		String osArch=System.getProperty("os.arch");
		String userName=System.getProperty("user.name");
		
		return "OS Name: "+osName+" OS Version: "+osVersion+" OS Arch: "+osArch+" User Name: "+userName;
	}
}
