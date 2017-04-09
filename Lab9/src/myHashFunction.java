
public class myHashFunction {	

	public String[] theArray;

	public void arrayFill (String[] wordsToAdd, String[] theArray){
		
		for(int i = 0; i < wordsToAdd.length; i++){
			
			String newElementValue = wordsToAdd[i];
			theArray[i] = newElementValue;
		
		}
		
	}
	
	public boolean findTheKey(String theKey){
		
		int arrayIndex = 0;
		
		while(theArray[arrayIndex] != "-1"){
			
			if(theArray[arrayIndex] == theKey){
				
				return true;
				
			}
			
			arrayIndex++;
			
			
		}
		
		return false;
		
	}
	
}
