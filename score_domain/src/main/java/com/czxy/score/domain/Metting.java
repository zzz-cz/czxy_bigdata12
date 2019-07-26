package com.czxy.score.domain;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tab_metting")
@SuppressWarnings("all")
public class Metting {
    @Id
    private Integer metting_id;
    private String metting_name;
    private Integer metting_size;
    private Date metting_starttime;
    private Date metting_endtime;
    private Date metting_ordertime;
    private String remark;
    private String status;
    private String  username;
    private Integer room_id;
    private Room room;
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Metting{" +
                "metting_id=" + metting_id +
                ", metting_name='" + metting_name + '\'' +
                ", metting_size=" + metting_size +
                ", metting_starttime=" + metting_starttime +
                ", metting_endtime=" + metting_endtime +
                ", metting_ordertime=" + metting_ordertime +
                ", remark='" + remark + '\'' +
                ", status='" + status + '\'' +
                ", username='" + username + '\'' +
                ", room_id=" + room_id +
                '}';
    }

    public Integer getMetting_id() {
        return metting_id;
    }

    public void setMetting_id(Integer metting_id) {
        this.metting_id = metting_id;
    }

    public String getMetting_name() {
        return metting_name;
    }

    public void setMetting_name(String metting_name) {
        this.metting_name = metting_name;
    }

    public Integer getMetting_size() {
        return metting_size;
    }

    public void setMetting_size(Integer metting_size) {
        this.metting_size = metting_size;
    }

    public Date getMetting_starttime() {
        return metting_starttime;
    }

    public void setMetting_starttime(Date metting_starttime) {
        this.metting_starttime = metting_starttime;
    }

    public Date getMetting_endtime() {
        return metting_endtime;
    }

    public void setMetting_endtime(Date metting_endtime) {
        this.metting_endtime = metting_endtime;
    }

    public Date getMetting_ordertime() {
        return metting_ordertime;
    }

    public void setMetting_ordertime(Date metting_ordertime) {
        this.metting_ordertime = metting_ordertime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public Metting(Integer metting_id, String metting_name, Integer metting_size, Date metting_starttime, Date metting_endtime, Date metting_ordertime, String remark, String status, String username, Integer room_id) {
        this.metting_id = metting_id;
        this.metting_name = metting_name;
        this.metting_size = metting_size;
        this.metting_starttime = metting_starttime;
        this.metting_endtime = metting_endtime;
        this.metting_ordertime = metting_ordertime;
        this.remark = remark;
        this.status = status;
        this.username = username;
        this.room_id = room_id;
    }

    public Metting() {
    }
}
