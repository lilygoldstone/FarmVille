import java.util.ArrayList;

public class MyFarm {
    //declaration section of the code is always at the top
   ArrayList<Plot>row;
    public static void main(String[] args) { MyFarm ToddsFarm=new MyFarm();}
    public MyFarm() {
        System.out.println("hello");


        //construct new objects
        row = new ArrayList<>();
//fill my array list
        for (int i = 0; i < 10; i++) {
            row.add(new Plot());

        }
        //test our objects in the array by calling printPlotInfo
//        for (int x = 0; x < row.size(); x++) {
//            row.get(x).printPlotInfo();
//        }
        //HERE IS WHERE I RUN PRACTICE PROBLEM METHODS
//      addTulip();
//        tomatoLocations();
        //addLettuce();
        everyOtherNeedsWater();
        printRowInfo();
        plantWithMinNumber();
        plantWithMaxNumber();
       // totalCarrots();
       // totalPlants();
       // printPlantNames();
//        averageNumberOfPlants();
//        numberOfEmptyPlots();
//        numberOfCarrotPlots();
        greaterThan10();



//MyFarm() is the constructor method

    }

    //PRACTICE PROBLEMZZZZZZZZZZ
    public void totalPlants() {
        System.out.println("******TOTAL PLANTS*******");
        int total = 0;
        for (int t = 0; t < row.size(); t++) {
                total = total + row.get(t).numberOfPlants;
        }
        System.out.println("total plants: " + total);

        // how many total plants are there in the row?
    }
        public void printPlantNames(){
            System.out.println("******PLANT NAMES*******");
            for(int t=0; t<row.size();t++){
               System.out.print(t+": "+row.get(t).plantName + ", ");
            }
System.out.println();

            // print the name of each plant in the row and its index

        }
    public void totalCarrots() {
        System.out.println("******TOTAL CARROTS*******");
        int total = 0;
        for (int t = 0; t < row.size(); t++) {
            if(row.get(t).plantName.equals("carrot")) {
                total = total + row.get(t).numberOfPlants;
            }
        }
        System.out.println("total carrots: "+total);


            // how many total carrot plants are there?
    }

public void printRowInfo(){
        System.out.println("*****PRINT ROW INFO ********");
        for (int t = 0; t < row.size(); t++) {
            row.get(t).printPlotInfo();
        }

    }

    public void addLettuce(){
        System.out.println("*****ADD LETTUCE ********");
        printPlantNames();
        row.add(new Plot());
       row.get(10).plantName="lettuce";
        row.get(10).numberOfPlants=42;
        row.get(10).needsWater=true;
        printPlantNames();


        // add a lettuce plot to the end of the row with 42 plants that need water

        // call printPlantNames() method before and after your addition to make sure it worked

    }
    public void tomatoLocations() {
        System.out.println("*****TOMATO LOCATIONS ********");
        printPlantNames();
        for(int t=0; t<row.size();t++) {
            if (row.get(t).plantName.equals("tomato")) {
                System.out.print(t + ", ");
            }
        }
        System.out.println();
        // print indexes of all tomato plants

        // call printPlantNames() method to make sure you're getting the correct indexes

    }

    public void addTulip() {
        System.out.println("*****ADD TULIP ********");
        row.add(new Plot());
        row.get(3).plantName="tulip";
        row.get(3).numberOfPlants=70;
        row.get(3).needsWater=false;
        // at index 3, add a new tulip plot with 70 plants that do not need water

        // call printPlantNames() method before and after your addition to make sure it worked

    }
    public void averageNumberOfPlants() {
        System.out.println("*****AVERAGE NUMBER OF PLANTS ********");
        int total=0;
        int avg=0;
        for(int t=0; t<row.size(); t++){
            total=total+row.get(t).numberOfPlants;

        }
        avg=total/row.size();
        System.out.println("Average number of plants: "+avg);

        // what is the average number of plants across the whole row?

    }


    public void numberOfCarrotPlots() {
        System.out.println("*****TOTAL CARROT PLOTS ********");
        int total=0;
        for(int t=0; t<row.size(); t++){
            if(row.get(t).plantName.equals("carrot")){
                total=total+1;
            }
        }
        System.out.println("total carrot plot: " +total);
        // how many plots have carrots on them

// call printPlantNames() method to check

    }

