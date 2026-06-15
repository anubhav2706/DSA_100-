public class main {
    public static void main(String[] args){

        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0,10);
        sda.insert(1,10);
        sda.insert(2,20);
        sda.insert(1,30);
        sda.insert(12,120);


//        var firstElement = sda.arr[120];
//        System.out.println("Array traversal");
//        sda.traverseArray();
//        sda.searchInArray(120);
//        sda.searchInArray(10);

        sda.deleteValue(0);
        System.out.println(sda.arr[0]);

    }
}
