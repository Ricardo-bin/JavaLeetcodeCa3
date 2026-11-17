class Solution {
    public double[] convertTemperature(double c) {
        
        double k = c + 273.15;
        double f = c * 1.8 + 32.00;

        return new double[]{k,f};
    }
}
