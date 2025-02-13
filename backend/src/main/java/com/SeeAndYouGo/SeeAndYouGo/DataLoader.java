package com.SeeAndYouGo.SeeAndYouGo;

import com.SeeAndYouGo.SeeAndYouGo.Connection.ConnectionService;
import com.SeeAndYouGo.SeeAndYouGo.Dish.DishService;
import com.SeeAndYouGo.SeeAndYouGo.Menu.MenuService;
import com.SeeAndYouGo.SeeAndYouGo.Restaurant.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final IterService iterService;

    @Autowired
    public DataLoader(IterService iterService) {
        this.iterService = iterService;
    }

    @Override
    public void run(String... args) {
        iterService.weeklyIterative();
    }
}