package org.lab.info;

import java.util.LinkedHashMap;
import java.util.Map;

import org.lab.info.config.ApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appinfo")
public class InfoController {

	@Autowired
	private ApplicationProperties applicationProperties;

	@RequestMapping(method = RequestMethod.GET)
	public Map<String, String> getInfo() {
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("name", applicationProperties.getName());
		map.put("version", applicationProperties.getVersion());
		map.put("environment", applicationProperties.getEnvironment());

		return map;
	}
}
