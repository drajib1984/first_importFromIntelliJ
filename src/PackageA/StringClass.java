package PackageA;

import java.util.Locale;

public class StringClass {

    public static void main(String[] args) {
//        String s = new String("Rajib");
//        String s1 = new String("Rajib");
//        s1=s1.concat(" Das");
//        System.out.println(s1);
//        String s2 = "Rajib";
//        String s3 = "Rajib";
//        String s4 = "Rajib";
//        s4.concat(" das");
//        System.out.println(s1==s2);
//        System.out.println(s2==s3);
//        System.out.println(s4);
//        String s5 = new String("Rajib"); // this syntax isn't encouraged
//        String s6 = "kitten";
//        String s7 = s.toLowerCase();
//        System.out.println(s7);
//        System.out.println(s6.indexOf(1));
//        System.out.println(s6.charAt(5));
//
//        int a= 5;
//        String s8 = Integer.toString(a);
//        String s9= "s8";
//        System.out.println(s9);
//
//        StringBuffer aa = new StringBuffer();
//        System.out.println(aa.capacity());
//
//        StringBuffer dd = new StringBuffer(1000);
//        System.out.println(dd.capacity());
//
//        StringBuffer bb= new StringBuffer("deepak");
//        System.out.println(bb.capacity());
//        System.out.println(bb.length());
//        System.out.println(bb.append(" panwar"));
//        System.out.println(bb.charAt(8));
//        System.out.println(bb.delete(2,9));
//        System.out.println(bb.deleteCharAt(5));

//        StringBuffer gg = new StringBuffer("RAJIB");
//        StringBuffer hh = new StringBuffer("RAJIB");
//        System.out.println(gg.equals(hh));
//        StringBuffer ii = gg.append(" DAS");
//        System.out.println(gg.equals(ii));
//        System.out.println(gg.insert(3,"ssss"));
//        System.out.println(gg.insert(3,"sssssss"));
//        System.out.println(gg.replace(3,14,""));
//        System.out.println(gg.reverse());
//        gg.setCharAt(3,'f');


//        StringBuffer cc= new StringBuffer("deepak sharma");
//        System.out.println(cc.capacity());



//
//
//        StringBuilder zz= new StringBuilder("deepak");
//        String ss = new String(zz);
//        System.out.println(ss);
//
//        char[] gh = {'r','a','j','i','b'};
//        String gd = new String(gh);
//        System.out.println(gd);
//
//
//        zz.append(" Rajib");
//        zz.append(" das");
//        System.out.println(zz);

//        String name = "  rajib   ";
//        String email = "drajib1984@gmail.com";
//        String password = "abcd1234";
//        System.out.println(name.length());
//        System.out.println(name);
//        System.out.println(name.isEmpty());
//        System.out.println(name.trim());
//        System.out.println(email.length());
//        System.out.println(password.length());
//        int i = name.length();
//        if(i==0){
//            System.out.println("The name is empty");
//        } else
//        System.out.println("The name is valid");
//
//        boolean b = name.isEmpty();
//        if(b==true){
//            System.out.println("the name is empty");
//
//        }
//        else
//            System.out.println("the name is valid");
//        if(name.trim().length()==0){
//            System.out.println("the name is invalid");
//        }
//        else {
//            System.out.println("The name is valid");
//        }
//        if(name.trim().isEmpty()){
//            System.out.println("The name is empty");
//
//        }
//        else{
//            System.out.println("The name is valid");
//        }
//        if(name.trim().length()==0){
//            System.out.println("the name is empty");
//        }
//        else{
//            System.out.println("The name is valid");
//        }

//        String s1 = "RAJIB";
//        String s2 = "rajib";
//        String s3 = "Deepak";
//        String s4 = "";
//        String s5 = "Das";
//        String s6 = "this is a demo example";

//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s1.equals(s3));
//        System.out.println(s4.equals(""));
//
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s1.compareToIgnoreCase(s2));
//        System.out.println(s1.compareToIgnoreCase(s4));
//
//        System.out.println(s1+s5);
//        System.out.println(s1+s5+10);
//        System.out.println(10+20+s1+10+20+s5+10+20);
//        System.out.println(s1+s5+10/2);
//        System.out.println(s1+s5+10*2);
//        System.out.println(s1.concat(s5));
//        System.out.println(String.join(" $$ ",s1,s5,s2,s3,s4));
//
//        System.out.println(s6.subSequence(3,21));
//        System.out.println(s6.subSequence(0,22));
//
//        System.out.println(s6.substring(2));
//        System.out.println(s6.substring(3,22));

//        System.out.println(s6.replace("is","was"));
//        System.out.println(s6.replaceFirst("is","was"));
//        System.out.println(s6.replaceAll("is","was"));
//        System.out.println(s6.replaceAll("is(.)","was"));
//        System.out.println(s6.replaceAll("is(.*)","was"));

//        System.out.println(s3.indexOf("e"));
//        System.out.println(s3.lastIndexOf("e"));
//        System.out.println(s3.charAt(5));
//        System.out.println(s3.contains("pak"));
//        System.out.println(s3.contains("depa"));
//        System.out.println(s3.startsWith("D"));
//        System.out.println(s3.startsWith("d"));
//        System.out.println(s3.startsWith("Dee"));
//        System.out.println(s3.endsWith("iak"));
//        System.out.println(s3.endsWith("pak"));

//        System.out.println(s1.toLowerCase());
//        System.out.println(s2.toUpperCase());
//
//        int a = 100;
//        int b = 50;
//        System.out.println(a+b);
//        String s7 = String.valueOf(a);
//        String s8 = String.valueOf(b);
//        System.out.println(s7+s8);
//        char[] c = s1.toCharArray();
//        System.out.println(c);

// Reverse a String & check if its a palindrome
          String s1 = "rajib";
          String s2 = String.valueOf(s1.charAt(s1.length()-1));
        System.out.println(s2);
//          String rev= "";
//          for(int i = s1.length()-1;i>=0;i--){
//              rev=rev+s1.charAt(i);
//          }
//        System.out.println(rev);
//          if(s1.equals(rev)){
//              System.out.println("Its palindrome");
//          }
//          else
//              System.out.println("Its NOT a palindrome");
//        System.out.println(s1.toUpperCase());



        int x = 5;
        int y = 10;
        int z = Math.abs(x-y);
        System.out.println(z);

    }
}

