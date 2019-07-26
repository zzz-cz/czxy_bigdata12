package com.czxy.score.service;

import com.czxy.score.dao.MettingMapper;
import com.czxy.score.dao.User_MettingMapper;
import com.czxy.score.domain.Metting;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
@SuppressWarnings("all")
public class MettingService {
    @Resource
    private MettingMapper mettingMapper;
    @Resource
    private User_MettingMapper user_mettingMapper;

    @Resource
    private RoomService roomService;

    /**
     * 查找当前登录用户未来七天的会议
     *
     * @param uid
     * @return
     */
    public List<Metting> findByUid(Integer uid) {
        List<Integer> byUserId = user_mettingMapper.findByUserId(uid);
        List<Metting> mettingList = new ArrayList<>();
        for (Integer integer : byUserId) {
            Metting bymId = mettingMapper.findBymId(integer);
//            if(bymId.getRoom_id()!=null){
//                Room byId = roomService.findById(bymId.getRoom_id());
//                bymId.setRoom(byId);
//            }
            mettingList.add(bymId);
        }
        return mettingList;
    }

    public List<Metting> find(Integer uid) {
        List<Integer> byUserId = user_mettingMapper.findByUserId(uid);
        List<Metting> mettingList = new ArrayList<>();
        for (Integer integer : byUserId) {
            Metting bymId = mettingMapper.find(integer);
//            if(bymId.getRoom_id()!=null){
//                Room byId = roomService.findById(bymId.getRoom_id());
//                bymId.setRoom(byId);
//            }
            mettingList.add(bymId);
        }
        return mettingList;
    }

    public Metting findByMid(Integer mid) {
        return mettingMapper.selectByPrimaryKey(mid);
    }


}
