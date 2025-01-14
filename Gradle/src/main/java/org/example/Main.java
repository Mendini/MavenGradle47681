package org.example;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Hello and welcome!\n");
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("i = " + i);
        }
        double[] values = new double[] {65, 51 , 16, 11 , 6519, 191 ,0 , 98, 19854, 1, 32};
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
        for (double v : values)
        {
            descriptiveStatistics.addValue(v);
        }
        double mean = descriptiveStatistics.getMean();
        double median = descriptiveStatistics.getPercentile(50);
        double standardDeviation = descriptiveStatistics.getStandardDeviation();
    }
}