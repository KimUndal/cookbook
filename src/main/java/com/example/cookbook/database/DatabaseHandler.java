package com.example.cookbook.database;

import com.example.cookbook.model.AppUser;
import com.example.cookbook.model.Book;
import com.example.cookbook.model.Recipe;

import java.sql.*;
import java.util.List;
import java.util.UUID;

public class DatabaseHandler {
    public static void main(String[] args) throws SQLException {

    }

    public void createUser(AppUser appUser) throws SQLException {
        String sql = "Insert into appuser values(?,?,?,?,?,?)";
        appUser.setUserId(UUID.randomUUID().toString());
        PreparedStatement pstm = connection().prepareStatement(sql);
        pstm.setString(1, appUser.getUserId());
        pstm.setString(2, appUser.getUsername());
        pstm.setString(3, appUser.getPassword());
        pstm.setString(4, appUser.getEmail());
        pstm.setString(5, appUser.getFirstName());
        pstm.setString(6, appUser.getLastName());
        pstm.executeUpdate();
        pstm.close();
    }

    public void createBook(Book book) throws SQLException {
        String sql = "Insert into book values(?,?,?,?)";
        book.setBookId(UUID.randomUUID().toString());
        PreparedStatement pstm = connection().prepareStatement(sql);
        pstm.setString(1, book.getBookId());
        pstm.setString(2, book.getBookTitle());
        pstm.setString(3, book.getUserId());
        pstm.setTimestamp(4, book.getCreatedAt());
        pstm.executeUpdate();
        pstm.close();
    }

    public void createRecipe(Recipe recipe) throws SQLException {
        String sql = "Insert into recipe values(?,?,?,?,?,?,?,?,?,?)";
        recipe.setRecipeId(UUID.randomUUID().toString());
        PreparedStatement pstm = connection().prepareStatement(sql);
        pstm.setString(1, recipe.getRecipeId());
        pstm.setDouble(2, recipe.getAmount());
        pstm.setString(3, recipe.getUnit());
        pstm.setInt(4, recipe.getHour());
        pstm.setInt(5, recipe.getMinute());
        pstm.setString(6, recipe.getDifficulty());
        pstm.setString(7, recipe.getInstructions());
        pstm.setString(8, recipe.getCategory());
        pstm.setTimestamp(9, recipe.getCreatedAt());
        pstm.setString(10, recipe.getBookId());
        pstm.executeUpdate();
        pstm.close();
    }

    public Recipe getRecipeById(String recipeId){
        return null;
    }

    public List<Recipe> getAllRecipe(){
        return null;
    }

    public Book getBookById(String bookId){
        return null;
    }

    public Recipe getRecipeById(String recipeId){
        return null;
    }




    private static void createTableUser() throws SQLException {
        Statement stm = connection().createStatement();
        String sql = "create table AppUser(" +
                "user_id varchar, " +
                "username varchar, " +
                "password varchar, " +
                "email varchar, " +
                "first_name varchar, " +
                "last_name varchar," +
                "created_at timestamp, " +
                "primary key(user_id)" +
                ")";
        stm.executeUpdate(sql);
        stm.close();
    }

    private static void createTableRecipe() throws SQLException {
        Statement stm = connection().createStatement();
        String sql = "create table Recipe(" +
                "recipe_id varchar, " +
                "amount smallint, " +
                "unit varchar," +
                "hour smallint," +
                "minute smallint," +
                "difficulty varchar," +
                "instruction varchar," +
                "category varchar," +
                "createdAt timestamp," +
                "book_id varchar," +
                "primary key(recipe_id)," +
                "foreign key(book_id) references book(book_id)" +
                ")";
        stm.executeUpdate(sql);
        stm.close();
    }

    private static void createTableBook() throws SQLException {
        Statement stm = connection().createStatement();
        String sql = "create table book(" +
                "book_id varchar, " +
                "book_title varchar, " +
                "userId varchar, " +
                "created_at timestamp, " +
                "primary key(book_id)," +
                "foreign key (userId) references AppUser(user_id)" +
                ")";
        stm.executeUpdate(sql);
        stm.close();
    }


    private static Connection connection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cookbook", Env.getUsername(), Env.getPassword());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
