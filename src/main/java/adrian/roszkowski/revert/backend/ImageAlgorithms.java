package adrian.roszkowski.revert.backend;

import javafx.scene.image.*;
import javafx.scene.paint.Color;

import java.util.Random;

import static adrian.roszkowski.revert.backend.MathFunctions.*;


public class ImageAlgorithms {


    private static WritableImage drawSquares(int n, int div, int border){
        WritableImage picture = new WritableImage(n, n);
        PixelWriter writer = picture.getPixelWriter();
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                if (col % div == 0 || row % div == 0){
                    //Color color = new Color(col/2, row/2, (col + row)/4);
                    Color color = new Color(col/2, row/2, (col + row)/4, 1);
                    writer.setColor(col, row, color);
                }
            }
        }
        return picture;
    }

    private static WritableImage drawSquaresPercentageColor(int n, int div, int border){
        WritableImage picture = new WritableImage(n, n);
        PixelWriter writer = picture.getPixelWriter();
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                if (col % div == 0 || row % div == 0){
                    float colColor = col/(float)n;
                    float rowColor = row/(float)n;
                    Color color = new Color(colColor, rowColor, clamp(colColor+rowColor, 0.0f, 1.0f), 1);
                    writer.setColor(col, row, color);
                }
            }
        }
        return picture;
    }




    private static WritableImage drawSquareDots(int n, int div, int border){
        WritableImage picture = new WritableImage(n, n);
        PixelWriter writer = picture.getPixelWriter();
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                if (col % div == 0 && row % div == 0){
                    Color color = new Color(clampAdd(col, 0, 255), clampAdd(row, 0, 255), clampAdd(col + row, 0, 255), 1);
                    writer.setColor(col, row, color);
                }
            }
        }
        return picture;
    }

    private static WritableImage drawFilledSquares(int n, int div, int border){
        WritableImage picture = new WritableImage(n, n);
        PixelWriter writer = picture.getPixelWriter();
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                Color color = new Color(clamp(col, 0, 255), clamp(row, 0, 255), clamp(col + row, 0, 255), 1);
                writer.setColor(col, row, color);
            }
        }
        return picture;
    }

    private static WritableImage drawFilledSquares(int n, int div, int border, int increase){
        WritableImage picture = new WritableImage(n, n);
        PixelWriter writer = picture.getPixelWriter();
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                Color color = new Color(clampAdd(col, 0, 255, increase), clampAdd(row, 0, 255, increase), clampAdd(col + row, 0, 255, increase), 1);
                writer.setColor(col, row, color);
            }
        }
        return picture;
    }

    private static WritableImage drawFilledSquaresPercent(int n, int div, int border){
        WritableImage picture = new WritableImage(n, n);
        PixelWriter writer = picture.getPixelWriter();
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                float colColor = col/(float)n;
                float rowColor = row/(float)n;
                Color color = new Color(colColor, rowColor, clamp(colColor+rowColor, 0.0f, 1.0f), 1);
                writer.setColor(col, row, color);
            }
        }
        return picture;
    }

    private static WritableImage drawFilledSquaresPercent(int n, int div, int border, float increase){
        WritableImage picture = new WritableImage(n, n);
        PixelWriter writer = picture.getPixelWriter();
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                float colColor = col/(float)n;
                float rowColor = row/(float)n;
                increase = increase/(float)n;
                Color color = new Color(colColor, rowColor, clampAdd(colColor+rowColor, 0.0f, 1.0f, increase), 1);
                writer.setColor(col, row, color);
            }
        }
        return picture;
    }

    private static WritableImage drawSquares(int n, int div, int border, int increase){
        WritableImage picture = new WritableImage(n, n);
        PixelWriter writer = picture.getPixelWriter();
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                if (col % div == 0 || row % div == 0){
                    Color color = new Color(clampAdd(col, 0, 255, increase), clampAdd(row, 0, 255, increase), clampAdd(col + row, 0, 255, increase), 1);
                    writer.setColor(col, row, color);
                }
            }
        }
        return picture;
    }

    private static WritableImage drawX(int n, int div, int border, int increase){
        WritableImage picture = new WritableImage(n, n);
        PixelWriter writer = picture.getPixelWriter();
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                if (col - row == 0 || col + row == 500){
                    Color color = new Color(clampAdd(col, 0, 255, increase), clampAdd(row, 0, 255, increase), clampAdd(col + row, 0, 255, increase), 1);
                    writer.setColor(col, row, color);
                }
            }
        }
        return picture;
    }

    private static WritableImage drawCircles(int n, int div, int border, int size){
        WritableImage picture = new WritableImage(n, n);
        PixelWriter writer = picture.getPixelWriter();
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                if (col % div == 0 || row % div == 0){
                    Color color = new Color(clampAdd(col, 0, 255), clampAdd(row, 0, 255), clampAdd(col + row, 0, 255), 1);
                    for (int north = 0; north < size; north++) {
                        writer.setColor(col + (size / 2), (row - (size/2)) + north, color);
                    }
                    for (int south = 0; south < size; south++) {
                        writer.setColor(col + (size / 2), (row - (size/2)) + south, color);
                    }
                    for (int west = 0; west < size; west++) {
                        writer.setColor((col - (size/2)) - west, (row - (size/2)), color);
                    }
                    for (int east = 0; east < size; east++) {
                        writer.setColor((col - (size/2)) + east, (row - (size/2)), color);
                    }
                    writer.setColor(col+(size/2), row+(size/2), color);
                    writer.setColor(col-(size/2), row+(size/2), color);
                    writer.setColor(col-(size/2), row-(size/2), color);
                    writer.setColor(col+(size/2), row-(size/2), color);

                    writer.setColor(col, row, color);
                }
            }
        }
        return picture;
    }

    private static WritableImage drawCirclesClamped(int n, int div, int border, int size){
        WritableImage picture = new WritableImage(n, n);
        PixelWriter writer = picture.getPixelWriter();
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                if (col % div == 0 || row % div == 0){
                    Color color = new Color(clampAdd(col, 0, 255), clampAdd(row, 0, 255), clampAdd(col + row, 0, 255), 1);
                    for (int north = 0; north < size; north++) {
                        writer.setColor(clamp(col + (size / 2), 0, n), (row - (size/2)) + north, color);
                    }
                    for (int south = 0; south < size; south++) {
                        writer.setColor(clamp(col + (size / 2), 0, n), (row - (size/2)) + south, color);
                    }
                    for (int west = 0; west < size; west++) {
                        writer.setColor((col - (size/2)) - west, (row - (size/2)), color);
                    }
                    for (int east = 0; east < size; east++) {
                        writer.setColor((col - (size/2)) + east, (row - (size/2)), color);
                    }

                    //picture.set(col, row, color);
                }
            }
        }
        return picture;
    }

    private static WritableImage drawRandom(int n, int rPixels){
        WritableImage picture = new WritableImage(n, n);
        PixelWriter writer = picture.getPixelWriter();
        Random random = new Random();
        for (int i = 0; i < rPixels; i++) {
            Color color = Color.BLACK;
            writer.setColor(random.nextInt(n), random.nextInt(n), color);
        }
        return picture;
    }


}
