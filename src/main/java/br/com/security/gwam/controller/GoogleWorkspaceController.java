package br.com.security.gwam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/googleWorkspace")
public class GoogleWorkspaceController {

    @GetMapping("load")
    public String load(){
        return "Logged on LDAP and authentication fine loaded";
    }

    @GetMapping("authRequired")
    public String authRequired(){
        return "Logged on Google and authentication fine loaded";
    }


}