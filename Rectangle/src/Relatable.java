public interface Relatable {
        
    // this (object calling isLargerThan)
    // and other must be instances of 
    // the same class returns 1, 0, -1 
    // if this is greater // than, equal 
    // to, or less than other
    public boolean isLargerThan(Relatable other);
    public boolean isLessThan(Relatable other);
}

