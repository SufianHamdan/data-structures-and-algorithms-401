package stack.Queue;

public class AnimalShelter<T> {

    private Queue<T> shelter;

    public AnimalShelter(){
        this.shelter =  new Queue<>();
    }

    public void enqueue(T value){
        shelter.enqueue(value);
    }

    public String dequeue(String pref) throws Exception {
        Queue<T> s = this.shelter;
        while (!s.isEmpty()){
            if(s.peek().toString() == pref){
                return s.peek().toString();
            }
        }
        return null;
    }

    public String toString(){

    }
}
