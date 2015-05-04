package hello.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my")
public class ConfigServers {

	private List<String> servers = new ArrayList<String>();

	public List<String> getServers() {
		return servers;
	}

}
