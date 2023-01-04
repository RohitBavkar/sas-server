package com.sas.config;

import org.springframework.stereotype.Component;

/**
 * @author rohit
 **/
@Component
public class Cache {
    static int j=10;
    static{
        int i=1000;
        System.out.println(i);
        System.out.println(j);
    }
}
