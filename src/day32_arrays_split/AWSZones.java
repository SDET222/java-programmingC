package day32_arrays_split;

import java.util.Arrays;

public class AWSZones {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        String[] zonesToDeploy = zones.split(",");

        System.out.println("=====Starting deploying of etsy app to AWS zones...=====");

        System.out.println(Arrays.toString(zonesToDeploy));

        for (String each : zonesToDeploy) {
            System.out.println("Deploying " + app + " to " + each + "...");
            System.out.println("Deployment completed for "+each);
        }
        System.out.println("----All deployments complete, traffic enabled----");

    }
}
