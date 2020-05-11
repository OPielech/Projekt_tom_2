package edu.ib.projekt_tom_2;


public class Measurement {

    private double[] peaks = getPeaks(getData());
    private double minPeak = peaks[0];
    private double maxPeak = peaks[1];

    public double getMinPeak() {
        return minPeak;
    }

    public double getMaxPeak() {
        return maxPeak;
    }

    public Measurement() {
    }

    private double[] getData() {
        //this method connects with device
        DeviceConnection.getConnection();

        //this method gets data from device
        return DeviceConnection.getData();
    }

    private double[] getPeaks(double[] data) {
        //this methods takes max and min peaks from data

        double minPeak = data[0];
        double maxPeak = data[0];

        for (double value : data) {
            if (value > maxPeak)
                maxPeak = value;
            else if (value < minPeak)
                minPeak = value;
        }

        return new double[]{minPeak, maxPeak};
    }

    public String compare() {
        //this method compares gotten data with norms

        if (maxPeak > Norms.getMAX_PEAK() && minPeak > Norms.getMIN_PEAK())
            return "message1";
        else if (maxPeak > Norms.getMAX_PEAK() && minPeak < Norms.getMIN_PEAK())
            return "message2";
        else if (maxPeak< Norms.getMAX_PEAK() && minPeak > Norms.getMIN_PEAK())
            return "message3";
        else
            return "message4";
    }
}