    public void numberOfEmptyPlots() {
        System.out.println("*****TOTAL EMPTY PLOTS ********");
        int total=0;
        for(int t=0; t<row.size(); t++){
            if(row.get(t).plantName.equals("empty")){
                total=total+1;
            }
        }
        System.out.println("total Empty plot: " +total);

        // how many plots are empty

// call printPlantNames() method to check

    }

    public void everyOtherNeedsWater(){
        System.out.println("*****EVERY OTHER NEEDS WATER**********");
        for(int t=0; t<row.size(); t=t+2){
                row.get(t).needsWater=true;
            }

        }
        // change the value of needsWater to be true for every other plot





    public void plantWithMaxNumber() {
        System.out.println("*****MAX NUMBER********");
        int totalCarrots=0;
        int totalTomatoes=0;
        int totalTulips=0;
        int totalLettuce=0;

        //put a loop to add up individual plant totals
        for(int t=0; t<row.size(); t+=1) {
            if(row.get(t).plantName.equals("carrot")) {
                totalCarrots=totalCarrots+row.get(t).numberOfPlants;
            }
            if(row.get(t).plantName.equals("tomato")) {
                totalTomatoes=totalTomatoes+row.get(t).numberOfPlants;
            }
            if(row.get(t).plantName.equals("tulip")) {
                totalTulips=totalTulips+row.get(t).numberOfPlants;
            }
            if(row.get(t).plantName.equals("lettuce")) {
                totalLettuce=totalLettuce+row.get(t).numberOfPlants;
            }




        }
        int currentMax=0;
        String maxPlantType;

        if(totalCarrots>totalTomatoes){
            currentMax=totalCarrots;
            maxPlantType="carrot";

        }else{
            currentMax=totalTomatoes;
            maxPlantType="tomato";
        }

        //winner from last round vs. tulips
        if(totalTulips< currentMax){
            currentMax=totalTulips;
            maxPlantType="lettuce";
        }
        if(totalLettuce<currentMax) {
            currentMax = totalTulips;
            maxPlantType = "tulip";
        }

        //final step is to print our answers
        System.out.println("the plant type with the most total plants is: "+maxPlantType+ " with "+currentMax+" plants. ");
    }
        // which plant type has the most total plants?





    public void plantWithMinNumber() {
        System.out.println("*****MIN NUMBER********");
        int totalCarrots=0;
        int totalTomatoes=0;
        int totalTulips=0;
        int totalLettuce=0;

        //put a loop to add up individual plant totals
        for(int t=0; t<row.size(); t+=1) {
            if(row.get(t).plantName.equals("carrot")) {
                totalCarrots=totalCarrots+row.get(t).numberOfPlants;
            }
            if(row.get(t).plantName.equals("tomato")) {
                totalTomatoes=totalTomatoes+row.get(t).numberOfPlants;
            }
            if(row.get(t).plantName.equals("tulip")) {
                totalTulips=totalTulips+row.get(t).numberOfPlants;
            }
            if(row.get(t).plantName.equals("lettuce")) {
                totalLettuce=totalLettuce+row.get(t).numberOfPlants;
            }




        }
        int currentMin=0;
        String minPlantType;

        if(totalCarrots<totalTomatoes){
currentMin=totalCarrots;
minPlantType="carrot";

        }else{
            currentMin=totalTomatoes;
            minPlantType="tomato";
        }

        //winner from last round vs. tulips
        if(totalTulips<currentMin){
            currentMin=totalTulips;
            minPlantType="tulip";
        }
        if(totalLettuce<currentMin) {
            currentMin = totalTulips;
            minPlantType = "lettuce";
        }

        //final step is to print our answers
        System.out.println("the plant type with the fewest total plants is: "+minPlantType+ " with "+currentMin+" plants. ");
        }


        // which plant type has the least total plants (not counting empty plots)?
// step one we need to add up totals for each plant type

        //compare two values at a time from the totalCarrots, totalTomatos, etc
        //then save rhe smallest of the two to a variable current Min




    public void greaterThan10() {
        System.out.println("*****HOW MANY ARE GREATER THAN TEN**********");
        int total = 0;
        for (int t = 0; t < row.size(); t++) {
            if(row.get(t).numberOfPlants>10) {
                total = total + 1;
            }
            // how many plots have more than 10 plants in the plot?

        }
System.out.println("number of plots with more than ten plants: "+total);
    }

    public void plantWithMaxNumberNeedsWater(){

        // which plant type has the most total plants (not counting empty plots) that needs water?



    }


}

