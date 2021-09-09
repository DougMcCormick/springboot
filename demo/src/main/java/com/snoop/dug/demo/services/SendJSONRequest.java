package com.snoop.dug.demo.services;

import com.snoop.dug.demo.exception.BusinessException;
import org.springframework.stereotype.Service;

@Service
public class SendJSONRequest {

    public String sendMessage(String message) throws BusinessException {

        System.out.println(message);
        return "success";
    }
}
