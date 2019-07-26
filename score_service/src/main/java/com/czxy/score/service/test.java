package com.czxy.score.service;

import com.czxy.score.domain.Room;

public class test {

    public static void main(String[] args) {
        RoomService roomService=new RoomService();
        Room byId = roomService.findById(1);
        System.out.println(byId);
    }
}
