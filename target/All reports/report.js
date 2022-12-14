$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFolder/OrderingPro.feature");
formatter.feature({
  "name": "",
  "description": "  Validate the ordering Functionality of ICING application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "      Validate the search box functionality of application",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User should  launch  brower and pass the url and maximise the window",
  "keyword": "Given "
});
formatter.match({
  "location": "OrderingSteps.user_should_launch_brower_and_pass_the_url_and_maximise_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should cilck the LogIn or Register",
  "keyword": "When "
});
formatter.match({
  "location": "OrderingSteps.user_should_cilck_the_LogIn_or_Register()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user  should type the valid username and valid password",
  "keyword": "When "
});
formatter.match({
  "location": "OrderingSteps.user_should_type_the_valid_username_and_valid_password()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d106.0.5249.119)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-I3KS3DV\u0027, ip: \u0027192.168.167.183\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_341\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.119, chrome: {chromedriverVersion: 106.0.5249.61 (511755355844..., userDataDir: C:\\Users\\user\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:64957}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 7ed35c2f55a9315bbca6115ab019bbf0\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027dwfrm_login_username\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.stepdefinition.OrderingSteps.user_should_type_the_valid_username_and_valid_password(OrderingSteps.java:38)\r\n\tat ???.user  should type the valid username and valid password(file:src/test/resources/FeatureFolder/OrderingPro.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user  should click  login button",
  "keyword": "And "
});
formatter.match({
  "location": "OrderingSteps.user_should_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should enter the product name into searchbox",
  "keyword": "And "
});
formatter.match({
  "location": "OrderingSteps.user_should_enter_the_product_name_into_searchbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "OrderingSteps.user_should_click_the_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should select the product and click the product",
  "keyword": "And "
});
formatter.match({
  "location": "OrderingSteps.user_should_select_the_product_and_click_the_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should move to the product page",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderingSteps.user_should_move_to_the_product_page()"
});
formatter.result({
  "status": "skipped"
});
});