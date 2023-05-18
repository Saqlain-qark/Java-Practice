class Q5 {
    public static void main(String[] args) {
        char c = 'A';
        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
            System.out.println("It is a character");
        }
        else if(c>='0'){
            System.out.println("It is a digit");
        }
        else{
            System.out.println("It is a special character");
        }
    }
}
