package dacd.cabeza.control;

import dacd.cabeza.model.Location;
import dacd.cabeza.model.Weather;

import java.util.List;

public interface WeatherSupplier {
	List<Weather> getWeather(Location location);
}