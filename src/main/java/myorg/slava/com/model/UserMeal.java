package myorg.slava.com.model;

import java.util.Date;

/**
 * v.seregin
 * on 02.11.2016.
 */
public class UserMeal extends BaseEntity {
    private   User user;
    private  String description;
    private  Date dateAdd;
    private int calories;

    public UserMeal(User user, String description, Date dateAdd, int calories) {
        this.user = user;
        this.description = description;
        this.dateAdd = dateAdd;
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

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
