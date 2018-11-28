package image;

import java.awt.*;

import static util.Matrices.*;

public class BruteRasterImage {


    private  Color color;
    private  int widht;
    private  int height;
    private  Color[][] colors;


    public BruteRasterImage(Color color, int width, int height){
        this.color = color;
        this.widht = width;
        this.height = height;
    }

    public BruteRasterImage(Color[][] colors){
        requiresNonNull(colors);
        requiresNonZeroDimensions(colors);
        requiresRectangularMatrix(colors);
        for (int x = 0; x < getRowCount(colors); x++) {
            this.colors[x] = colors[x];
            for (int y = 0; y < colors[x].length; y++) {
                this.colors[x][y] = colors[x][y];
            }
        }
    }
}
