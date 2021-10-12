package com.inmo.inmodata;

public abstract class AbstractInfo{

    /**
     * @return 获取注解
     */
    protected String getType() {
        MessageType messageType = this.getClass().getAnnotation(MessageType.class);
        return messageType.type();
    }
}
