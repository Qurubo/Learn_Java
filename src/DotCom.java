import java.util.ArrayList;

/**
 * Created by qurub on 11.04.2016.
 */
public class DotCom {
    private ArrayList<String> locationCells;
    int numOfHits=0;
    void setLocationCells(ArrayList<String> locs){

        locationCells =locs;
    }
    public String checkYourself(String userInput){

        String result = "Мимо";
        int index=locationCells.indexOf(userInput);
        if(index>=0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result="Потопил";
            }else result="Попал";
        }




        //System.out.println(result);
        return result;
    }
}
