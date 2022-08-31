package dev.dmohindru.ch2;

public class Main {
}

@Hazard(danger = 10, description = "Water")
class Test{}

// Elements with default annotation can be skipped
@Hazard(danger = 12)
class AnotherTest{}

// annotation elements can be applied in any order
@Hazard(description = "Sand", danger = 2)
class YetAnotherTest{}

// Annotation without named elements
@Injured("arm")
class InjuredUsage{}

// When supplying multiple elements value named element should be explicitly specified
@Injured(value = "arm", veterinarian = "Jack", age = 2)
class AnotherInjuredUsage{}

@Injured(veterinarian = "Jack", age = 2)
class YetAnotherInjuredUsage{}

@Music(genere = {"Hollywood", "Tollywood"})
class MusicUsage{}
