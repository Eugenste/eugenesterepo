package ua.kpi.tef.util;

import ua.kpi.tef.model.UserMeal;
import ua.kpi.tef.model.UserMealWithExceed;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;

/**
 * GKislin
 * 31.05.2015.
 */
public class UserMealsUtil {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,10,0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,13,0), "Обед", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,20,0), "Ужин", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,10,0), "Завтрак", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,13,0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,20,0), "Ужин", 510)
        );
        System.out.println(getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(14,0), 2000));
//        .toLocalDate();
//        .toLocalTime();
    }

    public static List<UserMealWithExceed>  getFilteredWithExceeded(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
        Map<Integer, Integer> dayAndCalories = new HashMap<>();
        List<UserMealWithExceed> userMealsUtils = new ArrayList<>();

        mealList.forEach( userMeal -> {
                dayAndCalories.putIfAbsent(userMeal.getDateTime().getDayOfMonth(),userMeal.getCalories());
                dayAndCalories.computeIfPresent(userMeal.getDateTime().getDayOfMonth(),
                                                (key,value) -> value + userMeal.getCalories());
        }
        );

        mealList.forEach( userMeal -> {
            if (TimeUtil.isBetween(userMeal.getDateTime().toLocalTime(), startTime, endTime) &&
                    (dayAndCalories.get(userMeal.getDateTime().getDayOfMonth()) > caloriesPerDay)) {
                userMealsUtils.add(new UserMealWithExceed(userMeal.getDateTime(),userMeal.getDescription(),
                                                                    userMeal.getCalories(),true));
            }
        }
        );
        return userMealsUtils;
    }
}
