package com.wipro.ats.bdre.pm.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by cloudera on 6/1/16.
 */
public class Insert {
    private String tableName;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    private List<Data> data;
}
