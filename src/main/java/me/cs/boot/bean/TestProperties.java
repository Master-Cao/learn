package me.cs.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:test.properties")
@ConfigurationProperties(prefix = "test")
@Component
public class TestProperties {
    private String name;
    private String author;
    private String info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "TestProperties{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
