package adrian.roszkowski.revert.backend;

import java.awt.*;
import algs4.*;

public class ImageAlgorithms {


    private static Picture drawSquares(int n, int div, int border){
        Picture picture = new Picture(n, n);
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                if (col % div == 0 || row % div == 0){
                    Color color = new Color(col/2, row/2, (col + row)/4);
                    picture.set(col, row, color);
                }
            }
        }
        return picture;
    }

    private static Picture drawSquaresPercentageColor(int n, int div, int border){
        Picture picture = new Picture(n, n);
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                if (col % div == 0 || row % div == 0){
                    float colColor = col/(float)n;
                    float rowColor = row/(float)n;
                    Color color = new Color(colColor, rowColor, clamp(colColor+rowColor, 0.0f, 1.0f));
                    picture.set(col, row, color);
                }
            }
        }
        return picture;
    }




    private static Picture drawSquareDots(int n, int div, int border){
        Picture picture = new Picture(n, n);
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                if (col % div == 0 && row % div == 0){
                    Color color = new Color(clampAdd(col, 0, 255), clampAdd(row, 0, 255), clampAdd(col + row, 0, 255));
                    picture.set(col, row, color);
                }
            }
        }
        return picture;
    }

    private static Picture drawFilledSquares(int n, int div, int border){
        Picture picture = new Picture(n, n);
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                Color color = new Color(clamp(col, 0, 255), clamp(row, 0, 255), clamp(col + row, 0, 255));
                picture.set(col, row, color);
            }
        }
        return picture;
    }

    private static Picture drawFilledSquares(int n, int div, int border, int increase){
        Picture picture = new Picture(n, n);
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                Color color = new Color(clampAdd(col, 0, 255, increase), clampAdd(row, 0, 255, increase), clampAdd(col + row, 0, 255, increase));
                picture.set(col, row, color);
            }
        }
        return picture;
    }

    private static Picture drawFilledSquaresPercent(int n, int div, int border){
        Picture picture = new Picture(n, n);
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                float colColor = col/(float)n;
                float rowColor = row/(float)n;
                Color color = new Color(colColor, rowColor, clamp(colColor+rowColor, 0.0f, 1.0f));
                picture.set(col, row, color);
            }
        }
        return picture;
    }

    private static Picture drawFilledSquaresPercent(int n, int div, int border, float increase){
        Picture picture = new Picture(n, n);
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                float colColor = col/(float)n;
                float rowColor = row/(float)n;
                increase = increase/(float)n;
                Color color = new Color(colColor, rowColor, clampAdd(colColor+rowColor, 0.0f, 1.0f, increase));
                picture.set(col, row, color);
            }
        }
        return picture;
    }

    private static Picture drawSquares(int n, int div, int border, int increase){
        Picture picture = new Picture(n, n);
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                if (col % div == 0 || row % div == 0){
                    Color color = new Color(clampAdd(col, 0, 255, increase), clampAdd(row, 0, 255, increase), clampAdd(col + row, 0, 255, increase));
                    picture.set(col, row, color);
                }
            }
        }
        return picture;
    }

    private static Picture drawX(int n, int div, int border, int increase){
        Picture picture = new Picture(n, n);
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                if (col - row == 0 || col + row == 500){
                    Color color = new Color(clampAdd(col, 0, 255, increase), clampAdd(row, 0, 255, increase), clampAdd(col + row, 0, 255, increase));
                    picture.set(col, row, color);
                }
            }
        }
        return picture;
    }

    private static Picture drawCircles(int n, int div, int border, int size){
        Picture picture = new Picture(n, n);
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                if (col % div == 0 || row % div == 0){
                    Color color = new Color(clampAdd(col, 0, 255), clampAdd(row, 0, 255), clampAdd(col + row, 0, 255));
                    for (int north = 0; north < size; north++) {
                        picture.set(col + (size / 2), (row - (size/2)) + north, color);
                    }
                    for (int south = 0; south < size; south++) {
                        picture.set(col + (size / 2), (row - (size/2)) + south, color);
                    }
                    for (int west = 0; west < size; west++) {
                        picture.set((col - (size/2)) - west, (row - (size/2)), color);
                    }
                    for (int east = 0; east < size; east++) {
                        picture.set((col - (size/2)) + east, (row - (size/2)), color);
                    }
                    picture.set(col+(size/2), row+(size/2), color);
                    picture.set(col-(size/2), row+(size/2), color);
                    picture.set(col-(size/2), row-(size/2), color);
                    picture.set(col+(size/2), row-(size/2), color);

                    picture.set(col, row, color);
                }
            }
        }
        return picture;
    }

    private static Picture drawCirclesClamped(int n, int div, int border, int size){
        Picture picture = new Picture(n, n);
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col < border || row < border ) continue;
                if (col > n-border || row > n-border ) continue;
                if (col % div == 0 || row % div == 0){
                    Color color = new Color(clampAdd(col, 0, 255), clampAdd(row, 0, 255), clampAdd(col + row, 0, 255));
                    for (int north = 0; north < size; north++) {
                        picture.set(clamp(col + (size / 2), 0, n), (row - (size/2)) + north, color);
                    }
                    for (int south = 0; south < size; south++) {
                        picture.set(clamp(col + (size / 2), 0, n), (row - (size/2)) + south, color);
                    }
                    for (int west = 0; west < size; west++) {
                        picture.set((col - (size/2)) - west, (row - (size/2)), color);
                    }
                    for (int east = 0; east < size; east++) {
                        picture.set((col - (size/2)) + east, (row - (size/2)), color);
                    }

                    //picture.set(col, row, color);
                }
            }
        }
        return picture;
    }

    private static Picture drawRandom(int n, int rPixels){
        Picture picture = new Picture(n, n);
        for (int i = 0; i < rPixels; i++) {
            Color color = Color.black;
            picture.set(StdRandom.uniformInt(n), StdRandom.uniformInt(n), color);
        }
        return picture;
    }

    public static float clamp(float val, float min, float max) {
        return Math.max(min, Math.min(max, val));
    }

    public static int clamp(int val, int min, int max) {
        return Math.max(min, Math.min(max, val));
    }

    public static int clampAdd(int val, int min, int max) {
        while (val > max){
            val -= max;
        }
        return Math.max(min, Math.min(max, val));
    }

    public static int clampAdd(int val, int min, int max, int n) {
        val += n;
        while (val > max){
            val -= max;
        }
        return Math.max(min, Math.min(max, val));
    }

    public static float clampAdd(float val, float min, float max, float n) {
        val += n;
        /*
        while (val > max){
            val -= max;
        }

         */
        return Math.max(min, Math.min(max, val));
    }

    public static float rootOf(float a, float b){
        return a/(a*(b-1));
    }
}
