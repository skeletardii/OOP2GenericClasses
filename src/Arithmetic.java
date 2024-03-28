import java.math.BigDecimal;
import java.math.RoundingMode;

public class Arithmetic<A extends Number, B extends Number>{
    private final A numA;
    private final B numB;
    public Arithmetic(A numA, B numB){
        this.numA = numA;
        this.numB = numB;
    }

    public Number add(){
        //return (Double.parseDouble(""+numA) + Double.parseDouble(""+numB));
        BigDecimal bd = new BigDecimal(numA+"");
        return bd.add(new BigDecimal(numB+""));
    }
    public Number subtract(){
        //return (Double.parseDouble(""+numA) - Double.parseDouble(""+numB));
        BigDecimal bd = new BigDecimal(numA+"");
        return bd.subtract(new BigDecimal(numB+""));
    }
    public Number multiply(){
        //return (Double.parseDouble(""+numA) * Double.parseDouble(""+numB));
        BigDecimal bd = new BigDecimal(numA+"");
        return bd.multiply(new BigDecimal(numB+""));
    }
    public Number divide(){
        //return (Double.parseDouble(""+numA) / Double.parseDouble(""+numB));
        BigDecimal bd = new BigDecimal(numA+"");
        return bd.divide(new BigDecimal(numB+""),2 , RoundingMode.HALF_UP);
    }
    public Number getMin(){
//        if(Double.parseDouble(""+numA) > Double.parseDouble(""+numB))
//            return numB;
//        return numA;
        BigDecimal bdA = new BigDecimal(numA+"");
        BigDecimal bdB = new BigDecimal(numB+"");
        if (bdA.compareTo(bdB) > 0)
            return numB;
        return numA;
    }
    public Number getMax(){
//        if(Double.parseDouble(""+numA) < Double.parseDouble(""+numB))
//            return numB;
//        return numA;
        BigDecimal bdA = new BigDecimal(numA+"");
        BigDecimal bdB = new BigDecimal(numB+"");
        if (bdA.compareTo(bdB) < 0)
            return numB;
        return numA;
    }
    public void print(){
    System.out.println("Numbers: "+numA+ " ("+numA.getClass().getSimpleName()+") , " +numB+" ("+numB.getClass().getSimpleName()+") ");
    }
}
