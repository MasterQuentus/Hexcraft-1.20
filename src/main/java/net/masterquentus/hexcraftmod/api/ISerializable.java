package net.masterquentus.hexcraftmod.api;

public interface ISerializable<T> {

    T serialize();
    void deserialize(T data);

}