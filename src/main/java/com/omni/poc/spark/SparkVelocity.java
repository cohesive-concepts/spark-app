package com.omni.poc.spark;


import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.TemplateViewRoute;
import spark.TemplateViewRouteImpl;
import spark.servlet.SparkApplication;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.get;
/**
 * VelocityTemplateRoute example.
 */
public final class SparkVelocity implements SparkApplication {
	public static void main(final String[] args) {
		SparkVelocity app = new SparkVelocity();
		app.init();
	}
	
	
	@Override
	public void init() {
	//	get("/hello", (request, response) -> sendHelloPage(), new VelocityTemplateEngine());
	

	}
	
	public static class Person {
		private String name;
		public Person(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	private ModelAndView sendHelloPage() {
		Map<String, Object> model = new HashMap<>();
		model.put("hello", "Velocity World");
		model.put("person", new Person("Foobar"));
		return new ModelAndView(model, "hello.vm");
	}

}