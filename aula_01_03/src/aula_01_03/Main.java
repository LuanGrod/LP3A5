package aula_01_03;

public class Main {

	static int count = 0;
	
	static synchronized void increment() {
		count++;
	}
	
	static synchronized void decrement() {
		count--;
	}
	
	public static void main(String[] args) {
		

		
		Thread inc1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                	increment();
                }
            }
        });
		
		Thread inc2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                	increment();
                }
            }
        });
		
		Thread dec1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                	decrement();
                }
            }
        });	
		
		Thread dec2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                	decrement();
                }
            }
        });
		
		inc1.start();
        dec1.start();		
		inc2.start();
        dec2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println(count);
        
	}

}
