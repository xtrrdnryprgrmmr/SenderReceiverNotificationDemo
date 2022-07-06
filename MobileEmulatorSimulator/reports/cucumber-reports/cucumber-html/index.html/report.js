$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Feature/Mail.feature");
formatter.feature({
  "name": "Mail.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Mail"
    }
  ]
});
formatter.scenario({
  "name": "android api app",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Mail"
    }
  ]
});
formatter.step({
  "name": "Get \"Pixel 3 API 30\" \"emulator-5554\" capabilities from resource and lunch app",
  "keyword": "* "
});
formatter.match({
  "location": "SendMailFromGmailTest.launchDriver(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send Mail from sender to receiver specific subject with content",
  "keyword": "* "
});
formatter.match({
  "location": "SendMailFromGmailTest.sendMailToReceiver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close app",
  "keyword": "* "
});
formatter.match({
  "location": "SendMailFromGmailTest.closeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get \"Pixel 4 API 30\" \"emulator-5556\" capabilities from resource and lunch app",
  "keyword": "* "
});
formatter.match({
  "location": "SendMailFromGmailTest.launchDriver(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click last received mail",
  "keyword": "* "
});
formatter.match({
  "location": "SendMailFromGmailTest.clickLastReceivedMail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify element come from sender user",
  "keyword": "* "
});
formatter.match({
  "location": "SendMailFromGmailTest.verifyMailFromSender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send Mail from receiver to sender subject with content",
  "keyword": "* "
});
formatter.match({
  "location": "SendMailFromGmailTest.sendMailToSender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close app",
  "keyword": "* "
});
formatter.match({
  "location": "SendMailFromGmailTest.closeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get \"Pixel 3 API 30\" \"emulator-5554\" capabilities from resource and lunch app",
  "keyword": "* "
});
formatter.match({
  "location": "SendMailFromGmailTest.launchDriver(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click last received mail",
  "keyword": "* "
});
formatter.match({
  "location": "SendMailFromGmailTest.clickLastReceivedMail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify element come from receiver user",
  "keyword": "* "
});
formatter.match({
  "location": "SendMailFromGmailTest.verifyMailFromReceiver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close app",
  "keyword": "* "
});
formatter.match({
  "location": "SendMailFromGmailTest.closeApp()"
});
formatter.result({
  "status": "passed"
});
});