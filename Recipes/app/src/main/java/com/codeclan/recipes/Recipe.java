package com.codeclan.recipes;

import java.util.ArrayList;

/**
 * Created by Adam Baxter on 16/03/2017.
 */

public class Recipe {

    private String name;
    private String method;
    private ArrayList<Ingredient> ingredients;

    public Recipe(String name, String method, ArrayList<Ingredient> ingredients) {
        this.name = name;
        this.method = method;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
