class Hello {
    int a=10 ;

    void m1 (){
System.out.println(a);
a=101;
System.out.println(a);
    }
}



 class code2{

    public static void main(String[] args) {
        Hello h1=new Hello();

       h1.m1();
    }
}