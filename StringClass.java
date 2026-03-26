

class StringClass{
    public static void main(String[] args) {
        String s1 = "Hello Java GoodMorning";
        String s2 = new String(" hello Java");
     /*   System.out.print(s1); 
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.contentEquals(s2)); // compares content of two strings */

        

      /*  for(int i=s1.length()-1; i>=0; i--){
            System.out.print(s1.charAt(i));
        }
        int count = 0;
        for(int i=0;i<=s1.length()-1;i++){
            System.out.println(s1.charAt(i));  
            int character = s1.charAt(i);
            if(character=='a' || character=='e' || character=='i' || character=='o' || character=='u' || character=='A' || character=='E' || character=='I' || character=='O' || character=='U'){
               count++;
            }
        }
        System.out.println("Total vowels: " + count);

         int countword = s1.split("\\s").length;
         System.out.println("Total words: " + countword); */



         StringBuffer Name = new StringBuffer("Java");
         Name.append(" Programming");
            System.out.println(Name);
    }
}