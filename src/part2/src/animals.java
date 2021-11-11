package part2.src;

public class animals {

    String Namabinatang;
    String Jenismakanan;
    String Gigibinatang ;





    public static void main(String[] args) {



        omnivora omni = new omnivora();
        herbivora hebi = new herbivora();
        karnivora karni = new karnivora();

        System.out.println("Hi iam parents  of all animal, my name is binatang ");
        hebi.identify_myself();
        karni.identify_myself();

        omni.identify_myself();









    }


}
