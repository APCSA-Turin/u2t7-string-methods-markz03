public class StringRunner {
    public static void main(String[] args) {
            CustomStringMethods methods = new CustomStringMethods();
            boolean bool = methods.longerThan("apple", 4);
            System.out.println(bool);
            bool = methods.longerThan("apple", 5);
            System.out.println(bool);
            bool = methods.longerThan("apple", 2);
            System.out.println(bool);
            bool = methods.longerThan("apple", 7);
            System.out.println(bool);

            
                
            }
        }
        
