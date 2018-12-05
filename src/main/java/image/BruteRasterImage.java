package image;

import java.awt.*;



import static util.Matrices.*;

public class BruteRasterImage implements Image{


    private  Color color;
    private  int width;
    private  int height;
    private  Color[][] colors;


    public BruteRasterImage(Color color, int width, int height){
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public BruteRasterImage(Color[][] colors){
        requiresNonNull(colors);
        requiresNonZeroDimensions(colors);
        requiresRectangularMatrix(colors);
        for (int x = 0; x < getRowCount(colors); x++) {
            for (int y = 0; y < colors[x].length; y++) {
                this.colors[x][y] = colors[x][y];
            }
        }
    }

    public void createRepresentation() {
        BruteRasterImage Representation = new BruteRasterImage(colors) ;
    }

    public void setPixelColor(Color color, int x, int y){
        colors[x][y] = color;
    }

    public Color getPixelColor(int x, int y){
        return colors[x][y];
    }

    private void setPixelsColor(Color[][] pixels){
        requiresNonNull(pixels);
        requiresNonZeroDimensions(pixels);
        requiresRectangularMatrix(pixels);
        for (int x = 0; x < getRowCount(pixels); x++) {
            for (int y = 0; y < pixels[x].length; y++) {
                this.colors[x][y] = pixels[x][y];
            }
        }
    }

    private void setPixelsColor(Color color){
        for (int x = 0; x < getRowCount(colors); x++) {
            for (int y = 0; y < colors[x].length; y++) {
                this.colors[x][y] = color;
            }
        }
    }

    public int getWidth() { return this.width; }

    public int getHeight() { return this.height; }

    protected void setWidth(int width) { this.width = width; }

    protected void setHeight(int height) { this.height = height; }

}
