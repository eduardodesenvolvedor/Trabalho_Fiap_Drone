package br.com.fiap.scjr.drone.model;

public class Drone {

    private Integer idDrone;
    private Integer latitude;
    private Integer longitude;
    private Integer temperatura;
    private Integer umidade;
    private Boolean rastreamento;
    
	public Integer getIdDrone() {
		return idDrone;
	}
	public void setIdDrone(Integer idDrone) {
		this.idDrone = idDrone;
	}
	public Integer getLatitude() {
		return latitude;
	}
	public void setLatitude(Integer latitude) {
		this.latitude = latitude;
	}
	public Integer getLongitude() {
		return longitude;
	}
	public void setLongitude(Integer longitude) {
		this.longitude = longitude;
	}
	public Integer getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(Integer temperatura) {
		this.temperatura = temperatura;
	}
	public Integer getUmidade() {
		return umidade;
	}
	public void setUmidade(Integer umidade) {
		this.umidade = umidade;
	}
	public Boolean getRastreamento() {
		return rastreamento;
	}
	public void setRastreamento(Boolean rastreamento) {
		this.rastreamento = rastreamento;
	}
	
}
