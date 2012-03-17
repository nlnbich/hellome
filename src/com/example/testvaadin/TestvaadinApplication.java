package com.example.testvaadin;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class TestvaadinApplication extends Application {
	@Override
	public void init() {
		
		
		Window mainWindow = new Window("Testvaadin Application");
		Label label = new Label("Hello Vaadin user");
		mainWindow.addComponent(label);
		setMainWindow(mainWindow);
		setTheme("testvaadintheme");
	}

}
