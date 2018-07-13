//package com.hui;
//
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.net.URL;
//
//import org.springframework.context.annotation.Bean;
//
//@Configuration
//@ComponentScan({"com.hui"})
//public class SpringConfig {
//    @Bean
//    public static Logger logger(){
//        String path="/com/log4j.properties";
//        URL url=SpringConfig.class.getResource(path);
//        ConfigurationSource source;
//        try {
//            source = new ConfigurationSource(new FileInputStream(new File(url.getPath())),url);
//            Configurator.initialize(null, source);
//        } catch (FileNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        Logger logger = Logger.getLogger(SpringConfig.class);
//        return logger;
//    }
//}
