package com.hellox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author hellox
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class HelloxApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(HelloxApplication.class, args);
        //Application startup banner
        System.out.println(
                "====== HellloX System Startup Successfully =======\n" +
                "  ___ ___         .__  .__        ____  ___\n" +
                " /   |   \\   ____ |  | |  |   ____\\   \\/  /\n" +
                "/    ~    \\_/ __ \\|  | |  |  /  _ \\\\     / \n" +
                "\\    Y    /\\  ___/|  |_|  |_(  <_> )     \\ \n" +
                " \\___|_  /  \\___  >____/____/\\____/___/\\  \\\n" +
                "       \\/       \\/                      \\_/\n" +
                "================================================="
        );
    }
}
