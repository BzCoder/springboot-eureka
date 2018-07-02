package com.example.provider.service;

import org.springframework.stereotype.Service;

/**
 * @author BaoZhou
 * @date 2018/6/29
 */
@Service
public class TicketService  {

    public String getTicket()
    {
        System.out.println("我在运行");
        return "我得到了一张票";
    }
}
