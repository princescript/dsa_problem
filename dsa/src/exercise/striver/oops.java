package exercise.striver;

public class oops {
    public static void main(String[] args) {
    Customer customer = new Customer();
    customer.set_firstName("Prince");
    customer.set_LastName("singh");
    customer.set_id(22);
        System.out.println(customer.get_firstName() + customer.get_LastName() + customer.get_id());
        //princesingh22
    }
}
 class Customer{
     private int _id;
     private String _firstName;
     private String _LastName;

     public int get_id() {
         return _id;
     }

     public void set_id(int _id) {
         this._id = _id;
     }

     public String get_firstName() {
         return _firstName;
     }

     public void set_firstName(String _firstName) {
         this._firstName = _firstName;
     }

     public String get_LastName() {
         return _LastName;
     }

     public void set_LastName(String _LastName) {
         this._LastName = _LastName;
     }


}
