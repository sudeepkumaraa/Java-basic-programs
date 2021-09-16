public class age {

    static void restrict(int ageoftheperson){

        if (ageoftheperson>18) {

            System.out.println("The person is alowed to go");
            
        } else {

            System.out.println("The person is not allowed to go");
            
        }


    }
    public static void main(String[] args){
        restrict(30);
    }
}
