package dacd.cabeza.control;

import java.sql.SQLException;
import java.util.Timer;
import java.util.concurrent.*;

public class Main {
	public static void main(String[] args) throws SQLException {
		String apikey = args[0];

		Timer timer = new Timer();
		long period = 6 * 60 * 60 * 1000;

		WeatherControler weatherControler = new WeatherControler(new OpenWeatherMapSupplier(apikey), new SqLiteWeatherStore());
		timer.schedule(weatherControler, 0, period);
	}
}