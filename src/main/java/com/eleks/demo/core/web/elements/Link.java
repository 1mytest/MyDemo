package com.eleks.demo.core.web.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.eleks.demo.core.web.WebComponent;

public class Link extends WebComponent<Link> {

	public Link(WebDriver driver, By findByMethod) {
		super(driver, findByMethod);
	
	}

}
