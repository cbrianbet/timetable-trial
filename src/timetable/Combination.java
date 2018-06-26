package timetable;

import java.util.ArrayList;

public class Combination{
    int size;
    ArrayList<Unit> unitCombination= new ArrayList<>();

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @return the unitCombination
     */
    public ArrayList<Unit> getUnitCombination() {
        return unitCombination;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @param unitCombination the unitCombination to set
     */
    public void setUnitCombination(ArrayList<Unit> unitCombination) {
        this.unitCombination = unitCombination;
    }

    
}