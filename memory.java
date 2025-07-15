 class memory
 {
    public static void main(String[] args){
        Runtime r = Runtime.getRuntime();
        System.out.println("Total Memory is:" +r.totalMemory());
        System.out.println("Initial Memory is:" +r.freeMemory());
        r.gc();
        System.out.println("Free Memory after garbage collection:"+r.freeMemory());
    }
}