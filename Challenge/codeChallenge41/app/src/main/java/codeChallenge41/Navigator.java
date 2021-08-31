package codeChallenge41;

import java.util.ArrayList;

public class Navigator {

    int locationIndex = -1;

    ArrayList<String> location;

    public Navigator() {
        location  = new ArrayList<>();
    }

    public String forward(){
        locationIndex++;
        String temp = "";
        if(location.isEmpty()){
            locationIndex--;
            return null;
        }else if(location.size() > locationIndex){
            temp =  location.get(locationIndex);
            return temp;
        }else{
            locationIndex--;
            return "null";
        }

    }

    public String back(){
        locationIndex--;
        String temp = "";
        if(location.isEmpty()){
            locationIndex++;
            return "null";
        }else if(locationIndex < location.size()){
            temp = location.get(locationIndex);
            return temp;
        }else {
            locationIndex++;
            return "null";
        }

    }

    public String go(String loc){
        if(!location.isEmpty() && locationIndex < location.size() -1) {
            while (locationIndex < location.size() - 1) {
                location.remove(location.size() -1 );
            }
            locationIndex++;
            location.add(loc);
            return location.get(locationIndex);
        }else{
            location.add(loc);
            locationIndex++;
            return location.get(locationIndex);
        }
    }

    ArrayList<String> getAllLocation(){
        return this.location;
    }
}
