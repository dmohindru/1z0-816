package dev.dmohindru.example;

public enum Season {
    WINTER(100) {
        public String getHours() { return "10am-3pm"; }
    },
    SPRING(200) {
        public String getHours() { return "9am-5pm"; }
    },
    SUMMER(300) {
        public String getHours() { return "9am-7pm"; }
    },
    FALL(400) {
        public String getHours() { return "9am-5pm"; }
    };
    private final int numOfVistors;

    private Season(int numOfVistors) {
        this.numOfVistors = numOfVistors;
    }
    public abstract String getHours();
    public int getNumOfVisitors() {
        return this.numOfVistors;
    }
}
