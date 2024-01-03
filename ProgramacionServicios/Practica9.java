public class Practica9 {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread(5, 10);
        sumThread.start();

        try {
            sumThread.join();
            int result = sumThread.getResult();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SumThread extends Thread {
    private int sumaOne;
    private int sumaTwo;
    private int result;

    public SumThread(int sumaOne, int sumaTwo) {
        this.sumaOne = sumaOne;
        this.sumaTwo = sumaTwo;
    }

    @Override
    public void run() {
        result = sumaOne + sumaTwo;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getResult() {
        return result;
    }
}