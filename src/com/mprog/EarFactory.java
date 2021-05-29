package com.mprog;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class EarFactory {
    static Map<String, EarType> earTypes = new HashMap<>();

    public static EarType getEarType(String name, Color color, String otherTreeData) {
        EarType result = earTypes.get(name);
        if (result == null) {
            result = new EarType(name, color, otherTreeData);
            earTypes.put(name, result);
        }
        return result;
    }
}
