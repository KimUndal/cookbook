package com.example.cookbook.model;

import java.sql.Timestamp;

public class Recipe {
    private String recipeId;
    private String ingredient;
    private double amount;
    private String unit;
    private int hour;
    private int minute;

    private String bookId;

    private String difficulty;
    private String instructions;
    private String category;

    private Timestamp createdAt;

    public Recipe(String recipeId, String ingredient, double amount, String unit, int hour, int minute, String bookId, String difficulty, String instructions, String category, Timestamp createdAt) {
        this.recipeId = recipeId;
        this.ingredient = ingredient;
        this.amount = amount;
        this.unit = unit;
        this.hour = hour;
        this.minute = minute;
        this.bookId = bookId;
        this.difficulty = difficulty;
        this.instructions = instructions;
        this.category = category;
        this.createdAt = createdAt;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeId='" + recipeId + '\'' +
                ", ingredient='" + ingredient + '\'' +
                ", amount=" + amount +
                ", unit='" + unit + '\'' +
                ", hour=" + hour +
                ", minute=" + minute +
                ", difficulty='" + difficulty + '\'' +
                ", instructions='" + instructions + '\'' +
                ", category='" + category + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
