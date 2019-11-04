package zadanie_2_ForecastWeather;

import java.util.List;

public class Current{
	private List<String> weatherDescriptions;
	private String observationTime;
	private int windDegree;
	private int visibility;
	private List<String> weatherIcons;
	private int feelslike;
	private String isDay;
	private String windDir;
	private int pressure;
	private int cloudcover;
	private int precip;
	private int uvIndex;
	private int temperature;
	private int humidity;
	private int windSpeed;
	private int weatherCode;

	public void setWeatherDescriptions(List<String> weatherDescriptions){
		this.weatherDescriptions = weatherDescriptions;
	}

	public List<String> getWeatherDescriptions(){
		return weatherDescriptions;
	}

	public void setObservationTime(String observationTime){
		this.observationTime = observationTime;
	}

	public String getObservationTime(){
		return observationTime;
	}

	public void setWindDegree(int windDegree){
		this.windDegree = windDegree;
	}

	public int getWindDegree(){
		return windDegree;
	}

	public void setVisibility(int visibility){
		this.visibility = visibility;
	}

	public int getVisibility(){
		return visibility;
	}

	public void setWeatherIcons(List<String> weatherIcons){
		this.weatherIcons = weatherIcons;
	}

	public List<String> getWeatherIcons(){
		return weatherIcons;
	}

	public void setFeelslike(int feelslike){
		this.feelslike = feelslike;
	}

	public int getFeelslike(){
		return feelslike;
	}

	public void setIsDay(String isDay){
		this.isDay = isDay;
	}

	public String getIsDay(){
		return isDay;
	}

	public void setWindDir(String windDir){
		this.windDir = windDir;
	}

	public String getWindDir(){
		return windDir;
	}

	public void setPressure(int pressure){
		this.pressure = pressure;
	}

	public int getPressure(){
		return pressure;
	}

	public void setCloudcover(int cloudcover){
		this.cloudcover = cloudcover;
	}

	public int getCloudcover(){
		return cloudcover;
	}

	public void setPrecip(int precip){
		this.precip = precip;
	}

	public int getPrecip(){
		return precip;
	}

	public void setUvIndex(int uvIndex){
		this.uvIndex = uvIndex;
	}

	public int getUvIndex(){
		return uvIndex;
	}

	public void setTemperature(int temperature){
		this.temperature = temperature;
	}

	public int getTemperature(){
		return temperature;
	}

	public void setHumidity(int humidity){
		this.humidity = humidity;
	}

	public int getHumidity(){
		return humidity;
	}

	public void setWindSpeed(int windSpeed){
		this.windSpeed = windSpeed;
	}

	public int getWindSpeed(){
		return windSpeed;
	}

	public void setWeatherCode(int weatherCode){
		this.weatherCode = weatherCode;
	}

	public int getWeatherCode(){
		return weatherCode;
	}

	@Override
 	public String toString(){
		return 
			"Current{" + 
			"weather_descriptions = '" + weatherDescriptions + '\'' + 
			",observation_time = '" + observationTime + '\'' + 
			",wind_degree = '" + windDegree + '\'' + 
			",visibility = '" + visibility + '\'' + 
			",weather_icons = '" + weatherIcons + '\'' + 
			",feelslike = '" + feelslike + '\'' + 
			",is_day = '" + isDay + '\'' + 
			",wind_dir = '" + windDir + '\'' + 
			",pressure = '" + pressure + '\'' + 
			",cloudcover = '" + cloudcover + '\'' + 
			",precip = '" + precip + '\'' + 
			",uv_index = '" + uvIndex + '\'' + 
			",temperature = '" + temperature + '\'' + 
			",humidity = '" + humidity + '\'' + 
			",wind_speed = '" + windSpeed + '\'' + 
			",weather_code = '" + weatherCode + '\'' + 
			"}";
		}
}