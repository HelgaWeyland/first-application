package ru.company.tasks;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Task6 {

    @Test
    public void testFunc() {
        Gson gson = new Gson();
        RequestSpecification request = RestAssured.given();
        try {
            Connection conn = DriverManager.getConnection("url", "user", "password");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

}