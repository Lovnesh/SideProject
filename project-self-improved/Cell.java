public class Cell{
    
    private boolean state;
    
    /**
     * Constructor for class cell
     */
    public Cell(){
        state = false;
    }
    
    /**
     * Constructor for class cell.
     * @param state of the cell
     */
    public Cell(final boolean state){
        this.state = state;
    }
    
    /**
     * Returns the state of the cell.
     * @return boolean the state of the cell
     */
    public boolean getState(){
        return state;
    }
    
    /**
     * Sets the state of the cell after the cell has been initialised.
     * @param the state to be set
     */
    public void setState(final boolean state){
        this.state = state;
    }
}