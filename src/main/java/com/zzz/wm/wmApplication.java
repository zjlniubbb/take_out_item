package com.zzz.wm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author zjlniubbb
 * @version 1.0
 */
@Slf4j
@SpringBootApplication
@ServletComponentScan
public class wmApplication {
    public static void main(String[] args) {
        SpringApplication.run(wmApplication.class,args);
        log.info("项目启动成功~~~");
    }
}
