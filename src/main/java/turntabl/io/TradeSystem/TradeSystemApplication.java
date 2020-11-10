package turntabl.io.TradeSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class TradeSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeSystemApplication.class, args);


	}

	@GetMapping("/data")
	public String getData(){
		MarketData data = new MarketData();
		return data.data();
	}


}
