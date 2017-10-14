package com.controller;
import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @RequestMapping(value = "/", method = GET)
    public String show() {
        // jspのファイル名
        return "test";
    }
}