# Practica1v2_Final
### Miguel Cabeza Lantigua
### Desarrollo de Aplicaciones para Ciencia de Datos.
### 2º de Carrera.
### Grado de Ciencias e Ingieneria de Datos. Escula de Informatica. ULPGC.

# Funcionabilidad

El objetivo de esta práctica es crear una aplicación Java que periódicamente, cada 6 h 
p.e., consulte la API del servicio para obtener la predicción meteorológica de las 8 islas
(se puede elegir el punto geográfico, latitud y longitud, que más os guste) para los 5
próximos días a las 12pm de cada día. Se debe persistir adquiridos en una base de datos 
SQLite, de tal forma que haya una tabla para cada isla y una entrada para cada día, en la 
que se guarde por día la temperatura, probabilidad de precipitaciones, la humedad, 
nubes y velocidad del viento.

La API en concreto que se uso fue: https://openweathermap.org/forecast5

# Recursos Usados

El entorno de desarrollo que se uso fue Intellij IDEA Community. Para el manejo de las dependencias y la compilación del proyecto
se uso Maven en su version 17, se uso en esta versión porque es la más estable y la que usamos en las clases practicas. Las dependencias
que se utilizaron son:

Jsoup:
'        <dependency>
            <groupId>org.jsoup</groupId>
            <artifactId>jsoup</artifactId>
            <version>1.16.2</version>
        </dependency>
'

Gson :
'        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.10.1</version>
        </dependency>
'

SQLite:
'        <dependency>
            <groupId>org.xerial</groupId>
            <artifactId>sqlite-jdbc</artifactId>
            <version>3.34.0</version>
        </dependency>
'

