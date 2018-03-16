package com.winscheater.btweb.dht;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 2018/3/15.
 */
public class BootstrapNodes {

    private static Set<BaseNode> nodes = new HashSet<>();

    static {
        nodes.add(new BaseNode("router.bittorrent.com", 6881));
        nodes.add(new BaseNode("dht.transmissionbt.com", 6881));
        nodes.add(new BaseNode("router.utorrent.com", 6881));
    }

    public boolean add(BaseNode baseNode) {
        return nodes.add(baseNode);
    }

    public boolean remove(BaseNode baseNode) {
        return nodes.remove(baseNode);
    }

    public static Set<BaseNode> getNodes() {
        return nodes;
    }

}
