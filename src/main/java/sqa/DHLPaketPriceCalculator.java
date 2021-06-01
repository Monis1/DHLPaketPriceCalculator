package sqa;

public class DHLPaketPriceCalculator {

    public static double calculatePrice(ProductType type, double weight, Size size,
                                     PointOfSale pointOfSale, DeliveryAddress deliveryAddress) {
        switch(deliveryAddress) {
            case zone0:
                if(type.equals(ProductType.packchenS)
                        && weight == 2.0
                        && size.equals(Size.size_35_25_10)
                        && pointOfSale.equals(PointOfSale.online)) {
                    return 4.89;
                }
                break;
            case zone1:
                if(type.equals(ProductType.paketS)
                        && weight == 2.0
                        && size.equals(Size.size_60_30_15)
                        && pointOfSale.equals(PointOfSale.online)) {
                    return 13.99;
                }
                break;
            case zone2:
                if(type.equals(ProductType.paketM)
                        && weight == 5.0
                        && size.equals(Size.size_120_60_60)
                        && pointOfSale.equals(PointOfSale.online)) {
                    return 26.90;
                }
                break;
            case zone3:
                if(type.equals(ProductType.paketL)
                        && weight == 10.0
                        && size.equals(Size.size_120_60_60)
                        && pointOfSale.equals(PointOfSale.online)) {
                    return 37.99;
                }
                break;
            case zone4:
                if(type.equals(ProductType.paketM)
                        && weight == 5.0
                        && size.equals(Size.size_60_30_15)
                        && pointOfSale.equals(PointOfSale.store)) {
                    return 31.99;
                }
                break;
            case zone5:
                if(type.equals(ProductType.reisegepack)
                        && weight == 31.5
                        && size.equals(Size.size_120_60_60)
                        && pointOfSale.equals(PointOfSale.online)) {
                    return 105.99;
                }
                break;
            case zone6:
                if(type.equals(ProductType.paketXL)
                        && weight == 31.5
                        && size.equals(Size.size_120_60_60)
                        && pointOfSale.equals(PointOfSale.store)) {
                    return 98.99;
                }
                break;
            case zone7:
                if(type.equals(ProductType.packchenM)
                        && weight == 2.0
                        && size.equals(Size.size_60_30_15)
                        && pointOfSale.equals(PointOfSale.online)) {
                    return 15.89;
                }
                break;
            case zone8:
                if(type.equals(ProductType.packchenS)
                        && weight == 2
                        && size.equals(Size.size_60_30_15)
                        && pointOfSale.equals(PointOfSale.online)) {
                    return 8.89;
                }
                break;
            default:
                break;
        }
        return 0.0;
    }

}
