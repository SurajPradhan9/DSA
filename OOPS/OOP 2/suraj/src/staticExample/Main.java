package staticExample;

public class Main {
    public static void main(String[] args) {
        Human suraj=new Human(20,"suraj",2000000,true);
        Human vaishu=new Human(21,"Vaishnavi",4000000,true);

        System.out.println(suraj.name);
        System.out.println(vaishu.salary);

        System.out.println(Human.population);//sout(suraj.population");
        System.out.println(Human.population);//sout(vaishu.population");

        Main.fun(); // or fun();

        Main objj=new Main();
        objj.fun2();

    }

    // this is not dependent on objects
    static void fun(){
//        greeting(); // so without specifying which instance greeting() belongs to we cannot use greeting() over here(we cannot use it because it requires an instance ,but the function we are using it in does not depend on objects/instances - in simple terms fun does not depend on instances then how can we have something in that , that depends on instances - we can't)
                      // but what if we put like this Main.greeting (in this case also we cant access it but there is a way to access it simply create an object and access it)

        // you cannot access non-static stuff without referencing their instances in a static context
        // hence here I am referencing it
        Main obj=new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();
    }


    //we know something is not static, belongs to an object
    void greeting(){
//        fun();
        System.out.println("Hello WOrld");
    }

}
