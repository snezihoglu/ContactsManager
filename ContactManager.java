public class ContactManager {
    public static void main(String[] args) {
        ContactsManager ContactManager = new ContactsManager();

        Contact friend1 = new Contact("Frank", "02948573456");
        ContactManager.addContact(friend1);

        Contact friend2=new Contact("Isla", "09782345678");
        ContactManager.addContact(friend2);

        Contact friend3=new Contact("Liam", "02123434242");
        ContactManager.addContact(friend3);

        System.out.print(ContactManager.searchContact(friend2));
    }
}

class ContactsManager {
    Contact [] myFriends;
    private int indexOfContacts;

    ContactsManager(){
        myFriends = new Contact[10];
        indexOfContacts=0;
    }

    public void addContact(Contact contact){
        myFriends[indexOfContacts]=contact;
        indexOfContacts++;
    }
    public String searchContact(Contact contact){
        for(int i=0; i<indexOfContacts; i++){
            if(myFriends[i].equals(contact)){
                return "Phone number of the searched contact is: " + myFriends[i].getPhoneNumber();
            }
        }
        return null;
    }

    class Contact{
        private String name;
        private String phoneNumber;

        public Contact(String name, String phoneNumber){
            this.name=name;
            this.phoneNumber=phoneNumber;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

}