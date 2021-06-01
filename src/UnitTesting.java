import java.util.ArrayList;
import java.util.List;
public class UnitTesting {

    public UnitTesting(){};

    //Size of List
    public void getSizeOfList() {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        if(list.size() == 4){
            System.out.println("successful");
        }
        else{
            System.out.println("failed");
        }
    }
    //Size is zero
    public void verifyListEmpty(){
        List<Integer> list = new ArrayList<>();

        if(list.isEmpty()){
            System.out.println("successful");
        }
        else{
            System.out.println("failed");
        }
    }

    //Clear all at once
    public void clearList(){
        List<Integer> list = new ArrayList<>();

        list.add(1);

        list.clear();
        //WTF? works with == 0 and doesn't work with != 0
        if(list.size() == 0){
            System.out.println("successful");
        }
        else{
            System.out.println("failed");
        }
    }

    //Clear one by one
    public void clearBySequence(){
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        for(int i=0; i<list.size();i++){
            list.remove(i);
        }

        if(list.size() != 0){
            System.out.println("successful");
        }
        else{
            System.out.println("failed");
        }
    }

    //Add in sequence
    public void addToList(){

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(11);
        list.add(12);

        if(list.contains(10)){
            System.out.println("successful");
        }
        else{
            System.out.println("failed");
        }
    }

    //Add at the beginning
    public void addAtStart(){
        List<Integer> list = new ArrayList<>();
        //test/previous data
        list.add(20);
        list.add(21);
        list.add(22);

        //adding at index 1
        list.add(1,10);
        if(list.get(1) == 10){
            System.out.println("successful");
        }
        else{
            System.out.println("failed");
        }
    }

    //Add at Index
    public void addAtIndex(){
        List<Integer> list = new ArrayList<>();
        //test/previous data
        list.add(20);
        list.add(21);
        list.add(22);
        list.add(23);


        list.add(3, 10);
        //overwrittes stored value of 22

        if(list.get(3) == 10){
            System.out.println("successful");
        }
        else{
            System.out.println("failed");
        }

    }

    //Exists SOMEWHERE
    public void existsInsideList(){
        List<Integer> list = new ArrayList<>();
        //test/previous data
        list.add(20);
        list.add(21);
        list.add(22);
        list.add(23);

        //lookup value, only says if it has it or not, true/false
        if(list.contains(22)){
            System.out.println("successful");
        }
        else{
            System.out.println("failed");
        }
    }

    //Exists in a SPECIFIC place
    public void existsInIndex(){
        List<Integer> list = new ArrayList<>();
        //test/previous data
        list.add(20);
        list.add(21);
        list.add(22);
        list.add(23);

        //checks for 22 value in the second index
        if(list.get(2) == 22){
            System.out.println("successful");
        }
        else{
            System.out.println("failed");
        }
    }

    //Get stored value by Index
    public void getElementFromIndex(){
        List<Integer> list = new ArrayList<>();
        //test/previous data
        list.add(20);
        list.add(21);
        list.add(22);
        list.add(23);

        //need to verify index is not out of range
        int lookup = 5;
        if(lookup <= list.size()){
            System.out.print(list.get(lookup));
            System.out.println(" successful");
        }
        else{
            System.out.println("failed");
        }
        //this one was setup to fail as list size is 4 and index 5 doesn't exist yet

    }

    //show where a value is stored
    public void getElementLocation() {
        List<Integer> list = new ArrayList<>();
        //test/previous data
        list.add(20);
        list.add(21);
        list.add(22);
        list.add(23);
        list.add(21);

        //first we need to verify the item is indeed within the list
        if (list.contains(21)) {
            System.out.print(list.indexOf(21));
            //this shows only the first index with that stored value...
            System.out.println(" successful");
        } else {
            System.out.println("failed");
        }
    }


    //Remove an element in a specific index
    public void removeObjectIndex(){
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(21);
        list.add(22);
        list.add(23);

        //since removing it will overwritte it with the next stored value, we will do a before/after size comparison
        int tmp = list.size();
        list.remove(2);

        if(list.size() != tmp){
            System.out.println(" successful");
        }
        else{
            System.out.println("failed");
        }

    }

    //Remove an object at the end
    public void removeObjectEnd(){
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(21);
        list.add(22);
        list.add(23);

        //since removing it will overwritte it with the next stored value, we will do a before/after size comparison
        int tmp = list.size();
        //uses the size value to always remove the last one
        list.remove(list.size()-1);

        if(list.size() != tmp){
            System.out.println(" successful");
        }
        else{
            System.out.println("failed");
        }

    }
}
