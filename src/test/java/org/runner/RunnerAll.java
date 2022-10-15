package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources\\FeatureFolder", glue="org.stepdefinition",
dryRun=false, strict=true,tags= {"@regression"},plugin = {"html:target\\All reports","junit:target\\All reports\\ICING.xml","json:target\\All reports\\output.json"})

public class RunnerAll {	


}
