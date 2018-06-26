package timetable;

import java.util.ArrayList;

public class Day{
	private ArrayList <Slot> slot = new ArrayList<>();
	

	/**
	 * @return the slot
	 */
	public ArrayList<Slot> getSlot() {
		return slot;
	}

	/**
	 * @param slot the slot to set
	 */
	public void setSlot(ArrayList<Slot> slot) {
		this.slot = slot;
	}

    public Day(String dayName){
		for(int i=7; i<19; i++){
			Slot ts=new Slot();
			this.slot.add(ts);
			
		}
	}
    
    
}