package com.Pressure.model;

import java.util.Objects;

/**
 * Classe che descrive una generica città attraverso i suoi attributi
 * @author Giasimone&Walter
 *
 */
public class City extends Country{
	/**
	 * Nome città
	 */
	private String name;
	/**
	 * id città
	 */
	private Long id;
	/**
	 * Oggetto che descrive la pressione della città.
	 */
	private Pressure pressure = new Pressure();
	
	/**
	 * Longitudine della città
	 */
	private Double lon;
	
	/**
	 * Latitudine della città
	 */
	private Double lat;
	
	/**
	 * Costruttore
	 * @param nameC The country's name
	 * @param name The city's name
	 * @param id The city's id
	 * @param lon The city's longitude
	 * @param lat The city's lantitude
	 * @param pressure City's Pressure object
	 */
	public City(String nameC, String name, Long id, Pressure pressure, Double lon, Double lat) {
		super(nameC);
		this.name = name;
	}
	
	/**
	 * Default constructor
	 */
	public City() {
		super();
	}
	
	/**
	 * 
	 * @param name The city's name
	 * @param id  The city's id
	 * @param lon The city's longitude
	 * @param lat The city's latitude
	 */
	public City(String name, Long id, Double lon, Double lat) {
		this.name = name;
		this.id = id;
		this.lon = lon;
		this.lat = lat;
	}
	
	/**
	 * 
	 * @return The city's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name The name to set for the city
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return City's id
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * @param id City's id to set for
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * 
	 * @return The object pressure
	 */
	public Pressure getPressure() {
		return pressure;
	}

	/**
	 * 
	 * @return longi The city's longitude
	 */
	public Double getLon() {
		return lon;
	}
	
	/**
	 * 
	 * @param lon The longitude to set
	 */
	public void setLongi(Double lon) {
		this.lon = lon;
	}
	
	/**
	 * 
	 * @return lat The city's latitude
	 */
	public Double getLat() {
		return lat;
	}
	
	/**
	 * 
	 * @param lat The city's latitude to set
	 */
	public void setLat(Double lat) {
		this.lat = lat;
	}

	/**
	 * Override del metodo toString di Object
	 */
	@Override
	public String toString() {
		return "City [name=" + name + ", id=" + id +", pressure="
				+ pressure + ", longi=" + lon + ", lat=" + lat + "]";
	}
	
	/**
	 * Questo metodo può tornare utile nel momento in cui si va ad utilizzare
	 * il debugger
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id, lat, lon, name, pressure);
	}
	
	/**
	 * Override del metodo equals di Object per confrontare due oggetti
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return  id == other.id && lat == other.lat && lon == other.lon
				&& Objects.equals(name, other.name) && Objects.equals(pressure, other.pressure);
	}
}
