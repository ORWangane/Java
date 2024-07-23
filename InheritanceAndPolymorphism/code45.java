class Code45 extends Object{
    int x=10;
    void fun(){
     System.out.println("In Fun");
    }

    public static void main(String []args){
        Code45 obj=new Code45();
        obj.fun();
        System.out.println(obj.x);

    }
}