package com.example.demo.services.BarbecueService;

import java.awt.image.BufferedImage;


public interface BarcecueBarcodeGenerator {

    BufferedImage generateEAN13BarcodeImage(String barcode) throws Exception;
}
