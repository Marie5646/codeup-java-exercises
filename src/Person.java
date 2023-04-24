public class Person {
    private String name;

    public String sayHello() {
        return String.format("Hello %s",name);
    }


    public Person(){}
    public Person(String name) {
        this.name = name;
    }



    public String getName(String name) {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

   public static void main(String[] args) {

        Person me= new Person("Asia");

       System.out.println(me.sayHello());


       System.out.println(me.getName(me.name));


       me.setName("marie");

       System.out.println(me.getName(me.name));


   }

}



