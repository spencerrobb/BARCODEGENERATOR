package com.example.demo.services.Barcodes;

import java.awt.image.BufferedImage;


public interface BarcodeGenerator {

    BufferedImage generateEAN13BarcodeImage(String barcode) throws Exception;
}
