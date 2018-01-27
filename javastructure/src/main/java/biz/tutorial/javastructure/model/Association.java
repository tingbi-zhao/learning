package biz.tutorial.javastructure.model;

import java.util.Map;

public class Association implements Map.Entry {

    Object key;
    Object value;

    public Association(Object key, Object value) {
        this.key = key;
        this.value = value;
    }


    @Override
    public Object getKey() {
        return key;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public Object setValue(Object value) {
        this.value = value;
        return this.value;
    }
}
