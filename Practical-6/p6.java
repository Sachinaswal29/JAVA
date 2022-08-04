class Str{ 
public static void main(String args[]){
    String s="Java";
    System.out.println("String after concatenation="+s.concat("Welcome"));      
    System.out.println("Character at index 1="+s.charAt(1));                       
    System.out.println("Index of first a="+s.indexOf('a'));                      
    System.out.println("Index of second a="+s.indexOf(('a'),s.indexOf('a')+1));
    System.out.println(s.compareTo("JAVA"));                                     
    System.out.println(s.equalsIgnoreCase("JAVA"));                              
    System.out.println("last occurence index of a="+s.lastIndexOf('a'));           
    }
}
