package com.wangxia.player.entity;

/**
 * Created by archer on 2017/4/8.
 */
public class Order {
    private int id;
    private int playerId;
    private String playerName;
    private String createTime;
    private int win;
    private int lose;
    private String selectBeast;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                ", createTime='" + createTime + '\'' +
                ", win=" + win +
                ", lose=" + lose +
                ", selectBeast='" + selectBeast + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public String getSelectBeast() {
        return selectBeast;
    }

    public void setSelectBeast(String selectBeast) {
        this.selectBeast = selectBeast;
    }
}
