package com.codeclan.recipes;

import java.util.ArrayList;

/**
 * Created by Adam Baxter on 16/03/2017.
 */

public class ShoppingList {

    private ArrayList<Ingredient> shoppingList;

    public ShoppingList(ArrayList<Ingredient> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public ArrayList<Ingredient> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(ArrayList<Ingredient> shoppingList) {
        this.shoppingList = shoppingList;
    }
}
