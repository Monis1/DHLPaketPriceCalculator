package sqa;

public enum Size {

    size_35_25_10("35 x 25 x 10"),
    size_60_30_15("60 x 30 x 15"),
    size_120_60_60("120 x 60 x 60"),
    size_0("0");

    private String displayName;

    Size(String displayName) {
        this.displayName =  displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
