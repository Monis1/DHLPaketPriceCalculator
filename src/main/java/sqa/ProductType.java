package sqa;

public enum ProductType {

    packchenS("Packchen S"),
    packchenM("Packchen M"),
    paketS("Paket S"),
    paketM("Paket M"),
    paketL("Paket L"),
    paketXL("Paket XL"),
    reisegepack("Reisegepack"),
    None("none");

    private String displayName;

     ProductType(String displayName) {
        this.displayName =  displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
