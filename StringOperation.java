public class StringOperation {
    

    public static void main(String[] args)
    {
    //  String str="ABC";
     StringBuilder sb= new StringBuilder(" ello this is section A");
     sb.reverse();
     System.out.println(sb);
     sb.append("h");
     System.out.println(sb);
     sb.insert(0,"h");
     System.out.println(sb);
     sb.insert(0,"h");
     System.out.println(sb);
     sb.delete(1,2);
     System.out.println(sb);
     sb.replace(2,4,"h");
     System.out.println(sb);


    //  StringBuilder sb= new StringBuilder(" hello this is section A");
    //  sb.setCharAt(0, 'H');
    //  System.out.println(sb);






    //  sb.insert(0,"This is section A ++++++++");
    //  System.out.println(sb.capacity());
    //  sb.insert(0,"This is section A +++++++++++++");
    //  System.out.println(sb);











































    //     // 1. Write a Java program to input a String and demonstrate length(), charAt(), concat(), toUpperCase(), and toLowerCase() methods.
    //     String str1="This is Programming Class";
    //     System.out.println(str1.length());
    //     System.out.println(str1.charAt(5));
    //     System.out.println(str1.concat(" and Section A"));
    //     System.out.println(str1.toUpperCase());
    //     System.out.println(str1.toLowerCase());
    //     System.out.println("---------------------------------------------------");
    //     System.out.println();

    //     // // 2. Write a Java program to input two Strings and demonstrate equals(), equalsIgnoreCase(), compareTo(), and compareToIgnoreCase() methods.
    //     String str2="This is Programming Class";
    //     String str3="This is";
    //     System.out.println("Equals: " + str2.equals(str3));
    //     System.out.println("Equals (ignore case): " + str2.equalsIgnoreCase(str3));
    //     System.out.println("Compare To: " + str2.compareTo(str3));
    //     System.out.println("Compare To (ignore case): " + str2.compareToIgnoreCase(str3));
    //     System.out.println("---------------------------------------------------");
    //     System.out.println();
    //     // // 3. Write a Java program to input a String and check whether it contains a given word, starts with a given character/string, and ends with a given character/string using contains(), startsWith(), and endsWith().
    //     System.out.println("Contains: " + str2.contains("Programming"));
    //     System.out.println("Starts With: " + str2.startsWith("This"));
    //     System.out.println("Ends With: " + str2.endsWith("Classrooms"));
    //     // 4. Write a Java program to input a String and find the first and last occurrence of a given character using indexOf() and lastIndexOf(), then extract a part of the String using substring().
    //     System.out.println(str3.indexOf("i"));
    //     System.out.println(str3.lastIndexOf("s"));
    //     // 5. Write a Java program to input a String and remove/repl​ace specific characters or words using replace() and replaceAll(), remove extra spaces using trim(), check whether the String is empty or blank using isEmpty() and isBlank(), and split the String into words using split().
    //     System.out.println(str2.replace(" ", "-"));
    //     System.out.println(str2.replaceAll(" ", "-")); 
    //     System.out.println(str2.isEmpty()); 
    //     System.out.println(str2.isBlank()); 
    //    String Game="Cricket, Baskeball, Hocky, Football";
    //         String[] games =Game.split(",");
    //         for(String game: games){
    //             System.out.println(game);
    //     }







    // //    String str1="hello";
    // //    String str2="Hello";
    // //    System.out.println("First str1: "+Integer.toHexString(System.identityHashCode(str1)));
    // //    System.out.println("First str2: "+Integer.toHexString(System.identityHashCode(str2))); 

    // //    System.out.println("Equal case ignore: ");
    // //    System.out.println(str1.equalsIgnoreCase(str2));

    // //    System.out.println("Equal: ");
    // //    System.out.println(str1.equals(str2));

    // //    String str3=new String("hello");
    // //    String str4=new String("Hello");

    // //    System.out.println("Comparison address: ");
    // //    System.out.println(str3==str4); 
    // //    System.out.println(str3.length()); 
    // //    System.out.println(str3.indexOf("e")); 
    //    System.out.println(str3.charAt(1)); 
    //    System.out.println(("Aditya").length()); 
    //    System.out.println(str3.concat(str4)); 

        //   String str1="A"; // A=65
        //   String str2="a"; //a=97
        //   System.out.println(str1.compareTo(str2));
        //   System.out.println(str1.compareToIgnoreCase(str2));

        //   String str1="This is section A"; // A=65
        //     String str2="is"; //a=97
        //     System.out.print("(Contains: This is section A and is) ");System.out.println(str1.contains("A"));
        //     System.out.print("(Concat: This is section A and is)  ");System.out.println(str1.concat(" A"));
        //     System.out.print("(ToLower: This is section A and is) ");System.out.println(str1.toLowerCase());
        //     System.out.print("(ToUpper: This is section A and is) "); System.out.println(str1.toUpperCase());
        //     System.out.print("(StartsWith: This is section A and is) ");System.out.println(str1.startsWith("T"));
        //     System.out.print("(EndsWith: This is section A and is) ");System.out.println(str1.endsWith("A"));
        //     System.out.print("(Replace: This is section A and is) ");System.out.println(str1.replace("A","B"));

        //     String Game="Cricket, Baskeball, Hocky, Football";
        //     String[] games =Game.split(",");
        //     for(String game: games){
        //         System.out.println(game);
        //     }






    }
}
