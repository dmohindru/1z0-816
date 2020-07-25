package dev.dmohindru.example;

public enum AnimalClasses {
           MAMMAL(true), INVERTIBRATE(Boolean.FALSE), BIRD(false),
           REPTILE(false), AMPHIBIAN(false), FISH(false) {
                public int swim() { return 4; }
             };
           final boolean hasHair;
           private AnimalClasses(boolean hasHair) {
              this.hasHair = hasHair;
             }
          public boolean hasHair() { return hasHair; }
          public int swim() {
               return 0; }
       }
