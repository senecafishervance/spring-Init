package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormController {

    // responds to get requests at "/form"
    @GetMapping("form")
    @ResponseBody
    public String FormPage() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/form'>" +
                        "<label for= name> Enter Name </label>" +
                        "<input type = 'text' name = 'coder' />" +
                        "<p></p>"+
                        "<label for=favorite language>Choose first language:</label>" +
                        "<select name=firstlanguage id=language>" +
                        "<option value=JavaScript>JavaScript</option>" +
                        "<option value=Java>Java</option>" +
                        "<option value=Python>Python</option>" +
                        "</select>"+
                        "<p></p>" +

                        "<label for=favorite language>Choose second language:</label>" +
                        "<select name=secondlanguage id=language>" +
                        "<option value=JavaScript>JavaScript</option>" +
                        "<option value=Java>Java</option>" +
                        "<option value=Python>Python</option>" +
                        "</select>"+
                        "<p></p>" +

                        "<label for=favorite language>Choose third language:</label>" +
                        "<select name=thirdlanguage id=language>" +
                        "<option value=JavaScript>JavaScript</option>" +
                        "<option value=Java>Java</option>" +
                        "<option value=Python>Python</option>" +
                        "</select>"+
                        "<p></p>"+
                        "<input type = 'submit' value = 'Submit!' />" +
                        "</form>" +
                        "</body>" +
                "</html>";

        return html;

    }

    @PostMapping("form")
    @ResponseBody
    public String hello(@RequestParam String coder, @RequestParam String firstlanguage, @RequestParam String secondlanguage, @RequestParam String thirdlanguage) {
        return "<html>" +
                "Hello, " + coder + "! <br> Here are your languages choices: " +
                "1." + firstlanguage + "<br>" +
                "2." + secondlanguage + "<br>" +
                "3." + thirdlanguage + "<br>" +
                "</html>";
    }

}
