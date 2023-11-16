package ru.mirea.lab20.n2;

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

    public void printClassNames() {
        System.out.println("GenericType class name: " + genericType.getClass().getSimpleName());
        System.out.println("Value class name: " + value.getClass().getSimpleName());
        System.out.println("Key class name: " + key.getClass().getSimpleName());
    }

    public static void main(String[] args)
    {
        GenericClass<Integer, String, Double> genericObj = new GenericClass<>(324, "Дженерики", 3.423);
        genericObj.printClassNames();
    }
}
