package image;

import javafx.scene.paint.Color;

public class PaletteRasterImage {

    private final int width;
    private final int height;
    private final Color[][] pixels;

    public PaletteRasterImage(Color color, int width, int height){
        this.width = width;
        this.height = height;
        pixels = new Color[width][height];
        setPixelsColor(color);
    }

    private void setPixelsColor(Color color) {
    }
}
