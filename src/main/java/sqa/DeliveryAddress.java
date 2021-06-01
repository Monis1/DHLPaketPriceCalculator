package sqa;

public enum DeliveryAddress {

    zone0("Zone 0"),
    zone1("Zone 1"),
    zone2("Zone 2"),
    zone3("Zone 3"),
    zone4("Zone 4"),
    zone5("Zone 5"),
    zone6("Zone 6"),
    zone7("Zone 7"),
    zone8("Zone 8");

    private String displayName;

    DeliveryAddress(String displayName) {
        this.displayName =  displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
