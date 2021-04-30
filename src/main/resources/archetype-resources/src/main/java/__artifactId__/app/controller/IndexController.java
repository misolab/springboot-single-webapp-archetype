#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.app.controller;

import ${package}.${artifactId}.common.util.DateTimeUtils;
import ${package}.${artifactId}.web.vo.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@RequiredArgsConstructor
@Controller
@RequestMapping("/")
public class IndexController extends BaseController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("name", "hello misolab");
        model.addAttribute("list", Arrays.asList(1, 2, 3, 4));
        return "index";
    }

    @GetMapping("/api")
    public ResponseEntity<Object> index() {
        ApiResponse response = ApiResponse.of()
                .add("message", "This is api module")
                .add("current", DateTimeUtils.toString(System.currentTimeMillis(), "yyyy-MM-dd HH:mm:ss"));
        return response.toResponseEntity();
    }

}
