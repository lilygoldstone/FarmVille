public class Plot {

    public String plantName;
    public int numberOfPlants;
    public boolean needsWater;



    public Plot() {
        //use randomization to assign variables

        //task: create a random statment assigning plantName a random number between 10 and 100
        numberOfPlants = (int) (Math.random() * 90 + 10);


//task: to randomly assign plant names use random ints between 0 and 4
        int plantID = (int) (Math.random() * 5);

        if (plantID == 0) {
            plantName = "empty";
            numberOfPlants=0;
        } else if (plantID == 1) {
            plantName = "tomato";
        } else if (plantID == 2) {
            plantName = "carrot";
        } else if (plantID == 3) {
            plantName = "tulip";
        } else {
            plantName = "lettuce";
        }

//task: randomly assign true or false to needsWater
        //this says if the water ID is equal to zero and the plant name is not "empty" than needs water=true
        int waterID = (int)(Math.random()*2);
        if (waterID == 0 && !plantName.equals("empty")) {
            needsWater = true;
        } else {
            needsWater = false;
        }}

        public void printPlotInfo() {

            System.out.println("*****PLOT INFO*****");
            //print out three statments that are nice to read and list the variable values
            System.out.println("plantName: " + plantName);
            System.out.println("number Of Plants: " + numberOfPlants);
            System.out.println("needs Water: " + needsWater);



        }
}
