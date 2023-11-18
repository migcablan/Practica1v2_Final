package dacd.cabeza.control;

import dacd.cabeza.model.Weather;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public interface WeatherStore {
	void save(List<Weather> weatherPrediction) throws SQLException;

}
