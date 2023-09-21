# ApiWeatherTest
API tests for OpenWeather
В репозитории представлены автоматизированные тесты для вебсайта
=======================================================
При тестировании веб-приложения были использованы следующие инструменты тестирования:
- Selenium - для создания и выполнения тестовых сценариев 
- JUnit - для написания и выполнения модульных тестов
- Rest Assured - для REST тестирования
- AssertJ - библиотека сравнения 
- Allure - для построения отчета о тестировании
- Maven - для управления проектом


Произведеные тесты:
1. getRequestTest1 - Проверка отображения облачности
2. getRequestTest2 - Проверка отображения ID
3. getRequestTest3 - Проверка отображения мин температуры
4. getRequestTest4 - Проверка отображения температуры
5. getRequestTest5 - Проверка отображения видимости
6. getRequestTest6 - Проверка отображения base





## Использование
Для запуска тестов необходимо предварительно получить свой API Key  на сайте https://openweathermap.org/api и подставить его
в строку  public static String apiKey = "your_api_key"; в классе InfoStrings.java
Запуск SUITE тестов из Terminal:
- mvn clean test

Запуск Allure отчета:
- mvn allure:serve
  
![Allure](https://github.com/Verchik1970/ApiWeatherTest/blob/master/Api_test.png)

### Требования

Для установки и запуска проекта, необходимы: Java, Chrome, Selenium, Junit, Allure, Maven 

### Тестирование производилось на:
- OS.version=Windows 10
- Chrome.version=116.0.5845.141
- JDK.version=jdk20.0.2
- MAVEN.version=Apache Maven 3.9.3
- junit.jupiter.version=5.10
- allure-junit4.version=2.24.0
- allure-report.version=2.24.0
- selenium.version =4.11

### Установка зависимостей
Все зависимости отображены в pom.xml файле
```

## Тестирование

Проект можно запускать потестово и поклассово из среды разработки Intelliji Idea 
