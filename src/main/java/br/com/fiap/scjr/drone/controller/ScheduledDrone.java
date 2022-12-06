package br.com.fiap.scjr.drone.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import br.com.fiap.scjr.drone.model.Drone;
import br.com.fiap.scjr.drone.service.DroneService;

@Component
public class ScheduledDrone {
	
	@Autowired
	DroneService droneService;

	@Scheduled(fixedRate = 10000)
	public void reportCurrentTime() throws IOException, InterruptedException {
		
		for (int i = 1; i < 6; i++) {
			Drone drone = new Drone();
			drone.setIdDrone(i);
			drone.setLatitude(numeroAleatorio(-90, 90));
			drone.setLongitude(numeroAleatorio(-180, 180));
			drone.setTemperatura(numeroAleatorio(-25, 40));
			drone.setUmidade(numeroAleatorio(0, 100));
			drone.setRastreamento(true);
			droneService.sendDrone(drone);
		}
		
	}
	
	public int numeroAleatorio(int min, int max){
	    int randomNum = min + (int)(Math.random() * (max - min));
	    return randomNum;
	}
	
}
