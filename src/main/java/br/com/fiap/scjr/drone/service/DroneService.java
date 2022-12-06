package br.com.fiap.scjr.drone.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;
import br.com.fiap.scjr.drone.model.Drone;

@Service
public class DroneService {
	
	private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .connectTimeout(Duration.ofSeconds(10))
            .build();
	
	public void sendDrone(Drone drone) throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder()
	            .POST(HttpRequest.BodyPublishers.ofString(new Gson().toJson(drone)))
	            .uri(URI.create("http://localhost:8080/drone"))
	            .setHeader("accept", "application/json")
	            .header("Content-Type", "application/json")
	            .build();
	    httpClient.send(request, HttpResponse.BodyHandlers.ofString());
	}
	
}
