package basicExamples;

public class CallbackTest {

    public interface ButtonClickHandler {
        public void buttonClicked();
    }

    public class TVbuttonClickHandler implements ButtonClickHandler {

        boolean state;

        public TVbuttonClickHandler() {
            state = false;
        }
        @Override
        public void buttonClicked() {
               state = !state;
               if (state) {
                   System.out.println("TV on");
               }
               else System.out.println("TV off");
        }
    }

    public class PrinterClickHandler implements ButtonClickHandler {
        @Override
        public void buttonClicked() {
            System.out.println("Printing...........");
        }
    }

    public class Button{
        ButtonClickHandler h;

        public Button(ButtonClickHandler h){
            this.h = h;
        }

        public void click(){
            h.buttonClicked();
        }
    }

   /* public static void main(String[] args) {
        CallbackTest.Button a = new CallbackTest().new Button(new CallbackTest().new TVbuttonClickHandler());
        a.click();
        a.click();

        CallbackTest.Button b = new CallbackTest().new Button(new CallbackTest.ButtonClickHandler(){
            @Override
            public void buttonClicked() {
                System.out.println("B button is clicked!");
            }
        });

        b.click();

        CallbackTest.Button c = new CallbackTest().new Button(new CallbackTest().new PrinterClickHandler());

        c.click();
    }*/


}
