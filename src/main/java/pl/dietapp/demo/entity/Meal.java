package pl.dietapp.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "meals")
public class Meal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany
    private List<ProductMeal> productMeals;
    private Timestamp date;

    public Meal() {
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductMeal> getProductMeals() {
        return productMeals;
    }

    public void setProductMeals(List<ProductMeal> productMeals) {
        this.productMeals = productMeals;
    }

}
