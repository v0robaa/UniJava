package ru.mirea.lab20.n1;

public class GenericClass<T, V, K> {
    private T genericType;
    private V value;
    private K key;

    public GenericClass(T genericType, V value, K key) {
        this.genericType = genericType;
        this.value = value;
        this.key = key;
    }

    public T getGenericType() {
        return genericType;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    public void setGenericType(T genericType) {
        this.genericType = genericType;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }
}
