package assertions;

import models.RandomValuesModel;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertCheck {
    public static void assertRequest1(RandomValuesModel response) {
        assertThat(response.getWeather().get(0).getMain())
                .as("not cloudy error")
                .isEqualTo("Clouds");
        System.out.println(response.getWeather().get(0).getMain());
    }

    public static void assertRequest2(RandomValuesModel response) {
        assertThat(response.getWeather().get(0).getId())
                .as("wrong id error")
                .isEqualTo(804);

    }

    public static void assertRequest3(RandomValuesModel response){
        assertThat(response.getMain().getTemp_min())
                .as("wrong min_temp error")
                .isBetween(0.00, 20.00);

    }
    public static void assertRequest4(RandomValuesModel response){
    assertThat(response.getMain().getTemp())
            .as("wrong temp error")
                .isGreaterThan(5.00);}
    public static void assertRequest5(RandomValuesModel response){
    assertThat(response.getVisibility())
            .as("wrong visibility error")
                .isEqualTo(10000);}

    public static void assertRequest6(RandomValuesModel response){
    assertThat(response.getBase())
            .as("wrong base error")
                .isEqualTo("stations");}
}

