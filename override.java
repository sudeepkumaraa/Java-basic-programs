public class override{

    int a = 10;

    public static void main(String[] args){

        override over = new override();
        over.a =25;
        System.out.println(over.a);
    }
}

// if you donot want to change the value of a then declare the variable a with final keyword ie, final int a = 10;