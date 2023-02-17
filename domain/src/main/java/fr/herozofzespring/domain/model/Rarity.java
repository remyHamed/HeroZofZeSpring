package fr.herozofzespring.domain.model;

public enum Rarity {
    COMMON(0),RARE(10),LEGENDARY(20);
    private final int buffer;
    Rarity(int buffer) {
        this.buffer = buffer;
    }

    public int getBuffer() {
        return buffer;
    }
}
