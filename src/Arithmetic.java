public class Arithmetic<A extends Number, B extends Number>{
    private A numA;
    private B numB;
    public Arithmetic(A numA, B numB){
        this.numA = numA;
        this.numB = numB;
    }

    public Number add(){
        return (Double.parseDouble(""+numA) + Double.parseDouble(""+numB));
    }
    public Number subtract(){
        return (Double.parseDouble(""+numA) - Double.parseDouble(""+numB));
    }
    public Number multiply(){
        return (Double.parseDouble(""+numA) * Double.parseDouble(""+numB));
    }
    public Number divide(){
        return (Double.parseDouble(""+numA) / Double.parseDouble(""+numB));
    }
    public Number getMin(){
        if(Double.parseDouble(""+numA) > Double.parseDouble(""+numB))
            return numB;
        return numA;
    }
    public Number getMax(){
        if(Double.parseDouble(""+numA) < Double.parseDouble(""+numB))
            return numB;
        return numA;
    }
    public void print(){
    System.out.println("Numbers: "+numA+ " ("+numA.getClass().getSimpleName()+") , " +numB+" ("+numB.getClass().getSimpleName()+") ");
    }
}
