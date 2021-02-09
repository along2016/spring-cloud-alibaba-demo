package com.alibaba.cloud.examples.utils;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * Created by Administrator on 2021/2/9 0009.
 */
public class ExceptionUtil {

    private ExceptionUtil(){}

    public static void handleException(String name, BlockException ex) {
        System.out.println("Oops: " + ex.getClass().getCanonicalName());
    }
}
