package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;

import static util.Matrices.*;

public class PaletteRasterImage {

    
    private  int width;
    private  int height;
    private  Color[][] pixels;
    private ArrayList<Color> palette;


    public PaletteRasterImage(Color color, int width, int height){
        this.width = width;
        this.height = height;
        pixels = new Color[width][height];
        setPixelsColor(color);
    }

    public PaletteRasterImage(Color[][] pixels) {
        requiresNonNull(pixels);
        requiresNonZeroDimensions(pixels);
        requiresRectangularMatrix(pixels);
        for (int x = 0; x < this.width; x++) {
            for (int y = 0; y < this.height; y++) {
                this.palette.add(pixels[x][y]);
            }
        }
    }

    public void createRepresentation(){
        this.palette = new ArrayList<Color>();
        this.pixels = new Color[this.width][this.height];
    }

    public void setPixelColor(Color color, int x, int y){
        this.pixels[x][y] = color;
        if(this.palette.contains(color) == false){
            this.palette.add(color);
        }
    }

    private void setPixelsColor(Color color) {
    }
}
