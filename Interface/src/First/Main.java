package First;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================");
        deskPhone();
        System.out.println("=====================");
        mobilePhone();

    }
    public static void deskPhone(){
        ITelephone timsPhone;

        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

    }
    public static void mobilePhone(){
        ITelephone timsPhone;
        timsPhone = new MobilePhone(24565);
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();
    }
}
