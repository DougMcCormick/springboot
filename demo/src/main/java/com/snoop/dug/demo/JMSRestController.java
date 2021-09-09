package com.snoop.dug.demo;


import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import com.snoop.dug.demo.objects.IGORequest;


import org.springframework.web.bind.annotation.*;

@RestController
public class JMSRestController {

    @RequestMapping(value="/api/planConnect",method= RequestMethod.POST)
    public String planConnectReceive(@RequestBody IGORequest body) {
        return "success";
    }
}
