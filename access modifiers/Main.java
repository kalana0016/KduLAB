public class Main {
    public static void main(String[]args){
        AccessModifiersDemo AMD = new AccessModifiersDemo();
        AMD.privateVar = 10;
        AMD.defaultVar = 3.14;
        AMD.protectedVar = true;
        AMD.publicVar = "Hello world!";
    
        System.out.println("Private Variable: " + AMD.getPrivateVar());
        System.out.println("Default Variable: " + AMD.getDefaultVar());
        System.out.println("Protected Variable: " + AMD.getProtectedVar());
        System.out.println("Public Variable: " + AMD.getPublicVar());
        
        SubclassDemo SD = new SubclassDemo();
        SD.displayProtectedVar();
    }
}
