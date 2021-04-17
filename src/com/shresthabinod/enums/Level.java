package com.shresthabinod.enums;

public enum Level {
    HIGH (5),
    MEDIUM(3),
    LOW(1);

    private final int levelCode;
    Level (int levelCode){
        this.levelCode = levelCode;
    }
    public int getLevelCode() {
        return this.levelCode;
    }
}
