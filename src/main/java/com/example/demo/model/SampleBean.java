package com.example.demo.model;

public class SampleBean {
    private  DataBean dataBean;

    public SampleBean(DataBean dataBean) {
        this.dataBean = dataBean;
    }

    public DataBean getDataBean() {
        return dataBean;
    }

    public void setDataBean(DataBean dataBean) {

        this.dataBean = dataBean;
    }
}
