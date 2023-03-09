public class TelevisionTest {
    public static void main(String[] args) {
        Television myTv = new Television();
        myTv.channel = 7;
        myTv.volume = 9;
        myTv.onOff = true;
        myTv.setChannel(16);
        myTv.print();

        int ch = myTv.getChannel();
        
        Television yourTv = new Television();
        yourTv.channel = 9;
        yourTv.volume = 12;
        yourTv.onOff = true;
        yourTv.print();
        

    }
}