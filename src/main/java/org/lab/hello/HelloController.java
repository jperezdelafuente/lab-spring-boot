package org.lab.hello;

import java.util.List;

import org.lab.hello.config.ConfigServers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private ConfigServers configServers;

	@RequestMapping("/")
	public String index() {
		List<String> servers = configServers.getServers();
		servers.stream().forEach(x -> System.out.println(x.toString()));

		return "Greetings from Spring Boot!";
	}
}
