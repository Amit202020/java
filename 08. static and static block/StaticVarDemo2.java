package pp;

class     StaticVarDemo2{
    int  a = 20;
    static int  b = 30;
    StaticVarDemo2(){
             a++;
             b++;
             System.out.println("a="+a+"b="+b);
    }
    public static void main(String args[]){
                   StaticVarDemo2  obj1=new StaticVarDemo2();  //  a=21   b=31
                   StaticVarDemo2  obj2=new StaticVarDemo2();  //  a=21   b=32
                   StaticVarDemo2  obj3=new StaticVarDemo2();  //  a=21   b=33
    }
}