package Chapter6.ex2;

public class MetricTest {
    public static void main(String[] args) {
        MetricConventer metricConventer = new MetricConventer();
        double meters = 10.5;
        double centimeters = 1001;
        System.out.println(meters + " it's " + metricConventer.metersToCm(meters) + " centimeters");
        System.out.println(centimeters + " it's " + metricConventer.metersToMm(centimeters) + " milimeters");


    }
}
