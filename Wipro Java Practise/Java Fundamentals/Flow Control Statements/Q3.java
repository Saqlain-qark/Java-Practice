class Q3 {
    public static void main(String[] args) {
        if(args.length == 0){
			System.out.println("No Values");
        }
        else{
         for (String i : args ) {
                System.out.print( i + ",");   
			}
            System.out.println();
        for (int i = 0; i < args.length -1 ; i++) {
            System.out.print(args[i] + ",");
        }
        System.out.print(args[args.length -1]);
    }
}
}
