package image;

import javafx.scene.paint.Color;
import static util.Matrices.*;

public class BruteRasterImage implements Image{

    private  int width;
    private  int height;
    private  Color[][] pixels;


    public BruteRasterImage(Color color, int width, int height){

        pixels = new Color[width][height];
        this.width = width;
        this.height = height;
        setPixelsColor(color);

    }

    public BruteRasterImage(Color[][] colors){
        requiresNonNull(colors);
        requiresNonZeroDimensions(colors);
        requiresRectangularMatrix(colors);
        pixels = new Color[this.width][this.height];
        for(int x = 0; x < this.width; x++){
            for(int y = 0; y < this.height; y++){
                pixels[x][y] = colors[x][y];
            }
        }
    }


    public void createRepresentation() {
        this.pixels = new Color[this.width][this.height];
    }

    public void setPixelColor(Color color, int x, int y){ this.pixels[x][y] = color; }

    public Color getPixelColor(int x, int y) { return this.pixels[x][y]; }


        private void setPixelsColor(Color[][] pixels){
        requiresNonNull(pixels);
        requiresNonZeroDimensions(pixels);
        requiresRectangularMatrix(pixels);
        for(int x = 0 ; x<this.width ; x++ ){
            for(int y = 0 ; y<this.height ; y++){
                this.pixels[x][y] = pixels[x][y];

            }
        }
    }

    private void setPixelsColor(Color color){
        for(int x = 0 ; x<this.width ; x++ ){
            for(int y = 0 ; y<this.height ; y++){
                pixels[x][y] = color;
            }
        }
    }

    public int getWidth() { return this.width; }

    public int getHeight() { return this.height; }

    protected void setWidth(int width) { this.width = width; }

    protected void setHeight(int height) { this.height = height; }

}
