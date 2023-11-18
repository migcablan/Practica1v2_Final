package dacd.cabeza.control;

import dacd.cabeza.model.Weather;

import java.sql.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class SqLiteWeatherStore implements WeatherStore {
	private Connection connection;
	private Statement statement;

	public SqLiteWeatherStore() throws SQLException {
		this.connection = connect();
		this.statement = connection.createStatement();
	}

	private void createTableIsland(Weather weather) throws SQLException {
		statement.execute("CREATE TABLE IF NOT EXISTS weather_" + weather.getLocation().getIsland() + "(" +
				"Date TEXT,\n" +
				"WindSpeed REAL,\n" +
				"Precipitation REAL,\n" +
				"Clouds INTEGER,\n" +
				"Temperature REAL,\n" +
				"Humidity INTEGER" +
				");");
	}

	public static Connection connect() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:sqlite::memory:");
			System.out.println("Connection to in-memory SQLite has been established.");
			return conn;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public void insert(Weather weather) throws SQLException {
		// The rest of your insert method remains unchanged
	}

	private void update(Weather weather) throws SQLException {
		// The rest of your update method remains unchanged
	}

	@Override
	public void save(List<Weather> weatherPrediction) throws SQLException {
		for (Weather weather : weatherPrediction) {
			createTableIsland(weather);
			update(weather);
			insert(weather);
		}
	}
}