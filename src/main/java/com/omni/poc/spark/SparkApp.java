package com.omni.poc.spark;

import static spark.Spark.*;
import spark.Route;

public class SparkApp {
	private static Route route;
	
    public static void main(String[] args) {
        get("/hello", (req, res) -> route);
    }
}
