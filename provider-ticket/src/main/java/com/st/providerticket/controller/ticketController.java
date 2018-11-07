package com.st.providerticket.controller;

import com.st.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luotao
 * @date 2018/11/7-17:30
 */
@RestController
public class ticketController {
    @Autowired
    private TicketService ticketService;
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/ticket")
    public String getTicket(){
        return "sda";
    }
}
