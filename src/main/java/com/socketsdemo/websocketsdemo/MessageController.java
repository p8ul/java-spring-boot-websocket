package com.socketsdemo.websocketsdemo;

import com.socketsdemo.websocketsdemo.dao.Message;
import com.socketsdemo.websocketsdemo.dao.ResponseMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public ResponseMessage getMessage(final Message message) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(message + " is our message");
        return new ResponseMessage(HtmlUtils.htmlEscape(message.getMessageContent()));

    }
}
