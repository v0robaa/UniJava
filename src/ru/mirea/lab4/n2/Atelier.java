package ru.mirea.lab4.n2;

public class Atelier {
    public enum sizes{
        XXS(32){
            @Override
            public String getDescription() {
                return "Детский размер";
            }
        }, XS(34), S(36), M(38), L(40);
        public String getDescription() {
            return "Взрослый размер";
        }
        private final int euroSize;
        sizes(int euroSize) {
            this.euroSize = euroSize;
        }
    }

}
