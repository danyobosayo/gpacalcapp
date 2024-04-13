package com.example.gpacalcapp;

class Calculations {

    // Calculate average GPA needed
    public double calculateAverageGPANeeded(double currentCumulativeGPA, double desiredGPA, int hoursTaken, int hoursRemaining) {
        double hoursGPA = currentCumulativeGPA * hoursTaken;
        int totalHours = hoursTaken + hoursRemaining;
        double desiredHoursGPA = desiredGPA * totalHours;
        double differenceHoursGPA = desiredHoursGPA - hoursGPA;
        return differenceHoursGPA / hoursRemaining;
    }

    public double calculateMaxGPAObtainable(double currentCumulativeGPA, int hoursTaken, int hoursRemaining) {
        double hoursGPA = currentCumulativeGPA * hoursTaken;
        double maxDifferenceHoursGPA = 4.0 * hoursRemaining;
        int totalHours = hoursTaken + hoursRemaining;
        return (hoursGPA + maxDifferenceHoursGPA) / totalHours;
    }

    public boolean desiredGPAAchievable(double averageGPANeeded, double maxGPAObtainable) {
        return averageGPANeeded <= maxGPAObtainable;
    }

    public String[] recommendationUpperBoundAndRange(double averageGPANeeded) {
        String[] returnArray = new String[2];

        if(averageGPANeeded <= 2.0) {
            returnArray[0] = "C";
            if(averageGPANeeded < 1.670) {
                returnArray[1] = "low";
            } else {
                returnArray[1] = "high";
            }
        } else if(averageGPANeeded <= 2.330) {
            returnArray[0] = "C+";
            if(averageGPANeeded < 2.165) {
                returnArray[1] = "low";
            } else {
                returnArray[1] = "high";
            }
        } else if(averageGPANeeded <= 2.670) {
            returnArray[0] = "B-";
            if(averageGPANeeded < 2.5) {
                returnArray[1] = "low";
            } else {
                returnArray[1] = "high";
            }
        } else if(averageGPANeeded <= 3.0) {
            returnArray[0] = "B";
            if(averageGPANeeded < 2.835) {
                returnArray[1] = "low";
            } else {
                returnArray[1] = "high";
            }
        } else if(averageGPANeeded <= 3.330) {
            returnArray[0] = "B+";
            if(averageGPANeeded < 3.165) {
                returnArray[1] = "low";
            } else {
                returnArray[1] = "high";
            }
        } else if(averageGPANeeded <= 3.670) {
            returnArray[0] = "A-";
            if(averageGPANeeded < 3.5) {
                returnArray[1] = "low";
            } else {
                returnArray[1] = "high";
            }
        } else {
            returnArray[0] = "A";
            if(averageGPANeeded < 3.835) {
                returnArray[1] = "low";
            } else {
                returnArray[1] = "high";
            }
        }

        return returnArray;
    }

}