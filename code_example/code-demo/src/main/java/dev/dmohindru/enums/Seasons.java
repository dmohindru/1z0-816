package dev.dmohindru.enums;

public enum Seasons {
    WINTER(100, "Less"){
        public String getOpenings() {
            return "10am-3pm";
        }
    },
    SPRING(200, "More") {
        public String getOpenings() {
            return "9am-4pm";
        }
    },
    SUMMER(300, "Very Less") {
        public String getOpenings() {
            return "8:30am-5pm";
        }
    },
    FALL(400, "More Less") {
        public String getOpenings() {
            return "10:30am-3:30pm";
        }

        public String getData() {
            return "Overridden value";
        }
    };
    private final Integer range;
    private final String expectedVisitors;

    private Seasons(Integer range, String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
        this.range = range;
    }

    public String getData() {
        return expectedVisitors + " - " + range;
    }

    public Integer getRange() {
        return this.range;
    }

    public String getExpectedVisitors() {
        return this.expectedVisitors;
    }

    abstract public String getOpenings();

}
