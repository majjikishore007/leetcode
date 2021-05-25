import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class RandomizedSet {
	Set<Integer>randomizedSet;
    /** Initialize your data structure here. */
    public RandomizedSet() {
    	randomizedSet=new HashSet<>();
    	
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
    	if(randomizedSet.contains(val)) {
    		return false;
    	}
    	else randomizedSet.add(val);
    	return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
    	if(randomizedSet.contains(val)) {
    		randomizedSet.remove(val);
    		return true;
    	}
    	return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
    	 Random rand = new Random(); 
        int index=rand.nextInt(randomizedSet.size());
        Integer randomElement=null;int currentIndex=0;
        for(int element : randomizedSet){
            
        	randomElement = element;
            
            if(currentIndex == index)
                return randomElement;
            
            currentIndex++;
        }
        return randomElement;
    }
}