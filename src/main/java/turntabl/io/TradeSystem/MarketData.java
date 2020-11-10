package turntabl.io.TradeSystem;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class MarketData {
    WebClient client = WebClient.create("https://exchange.matraining.com");

    Mono<ClientResponse> result = client.get()
            .uri("/md")
            .accept(MediaType.APPLICATION_JSON)
            .exchange();


    public String data(){
        return ">> result = " + result.flatMap(res -> res.bodyToMono(String.class)).block();
    }
}
