package Chapter16.inner.practice;

public class MyPage {
    InputBox inputBox;
    public static void main(String[] args) {
        MyPage myPage = new MyPage();
        myPage.setUI();
        myPage.pressKey();
    }
    public void setUI() {
        inputBox = new InputBox();
        KeyEventListener listener = new KeyEventListener() {
            @Override
            public void onKeyDown() {
                System.out.println("KEY DOWN");
            }

            @Override
            public void onKeyUp() {
                System.out.println("KEY UP");
            }
        };
        inputBox.setListener(listener);
    }
    public void pressKey() {
        inputBox.listenerCalled(InputBox.KEY_DOWN);
        inputBox.listenerCalled(InputBox.KEY_UP);
    }
}
