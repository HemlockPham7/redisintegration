package com.convit.redis_spring.weather.service;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final ExternalServiceClient client;

    @Cacheable("weather")
    public int getInfo(int zip) {
        return 0;
    }

    @Scheduled(fixedRate = 10000)
    public void update() {
        System.out.print("updating weather");
        IntStream.rangeClosed(1, 5)
                .forEach(this.client::getWeatherInfo);
    }
}
