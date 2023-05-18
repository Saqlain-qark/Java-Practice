class Q13 {
    public static void main(String[] args) {
        boolean isPrime =true;
        for (int j=10; j < 100; j++) {
            isPrime = true;
            for(int i = 2; i <= j/2; i++){
                if(j % i == 0){
                    isPrime = false;
                    break;
                }
                }
                if(isPrime){
                    System.out.printf(j+" ");
                }
        }
    }
} 