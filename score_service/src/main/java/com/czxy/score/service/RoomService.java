package com.czxy.score.service;

import com.czxy.score.dao.RoomMapper;
import com.czxy.score.domain.Room;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoomService  {

    @Resource
    private RoomMapper roomMapper;


    public Room findById(Integer id){
        System.out.println(id);
        Room room = roomMapper.selectByPrimaryKey(id);
        System.out.println(room);
        return room;
    }
}
