package zadanie_2_ForecastWeather;

public class Request{
	private String unit;
	private String query;
	private String language;
	private String type;

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return unit;
	}

	public void setQuery(String query){
		this.query = query;
	}

	public String getQuery(){
		return query;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"Request{" + 
			"unit = '" + unit + '\'' + 
			",query = '" + query + '\'' + 
			",language = '" + language + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}
