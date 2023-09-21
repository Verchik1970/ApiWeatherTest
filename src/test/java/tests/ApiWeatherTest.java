package tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.ApiStep;

import static assertions.AssertCheck.*;

public class ApiWeatherTest extends ApiStep {



    @Test
    @DisplayName("Проверка отображения облачности")

    void getRequestTest1(){
        var response = getRequest();
        assertRequest1(response);

    }

    @Test
    @DisplayName("Проверка отображения ID")

    void getRequestTest2(){
        var response = getRequest();
        assertRequest2(response);

    }
    @Test
    @DisplayName("Проверка отображения мин температуры")

    void getRequestTest3(){
        var response = getRequest();
        assertRequest3(response);

    }
    @Test
    @DisplayName("Проверка отображения температуры")

    void getRequestTest4(){
        var response = getRequest();
        assertRequest4(response);

    }
    @Test
    @DisplayName("Проверка отображения видимости")

    void getRequestTest5(){
        var response = getRequest();
        assertRequest5(response);

    }
    @Test
    @DisplayName("Проверка отображения base")

    void getRequestTest6(){
        var response = getRequest();
        assertRequest6(response);

    }
}
