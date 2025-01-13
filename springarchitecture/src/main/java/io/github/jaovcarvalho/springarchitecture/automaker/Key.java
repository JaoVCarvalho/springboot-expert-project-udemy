package io.github.jaovcarvalho.springarchitecture.automaker;

import java.util.Objects;

public class Key {

    private Automaker automaker;
    private KeyType type;

    public Key(Automaker automaker, KeyType type) {
        this.automaker = automaker;
        this.type = type;
    }

    public Automaker getAutomaker() {
        return automaker;
    }

    public void setAutomaker(Automaker automaker) {
        this.automaker = automaker;
    }

    public KeyType getType() {
        return type;
    }

    public void setType(KeyType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return automaker == key.automaker && type == key.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(automaker, type);
    }
}
