package com.czxy.score.controller;

import com.czxy.score.domain.Metting;
import com.czxy.score.domain.User;
import com.czxy.score.service.MettingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("metting")
@SuppressWarnings("all")
public class MettingController {
    @Resource
    private MettingService mettingService;


    @GetMapping
    public ResponseEntity<List<Metting>> findById(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        System.out.println(user);
        try {
            List<Metting> byUid = mettingService.findByUid(user.getUserId());
//            System.out.println(mettingVoList);
            return new ResponseEntity<>(byUid, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("user.action")
    public ResponseEntity<List<Metting>> findByUId(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        System.out.println(user);
        try {
            List<Metting> byUid = mettingService.find(user.getUserId());
//            System.out.println(mettingVoList);
            return new ResponseEntity<>(byUid, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Metting> find(@PathVariable Integer id) {
        try {
            Metting byMid = mettingService.findByMid(id);
            return new ResponseEntity<>(byMid, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
