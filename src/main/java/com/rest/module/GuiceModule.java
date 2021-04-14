package com.rest.module;

import com.google.inject.servlet.ServletModule;
import com.rest.servlet.GuiceServlet;

public class GuiceModule extends ServletModule{
	
	protected void configureServlets() {
		
		serve("/").with(GuiceServlet.class);
	}

}
