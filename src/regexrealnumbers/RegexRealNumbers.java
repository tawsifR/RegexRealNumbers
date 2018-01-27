    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package regexrealnumbers;

    /**
     *
     * @author TawsifR
     */
    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.util.regex.Pattern;
    import java.util.regex.Matcher;
    import java.io.FileNotFoundException;
    public class RegexRealNumbers {

        /**
         * @param args the command line arguments
         */

        public static void main(String[] args) {
            // TODO code application logic here
            try{
            String regex="[+-]?\\d+(?:\\.\\d+)?";
            Pattern p=Pattern.compile(regex);
            
            BufferedReader br = new BufferedReader(new FileReader ("C:\\Users\\TawsifR\\Desktop\\regexRealNumbers\\src\\regexrealnumbers\\input.txt"));
            String line;
            while(null!=(line=br.readLine())){   
            Matcher m=p.matcher(line);
            System.out.println(line);
                if(m.matches()){
                    System.out.println("Accept");
                }else{
                    System.out.println("Reject");
                }
            }
            }catch(Exception e){
            }
        }
    }
    
