class DS {
    int x;
    int y;
    DS(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println("----------");
        System.out.println(x);
        System.out.println(y);
    }
    DS(){
    }
}
public class DSA{
    public static void main(String[] args) {
        int c=100;
        DS obj=new DS(12,20);
        DS obj1=new DS(30,40);
        DS obj2=new DS(32,50);
        DS obj3=new DS(52,70);
        DS res = new DS();
        res.x=obj.x+obj1.x+obj2.x+obj3.x;
        res.y=obj.y+obj1.y+obj2.y+obj3.y;
        System.out.println("========");
        System.out.println("sum x = "+res.x);
        System.out.println("sum y = "+res.y);
        System.out.println("========");
    }
}
