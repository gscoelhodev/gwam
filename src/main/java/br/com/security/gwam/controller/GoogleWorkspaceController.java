package br.com.security.gwam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/googleWorkspace")
public class GoogleWorkspaceController {

    @GetMapping("load")
    public String load(){
        return "LDAP Authentication fine loaded";
    }

}
