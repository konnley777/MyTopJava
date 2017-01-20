package myorg.slava.com.model;

import myorg.slava.com.util.TimeUtil;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * v.seregin
 * on 02.11.2016.
 */
public class UserMeal extends BaseEntity {
    private   User user;
    protected   String description;
    private LocalDateTime dateTime;
    protected int calories;

    public UserMeal(){}
    public UserMeal(UserMeal meal) {
        this(meal.id, meal.dateTime, meal.description, meal.calories);
    }
    public UserMeal(Integer id, LocalDateTime dateTime, String description, int calories) {
        super(id);
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
    }
    public UserMeal(User user, String description, LocalDateTime dateAdd, int calories) {
        this.user = user;
        this.description = description;
        this.dateTime = dateTime;
        this.calories = calories;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateAdd() {
        return dateTime;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateTime = dateTime;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "UserMeal{" +
                "user=" + user +
                ", description='" + description + '\'' +
                ", dateTime=" + TimeUtil.toString(dateTime) +
                ", calories=" + calories +
                '}';
    }
}
