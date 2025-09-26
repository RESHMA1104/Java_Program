public class ArrayChanging {
    public static void main(String[] args) {
        int[] Student = {10, 30, 20, 40, 50};
        changeArray(Student);
        for(int i : Student){
            System.out.print(i + " ");
        }
    }
    public static void changeArray(int[] Student){
        Student[4] = 70;
    }
}