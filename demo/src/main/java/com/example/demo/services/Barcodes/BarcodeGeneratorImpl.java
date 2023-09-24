package com.example.demo.services.Barcodes;

import com.example.demo.services.Barcodes.BarcodeGenerator;
import org.krysalis.barcode4j.impl.upcean.EAN13Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.image.BufferedImage;

@Service
public class BarcodeGeneratorImpl implements BarcodeGenerator {

    private static final Font BARCODE_TEXT_FONT = new Font("Courier", Font.PLAIN, 20);

//    public BufferedImage generateEAN13BarcodeImage(String barcodeText) throws Exception {
//        Barcode barcode = BarcodeFactory.createEAN13(barcodeText);
//        barcode.setFont(BARCODE_TEXT_FONT);
//
//        return BarcodeImageHandler.getImage(barcode);
//    }


    public BufferedImage generateEAN13BarcodeImage(String barcodeText) {
        EAN13Bean barcodeGenerator = new EAN13Bean();
        BitmapCanvasProvider canvas =
                new BitmapCanvasProvider(160, BufferedImage.TYPE_BYTE_BINARY, false, 0);

        barcodeGenerator.generateBarcode(canvas, barcodeText);
        return canvas.getBufferedImage();
    }

}
