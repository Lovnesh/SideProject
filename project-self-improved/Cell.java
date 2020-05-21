public class Cell{
    private boolean state;
    
    public Cell(){
        state = false;
    }
    
    public Cell(boolean state){
        this.state = state;
    }
    
    public boolean getState(){
        return state;
    }
    
    public void setState(boolean state){
        this.state = state;
    }
}