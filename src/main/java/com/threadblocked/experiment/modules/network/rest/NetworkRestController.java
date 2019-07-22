package com.threadblocked.experiment.modules.network.rest;

import com.threadblocked.experiment.modules.network.support.CurlSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Arthur Tsang
 * Date:   2019-07-22 11:32
 * Desc:
 */
@RequestMapping("/curl")
@RestController
public class NetworkRestController {


    @Autowired
    private CurlSupport curlSupport;

    @GetMapping("/url")
    public void curlTest(String numIid){
        curlSupport.getSomeUrl("https://item.taobao.com/item.htm?id=" + numIid);
    }

}
