package boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"me.zhuyeqing"})
public class Init {
    public static void main(String[] args){
        SpringApplication.run(Init.class,args);
    }

}
    