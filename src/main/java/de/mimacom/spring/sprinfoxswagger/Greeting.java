package de.mimacom.spring.sprinfoxswagger;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="Simple Greeting", description="This is a simple greeting")
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @ApiModelProperty(value = "ID of the greeting")
    public long getId() {
        return id;
    }

    @ApiModelProperty(value = "Content of the greeting")
    public String getContent() {
        return content;
    }
}
