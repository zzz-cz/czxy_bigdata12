package com.czxy.score.dao;

import com.czxy.score.domain.Room;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface RoomMapper extends Mapper<Room> {
//@Select("SELECT * FROM tab_room WHERE room_id=#{room_id}")
//    Room findById (@Param("room_id") Integer room_id);
}
