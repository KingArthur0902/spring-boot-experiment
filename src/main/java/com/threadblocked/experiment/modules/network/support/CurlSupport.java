package com.threadblocked.experiment.modules.network.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author: Arthur Tsang
 * Date:   2019-07-22 11:27
 * Desc:
 */
@Component
public class CurlSupport {

    private String s2 = "dev";
    private String s1 = "master";
    private Logger log = LoggerFactory.getLogger(CurlSupport.class);

    public void getSomeUrl(String url) {
        String[] cmds = {"curl", "-H", "Cache-Control: max-age=0", "--compressed", url};

        ProcessBuilder process = new ProcessBuilder(cmds);
        Process p;
        try {
            String ls = System.getProperty("line.separator");
            p = process.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                builder.append(line).append(ls);
            }
            log.trace("{}", builder.toString());

        } catch (IOException e) {
            log.error("",e);
        }
    }

}
