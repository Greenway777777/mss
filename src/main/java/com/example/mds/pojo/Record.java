package com.example.mds.pojo;

import java.util.Date;

public class Record {
    private int r_id;
    private int uid;
    private int equip_id;
    private int quantity;
    private Date r_time;
    private String status;

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getEquip_id() {
        return equip_id;
    }

    public void setEquip_id(int equip_id) {
        this.equip_id = equip_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getR_time() {
        return r_time;
    }

    public void setR_time(Date r_time) {
        this.r_time = r_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Record{" +
                "r_id=" + r_id +
                ", uid=" + uid +
                ", equip_id=" + equip_id +
                ", quantity=" + quantity +
                ", r_time=" + r_time +
                ", status='" + status + '\'' +
                '}';
    }
}
