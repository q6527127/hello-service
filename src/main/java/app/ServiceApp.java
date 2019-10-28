package app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


//启动服务提供方
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ServiceApp.class, args);
    }
}
