class a {
    public int ab;
    private a (){
        

    }
}
class b extends a {
    public double add(int e, int f){
        double sum;
        sum = 0;
        sum = e + f;
        return sum;

    }

}
class c {
    private static void main(String[] args){
        b B = new b();
        B.add(3,4);


    }
}
