package com.newer.domain;

public class Rooms {

    private Integer rommid;
    private String roomtype;
    private Float price;
    private String state;

    public Integer getRommid() {
        return rommid;
    }

    public void setRommid(Integer rommid) {
        this.rommid = rommid;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
