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
    private LocalDateTime datetime;
    protected int calories;

    public UserMeal(){}
    public UserMeal(User user, String description, LocalDateTime dateAdd, int calories) {
        this.user = user;
        this.description = description;
        this.datetime = datetime;
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
        return datetime;
    }

    public void setDateAdd(Date dateAdd) {
        this.datetime = datetime;
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
                ", datetime=" + TimeUtil.toString(datetime) +
                ", calories=" + calories +
                '}';
    }
}
