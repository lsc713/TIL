package org.example;

import org.example.case2.*;
import org.example.case3.Calculator3;

public class Main {
    public static void main(String[] args) {
        /**
         * Calculator1의 경우. 추가적인 연산자가 있다면 메서드의 코드를 하나하나 수정해줘야함.
         *
         */
        Calculator1 c = new Calculator1();
        System.out.println(c.calculate("-", 20, 10));

        /**
         * calculator2의 경우, 관련클래스 생성 및 참조변수를 통해 분리 후 실제 메서드가 간단하면서 가시성이 개선됨.
         */


        Calculator2 c2 = new Calculator2(new AddOperation(), new SubstractOperation(), new MultiplyOperation(), new DivideOperation());
        c2.calculate("+",10,10);


        /**
         * 추상클래스의 생성과 상속을 통해 실제 메서드를 오버라이딩을통해 구현하며
         *
         * 실제 계산기 클래스에는 추상클래스만두고 상속을 통해 하위의 실제 메서드를 호출하며 세팅을통해 쉽게 갈아 낄 수 있다.
         *
         * 자동형변환에의해서 case3.calculator3에서 생성자 파라미터에 대한 인스턴스를 생성할때 하위 클래스로 생성해서
         * 하위 메서드를 가져다 쓸 수 있어서 이게 된다.
         */
        Calculator3 c3 = new Calculator3(new org.example.case3.AddOperation());
        System.out.println(c3.calculate(10, 20));
        c3.setOperate(new org.example.case3.SubstractOperation());
        System.out.println(c3.calculate(20, 10));

    }
}
