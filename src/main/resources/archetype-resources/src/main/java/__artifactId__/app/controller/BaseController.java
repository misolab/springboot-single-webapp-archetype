#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.app.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

public class BaseController {

    @ModelAttribute("common")
    public Map<String, String> common() {
        Map<String, String> model = new HashMap<>();

        return model;
    }
}
