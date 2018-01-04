package com.example.demo;

import com.example.demo.model.DataBean;
import com.example.demo.model.OtherBean;
import com.example.demo.model.SampleBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.xml.crypto.Data;

public class DemoConfiguration {
    @Bean(name = "hw1")
    public DataBean createDataBean(){
        DataBean bean = new DataBean("hello world");

        return bean;
    }

//    @Primary
    @Bean(name = "hw2")
    public DataBean createDataBean2(){
        DataBean bean = new DataBean("Hello world 2");

        return bean;
    }

    @Bean
    public SampleBean createSampleBean(@Qualifier("hw1") DataBean dataBean){
        SampleBean bean = new SampleBean(dataBean);

        return bean;
    }

    @Bean
    public OtherBean createOtherBean(@Qualifier("hw2") DataBean dataBean, SampleBean sampleBean){
        OtherBean bean = new OtherBean(dataBean,sampleBean);

        return bean;
    }
}
