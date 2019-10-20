class Main {


    public static void main(String[] args) {
        String str="cat";
        public String backAround(String str) {
            String front,back;

            if(str.length()>=1)
            {
                front=str.substring(str.length()-1);
                back=str.substring(str.length()-1);
            }
            return front+str+back;
        }


    }

}
