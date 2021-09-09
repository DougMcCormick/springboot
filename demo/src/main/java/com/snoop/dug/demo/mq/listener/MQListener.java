package com.snoop.dug.demo.mq.listener;

import com.snoop.dug.demo.exception.BusinessException;
import com.snoop.dug.demo.services.SendJSONRequest;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MQListener {

    @Autowired
    SendJSONRequest jsonRequestService;
    @RabbitListener(queues="receiveMessage")
    public void receiveMessage(String message) throws BusinessException {

        String response = jsonRequestService.sendMessage(message);
        if (response.contains("Throw error"))  {
            throw new BusinessException();
        } else {
            System.out.print(response);
        }
    }
}
