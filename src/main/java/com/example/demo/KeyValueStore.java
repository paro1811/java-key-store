package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class KeyValueStore {

    private Map<String, String> store;

    /**
     * constructor initializing the map
     */
    public KeyValueStore() {
        this.store = new HashMap<>();
    }

    /**
     * adds the key and value to the store
     * @param key : the key to be added
     * @param value : the value matched to the specified key
     */
    public void add(String key, String value){
        store.put(key, value);
    }

    /**
     * retrieves the value matched to the specified key from the map
     * @param key : the string input required to get the value
     * @return : returns the String value matched to the key
     */
    public String get(String key){
        return store.get(key);
    }

    /**
     * removes a key-value pair from the map
     * @param key : the key of the key-value pair that is to be removed
     * @return : returns the value of the key that has been removed.
     */
    public String remove(String key){
        if(store.containsKey(key)){
            String val = store.get(key);
            store.remove(key);
            return val;
        }
        return null;
    }

    /**
     * deletes the entire map(store) and creates a new empty one.
     */
    public void delete(){
        this.store = new HashMap<String, String>();
    }
}
