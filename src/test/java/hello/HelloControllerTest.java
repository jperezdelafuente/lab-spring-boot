package hello;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import hello.config.ConfigServers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HelloControllerTest {

	@Mock
	private ConfigServers configServers;

	@InjectMocks
	private HelloController helloController;

	@Test
	public void getHello() throws Exception {
		String response = helloController.index();
		assertThat(response, equalTo("Greetings from Spring Boot!"));
	}
}