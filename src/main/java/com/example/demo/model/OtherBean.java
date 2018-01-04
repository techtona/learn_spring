package com.example.demo.model;

import javax.xml.crypto.Data;

public class OtherBean {
    private DataBean dataBean;

    private  SampleBean sampleBean;

    public OtherBean(DataBean dataBean, SampleBean sampleBean) {
        this.dataBean = dataBean;
        this.sampleBean = sampleBean;
    }

    public SampleBean getSampleBean() {
        return sampleBean;
    }

    public void setSampleBean(SampleBean sampleBean) {
        this.sampleBean = sampleBean;
    }

    public DataBean getDataBean() {

        return dataBean;
    }

    public void setDataBean(DataBean dataBean) {
        this.dataBean = dataBean;
    }
}
