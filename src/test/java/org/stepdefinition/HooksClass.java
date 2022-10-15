package org.stepdefinition;

import java.io.IOException;

import org.friend.BaseClassCumb;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClassCumb {

	@Before
	private void launch() {

		launchBrowse();
		launchUrl("https://www.icing.com/");
	}

	@After
	private void afterscen(Scenario s) throws IOException {
		if (s.isFailed()) {
			String s1 = s.getName();
			String name = s1.replace("", "_");
			screen(name);
		}

	}

	@After
	private void afterSS(Scenario s) {
		if (s.isFailed()) {

			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screen = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(screen, "image/png");
		}

	}

}
