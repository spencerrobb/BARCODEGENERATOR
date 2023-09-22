package com.example.demo.services.BarbecueService;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.image.BufferedImage;

@Service
public class BarbecueBarcodeGeneratorImpl implements BarcecueBarcodeGenerator {

    private static final Font BARCODE_TEXT_FONT = new Font("BOLD",16,16) ;

    public BufferedImage generateEAN13BarcodeImage(String barcodeText) throws Exception {
        Barcode barcode = BarcodeFactory.createEAN13(barcodeText);
        barcode.setFont(BARCODE_TEXT_FONT);

        return BarcodeImageHandler.getImage(barcode);
    }

}
