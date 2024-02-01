public class VariableTypes{
    String name; // ----> instance variable
    int id; // ----> instance variable

    static String universityName; // ----> static/class variable

    VariableTypes(String n, int i) // ----> Local variable
    {
        name = n;
        id = i;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("University : "+universityName);
    }
    
    public static void main(String[] args) {
        VariableTypes ob = new VariableTypes("Hamim Talukdar", 5369);
        ob.universityName = "DIU";

        ob.display();
    }
}