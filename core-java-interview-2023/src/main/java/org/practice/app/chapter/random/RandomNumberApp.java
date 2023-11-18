package org.practice.app.chapter.random;

import java.util.Random;

public interface RandomNumberApp {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt();
        long l = random.nextLong();
        float f = random.nextFloat();
        double d = random.nextDouble();
        boolean bl = random.nextBoolean();

        System.out.println("int : "+i);
        System.out.println("long : "+l);
        System.out.println("float : "+f);
        System.out.println("double : "+d);
        System.out.println("boolean : "+bl);

        int num = random.nextInt(1); // 1 to 99
        System.out.println("num = "+num);


    }
}
