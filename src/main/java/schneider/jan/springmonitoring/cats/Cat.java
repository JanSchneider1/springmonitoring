package schneider.jan.springmonitoring.cats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Cat implements Serializable {

    @Id
    @GeneratedValue
    private Long catID;

    private String name;
    private String furColor;
    private String favoriteFood;

    public Cat() {

    }

    public Cat(String name, String furColor, String favoriteFood) {
        this.name = name;
        this.furColor = furColor;
        this.favoriteFood = favoriteFood;
    }

    public Long getCatID() {
        return catID;
    }

    public void setCatID(Long catID) {
        this.catID = catID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}
