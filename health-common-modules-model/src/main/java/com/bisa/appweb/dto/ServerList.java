package com.bisa.appweb.dto;

import java.util.List;

/**
 * Created by Administrator on 2017/10/11.
 */

public class ServerList {

    public int version;
    public List<ServerInfo> list;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public List<ServerInfo> getList() {
        return list;
    }

    public void setList(List<ServerInfo> list) {
        this.list = list;
    }
}
