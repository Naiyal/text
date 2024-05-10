public class Math {
    int val;
    public Math() {}
    public Math(int val){
        this.val = val;
    }

    Math add(Math obj1){
        Math obj3 = new Math();
        obj3.val = this.val + obj1.val;
        return obj3                             ;
    }

    boolean inEquals(Math obj1){
        return val == obj1.val;
    }

}