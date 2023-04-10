package adrian.roszkowski.revert.backend;

public class MathFunctions {
    public static float clamp(float val, float min, float max) {
        return Math.max(min, Math.min(max, val));
    }

    public static float clamp(float val, float max) { return Math.abs(val) % max; }

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
