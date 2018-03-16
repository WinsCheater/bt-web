package com.winscheater.btweb.dht;

/**
 * Created by admin on 2018/3/15.
 */
public class BaseNode {
    private String url;

    private int port;

    public BaseNode(String url, int port) {
        this.url = url;
        this.port = port;
    }

    @Override
    public String toString() {
        return "BaseNode{" +
                "url='" + url + '\'' +
                ", port=" + port +
                '}';
    }
}
