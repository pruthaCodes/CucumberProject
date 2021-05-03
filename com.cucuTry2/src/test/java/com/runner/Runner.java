package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "P:\\Testing IT\\In tution\\Practice on Cucumber\\com.cucuTry2\\src\\test\\java\\Feature\\Login.feature",
                 glue= {"com.steps"},
				 monochrome=true,
				 dryRun=false,
				 plugin= {"html:Reports\\HTMLReports",
						 "json:Reports\\JsonReports\\Cucumber.json",
                         "junit:Reports\\JUnitReport\\Cucumber.xml"}

		)

public class Runner {

}
