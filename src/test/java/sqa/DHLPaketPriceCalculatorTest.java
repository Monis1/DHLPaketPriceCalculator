package sqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class DHLPaketPriceCalculatorTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/sqa/test_cases.csv", numLinesToSkip = 1)
    void calculatePrice(String productType, double weight, String size,
                        String pointOfSale, String deliveryAddress, double expectedPrice) {
        ProductType inputProductType = getProductType(productType);
        Size inputSize = getSize(size);
        DeliveryAddress inputDeliverAddress = getDeliveryAddress(deliveryAddress);
        double actualPrice = DHLPaketPriceCalculator.calculatePrice(inputProductType, weight,
                inputSize, PointOfSale.valueOf(pointOfSale), inputDeliverAddress);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }

    private DeliveryAddress getDeliveryAddress(String deliveryAddress) {
        for (DeliveryAddress addressItem : DeliveryAddress.values()) {
            if(addressItem.getDisplayName().equals(deliveryAddress)) {
                return addressItem;
            }
        }
        return DeliveryAddress.zone0; //Default
    }

    private Size getSize(String size) {
        for (Size sizeItem : Size.values()) {
            if(sizeItem.getDisplayName().equals(size)) {
                return sizeItem;
            }
        }
        return Size.size_0; //Default
    }

    private ProductType getProductType(String productType) {
        for (ProductType type : ProductType.values()) {
            if(type.getDisplayName().equals(productType)) {
                return type;
            }
        }
        return ProductType.None; //Default
    }

}