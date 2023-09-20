package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class InfoStrings {

    public static String apiKey = "your_api_key";
    public static String value = "Moscow";
    public static String index = String.format("https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s", value, apiKey);



}

