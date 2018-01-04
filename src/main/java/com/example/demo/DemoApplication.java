package com.example.demo;

import com.example.demo.model.DataBean;
import com.example.demo.model.OtherBean;
import com.example.demo.model.SampleBean;
import com.example.demo.model.SayHello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(DemoConfiguration.class, args);

//		DataBean bean = context.getBean(DataBean.class);
//	    System.out.println(bean.getX());

//        SampleBean data = context.getBean(SampleBean.class);
//        System.out.println(data.getDataBean().getX());

//        OtherBean bean = context.getBean(OtherBean.class);
        //hw 2
//        System.out.println(bean.getDataBean().getX());

        //hw1
//        System.out.println(bean.getSampleBean().getDataBean().getX());

        SayHello hello = context.getBean(SayHello.class);
        String response = hello.hello("Jati");

        System.out.println(response);
	}
}
